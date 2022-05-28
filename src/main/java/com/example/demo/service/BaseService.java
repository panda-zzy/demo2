package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;

import java.io.Serializable;
import java.util.Collection;

public interface BaseService<T> extends IService<T> {
    /**
     * 插入新数据
     *
     * @param entity
     * @return
     */
    boolean insert(T entity);

    @Override
    boolean saveBatch(Collection<T> entityList);

    /**
     * 根据ID删除
     * @param id
     * @return
     */
    @Override
    boolean removeById(Serializable id);
}
