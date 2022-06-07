package com.example.ssmp_demo;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.ssmp_demo.dao.UserDao;
import com.example.ssmp_demo.entity.User;
import com.example.ssmp_demo.service.UserService;
import com.example.ssmp_demo.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 今天的问题就是应
 */
@SpringBootTest
class SsmpDemoApplicationTests {
    @Autowired
    public UserDao userDao;
    @Autowired
    public UserService userService;

    @Test
    void contextLoads() {
//        userService = new UserServiceImpl();
//
//        QueryWrapper queryWrapper = new QueryWrapper();
//        queryWrapper.eq("id","1");
//        User user = userDao.selectOne(queryWrapper);
        User user = userDao.selectById(1);
        System.out.println(user);
    }
//    @Test
//    void testSelect() {
//        IPage<User> iPage = new Page<>();
//        iPage.setCurrent(1);
//        iPage.setSize(3);
//
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.select("name","age","pwd");
//        queryWrapper.like("name","z")
//                .and(i->i.ge("age","11").le("age","30"))
//                .orderByAsc("age");
////        List<User> users = userDao.selectList(queryWrapper);
//        IPage<User> iPage1 = userDao.selectPage(iPage, queryWrapper);
//        List<User> users = iPage1.getRecords();
//        long total = iPage1.getTotal();
//        users.forEach(System.out::println);
//        System.out.println(total);
//
//    }
    @Test
    void testInsert() {
        User user = new User();
        user.setAge(26);
        user.setEmail("123456@qq.com");
        user.setName("zzy");
        user.setGender("男");
        userDao.insert(user);
        System.out.println(user.getId());

    }
    @Test
    void testUpdate() {
        User user = new User();
        user.setId("11");
        user.setPwd("888888");
        userDao.updateById(user);
        System.out.println(user.getId());
    }
    @Test
    void testDelete() {
        User user = new User();
        user.setId("15");
        userDao.deleteById(user);
    }

}
