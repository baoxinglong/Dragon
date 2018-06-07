package com.my.serviceimpl;

import com.my.service.TestService;

public class ServiceImpl implements TestService {
    @Override
    public String sayHello(String str) {
        return "hello word dubbo-provider2222:"+str;
    }
}
