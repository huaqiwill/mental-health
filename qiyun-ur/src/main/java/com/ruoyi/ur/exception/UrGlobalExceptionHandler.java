package com.ruoyi.ur.exception;

import com.ruoyi.ur.common.ApiResult;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.sql.SQLIntegrityConstraintViolationException;

@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class UrGlobalExceptionHandler {

    @ExceptionHandler(TransactionSystemException.class)
    public ResponseEntity<ApiResult<?>> handleTransactionException(TransactionSystemException ex) {
        Throwable rootCause = ex.getRootCause();
        if(rootCause instanceof DataIntegrityViolationException) {
            return handleDataIntegrityViolation((DataIntegrityViolationException) rootCause);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ApiResult.error("事务处理失败"));
    }

    // 处理数据完整性异常
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ApiResult<?>> handleDataIntegrityViolation(DataIntegrityViolationException ex) {
        Throwable cause = ex.getCause();
        if(cause instanceof SQLIntegrityConstraintViolationException) {
            String constraintName = ((SQLIntegrityConstraintViolationException) cause).getMessage();
            if(constraintName.contains("ur_appointment_ibfk_1")) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body(ApiResult.error("预约失败：用户或咨询师不存在"));
            }
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ApiResult.error("数据完整性校验失败"));
    }

    
}