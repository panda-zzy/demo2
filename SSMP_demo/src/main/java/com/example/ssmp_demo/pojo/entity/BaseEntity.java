package com.example.ssmp_demo.pojo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class BaseEntity<T extends Model> extends Model {
    /**
     * 初始化乐观锁版本
     */
    private static final Integer INIT_MP_VERSION = 0;
    /**
     * 主键
     */
    @TableId(value = "uid",type = IdType.AUTO)
    protected String id;

    @Version
    protected int version;

    @TableLogic(value = "0",delval = "1")
    protected int delFlag;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)

    protected Date createTime;
    /**
     * 创建人
     */
    @TableField(value = "creater_id", fill = FieldFill.INSERT)
    protected String createrId;
    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    protected Date updateTime;
    /**
     * 最后修改者
     */
    @TableField(value = "modifier_id", fill = FieldFill.INSERT_UPDATE)
    protected String modifierId;


    public BaseEntity() {
    }



    @Override
    public Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this);
    }

}
