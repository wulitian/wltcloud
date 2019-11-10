package com.wltcloud.rabbitmq.server.entity;


import java.io.Serializable;

/**
 * 功能：《user实体类》
 * 备注：user实体类包括用户名密码
 */
public class User implements Serializable{

    private String name;
    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
