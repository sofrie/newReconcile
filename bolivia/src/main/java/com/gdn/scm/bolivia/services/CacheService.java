/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
public class CacheService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public Integer counter = 0;

    public Boolean setIfAbsent(String key, String value, long timeout, TimeUnit timeUnit) {
        if (redisTemplate.opsForValue().setIfAbsent(key, value)) {
            redisTemplate.expire(key, timeout, timeUnit);
            return new Boolean(true);
        }
        return new Boolean(false);
    }

    public Boolean setIfAbsent(String key, String value) {
        return redisTemplate.opsForValue().setIfAbsent(key, value);
    }

    public Boolean setIfAbsent(String key) {
        return redisTemplate.opsForValue().setIfAbsent(key, key);
    }

    public void delete(String key) {
        redisTemplate.delete(key);
        counter++;
    }
}
