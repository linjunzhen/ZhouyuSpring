package com.zhouyu.service;

import com.zhouyu.spring.ZhouyuApplicationContext;

/**
 * @author linjunzhen
 * @version 1.0
 * @date 2022/4/11 14:54
 */
public class Test {

    public static void main(String[] args) {

        ZhouyuApplicationContext applicationContext = new ZhouyuApplicationContext(AppConfig.class);
        UserInterface userService = (UserInterface)applicationContext.getBean("userService");
        userService.test();
    }
}
