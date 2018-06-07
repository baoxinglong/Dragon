package com.my.service;

import com.my.dao.UserRepositoty;
import com.my.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class UserService {

    @Autowired
    private UserRepositoty userRepositoty;

    @Autowired
    private RedisTemplate redisTemplate;

    public User findUserByName(String name){
        String key = "user_"+name;

        ValueOperations<String,User> operations = redisTemplate.opsForValue();

        boolean  hasKey = redisTemplate.hasKey(key);
        User user = null;
        //缓存存在
        if(hasKey){
            long startTime = System.currentTimeMillis();
            System.out.println("==========从缓存中获得数据=========");
            user = operations.get(key);
            System.out.println(user.getName());
            long endTime = System.currentTimeMillis();
            System.out.println("=============================="+ (endTime - startTime) + "ms");
            return user;
        }else{
            long startTime = System.currentTimeMillis();
            System.out.println("==========从数据表中获得数据=========");
            user = userRepositoty.findByUserName(name);
            System.out.println(user.getName());
            long endTime = System.currentTimeMillis();
            System.out.println("=============================="+ (endTime - startTime) + "ms");
            //插入缓存
            operations.set(key, user,5, TimeUnit.MINUTES);
            return user;
        }

    }
}
