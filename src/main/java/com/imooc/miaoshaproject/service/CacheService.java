package com.imooc.miaoshaproject.service;

/**
 * 封装本地缓存操作类
 *
 * @author HuHong
 * @date 2021/7/13
 */
public interface CacheService {
    //存方法

    void setCommonCache(String key, Object value);

    // 取方法

    Object getFromCommonCache(String key);
}
