package com.pwl.entity;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private int id;
    private String name;
    private String age;
    private String password;

    public void setId( int id ) {
        this.id = id;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setAge( String age ) {
        this.age = age;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
}
