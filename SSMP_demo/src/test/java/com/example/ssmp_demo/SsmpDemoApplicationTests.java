package com.example.ssmp_demo;



import com.example.ssmp_demo.dao.UserDao;
import com.example.ssmp_demo.pojo.entity.User;

import com.example.ssmp_demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 今天的问题就是应
 */
@SpringBootTest
class SsmpDemoApplicationTests {
    @Autowired
    public UserDao userDao;
    @Autowired
    public UserService userService;


    /**
     * 测试JDBCType属性和java属性的对应关系
     */
    @Test
    void testTest(){

    }

    @Test
    void contextLoads() {

        User user = userDao.selectById(16);
        Date date = user.getCreateTime();

        String format = new SimpleDateFormat("yy-MM-dd").format(date);

        System.out.println("日期转字符串：" + format);

        System.out.printf("全部日期和时间信息：%tc%n",date);                // 格式化输出日期或时间

        System.out.printf("年-月-日格式：%tF%n",date);

        System.out.printf("月/日/年格式：%tD%n",date);

        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);

        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);

        System.out.printf("HH:MM格式（24时制）：%tR",date);

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
