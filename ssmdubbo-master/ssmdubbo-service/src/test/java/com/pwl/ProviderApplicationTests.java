package com.pwl;

import com.pwl.dao.UserDao;
import com.pwl.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProviderApplicationTests {


    @Resource
    private UserDao userDao;

    @Test
    public void contextLoads() {
    }



    @Test
    public void testqueryAll(){

        for (User l: userDao.queryAll()
             ) {
            System.out.println(l);
        }

    }
}
