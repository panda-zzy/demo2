package com.example.ssmp_demo.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.ssmp_demo.dao.BaseDao;
import com.example.ssmp_demo.pojo.entity.BaseEntity;
import com.example.ssmp_demo.service.BaseService;

/**
 * @author jingguoshuai
 * @version 1.0
 * @date 2021/7/26 10:41
 */
public class BaseServiceImpl<M extends BaseDao<T>, T extends BaseEntity> extends ServiceImpl<M, T> implements BaseService<T> {

}
