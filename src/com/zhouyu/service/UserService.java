package com.zhouyu.service;

import com.zhouyu.spring.Autowired;
import com.zhouyu.spring.BeanNameAware;
import com.zhouyu.spring.Component;
import com.zhouyu.spring.InitializingBean;

/**
 * @author linjunzhen
 * @version 1.0
 * @date 2022/4/11 15:12
 */
@Component
//@Scope("prototype") //多例
public class UserService implements BeanNameAware , InitializingBean ,UserInterface{

    @Autowired
    private OrderService orderService;

    private String beanName;

    @Override
    public void test(){
        System.out.println(orderService);
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("初始化方法");
    }
}
