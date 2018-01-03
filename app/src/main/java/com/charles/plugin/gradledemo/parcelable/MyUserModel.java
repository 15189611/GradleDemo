package com.charles.plugin.gradledemo.parcelable;

import java.io.Serializable;

/**
 * @author 17111980
 * @date 2018/1/3.
 */


public class MyUserModel implements Serializable {
    private static final long serialVersionUID  = 5852078463222747168L;

    private String name1;
    private int age;

    public MyUserModel(String name, int age) {
        this.name1 = name;
        this.age = age;
    }

    public String getName() {
        return name1;
    }

    public void setName(String name) {
        this.name1 = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
