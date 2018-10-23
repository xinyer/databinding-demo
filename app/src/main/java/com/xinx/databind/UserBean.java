package com.xinx.databind;

public class UserBean {

    private String name;

    public UserBean() {

    }

    public UserBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
