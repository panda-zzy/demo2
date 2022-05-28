package com.example.demo.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.BaseDao;
import com.example.demo.pojo.entity.BaseEntity;
import com.example.demo.service.BaseService;
import java.util.Collection;

/**
 * @author jingguoshuai
 * @version 1.0
 * @date 2021/7/26 10:41
 */
public class BaseServiceImpl<M extends BaseDao<T>, T extends BaseEntity> extends ServiceImpl<M, T> implements BaseService<T> {

    @Override
    public boolean insert(T entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<T> entityList) {
        return false;
    }
}
