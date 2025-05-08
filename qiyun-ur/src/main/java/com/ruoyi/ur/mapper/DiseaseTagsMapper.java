package com.ruoyi.ur.mapper;

import com.ruoyi.ur.domain.entity.diseaseTags;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiseaseTagsMapper {
    List<diseaseTags> selectAll();
}
