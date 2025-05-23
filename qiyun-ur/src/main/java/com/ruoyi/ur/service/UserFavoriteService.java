package com.ruoyi.ur.service;

import com.ruoyi.ur.domain.entity.UserFavorite;
import java.util.List;
import java.util.Map;

public interface UserFavoriteService {
    boolean addFavorite(UserFavorite userFavorite);
    boolean removeFavorite(String id);
    Map<String, Object> getCounselorFavorites(String userId,String type, Integer page, Integer pageSize);
    boolean isItemFavorited(String userId, String itemId, String itemType);
}