package com.itheima.service.impl;

import com.itheima.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "张三";
    }
    public void init(){
        System.out.println("Impl对象创建了");
    }
    public void destroy(){
        System.out.println("Impl对象被销毁了");
    }
}
