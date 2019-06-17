package com.pwl;


import com.pwl.entity.User;

import java.util.List;

public interface UserService {
    String sayHello(String name);

    List<User> queryAll();

}
