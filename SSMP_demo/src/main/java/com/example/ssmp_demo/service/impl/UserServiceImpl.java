package com.example.ssmp_demo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.ssmp_demo.dao.UserDao;
import com.example.ssmp_demo.pojo.entity.User;
import com.example.ssmp_demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Panda
 * @create 2022-28-16:51
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
