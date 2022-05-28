package com.example.demo.pojo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
    @TableId(value = "id",type = IdType.INPUT)
    protected String id;
    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    protected Date createTime;
    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    protected Date updateTime;
    /**
     * 创建人
     */
    @TableField(value = "creater_id", fill = FieldFill.INSERT)
    protected String createrId;
    /**
     * 最后修改者
     */
    @TableField(value = "modifier_id", fill = FieldFill.UPDATE)
    protected String modifierId;

    /**
     * 创建人
     */
    @TableField(value = "creater_name", fill = FieldFill.INSERT)
    protected String createrName;
    /**
     * 最后修改者
     */
    @TableField(value = "modifier_name", fill = FieldFill.UPDATE)
    protected String modifierName;

    /**
     * 是否删除
     */
/*    @TableField(value = "del_flag",fill=FieldFill.INSERT)
    @TableLogic(delval = "1", value = "0")
    protected Short delFlag;*/

    public BaseEntity() {
    }

    /**
     * 新增时初始化基础参数,此方法会将实体中（创建时间、乐观锁版本号、有效标识）为空的字段设置默认值
     * <br/>
     * 创建时间     当前系统时间
     * <br/>
     * 乐观锁版本号  0
     * <br/>
     * 有效标识     "1"
     *
     * @param entity 实体数据
     * @param <E>    实体类型
     */
    public static <E extends BaseEntity> void initBaseFields(E entity) {
        if (entity == null) {
            return;
        }
        if (entity.getCreateTime() == null) {
            entity.setCreateTime(new Date());
        }
        /*if (entity.getDelFlag() == null) {
            entity.setDelFlag(YnEnum.YES.getValue());
        }*/
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this);
    }

}
