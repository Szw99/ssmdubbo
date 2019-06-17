package com.pwl.serviceimpl;


import com.pwl.UserService;
import com.pwl.dao.UserDao;
import com.pwl.entity.User;
import org.springframework.stereotype.Component;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;


@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public String sayHello(String name) {
        return name;
    }

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

}
