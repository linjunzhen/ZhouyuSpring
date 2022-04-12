package com.zhouyu.spring;

/**
 * @author linjunzhen
 * @version 1.0
 * @date 2022/4/11 16:16
 */
public class BeanDefinition {

    private Class type;
    private String scope;

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
