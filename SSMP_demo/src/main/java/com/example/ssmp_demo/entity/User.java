package com.example.ssmp_demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zzn
 * @since 2022-05-28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("user")
public class User extends BaseEntity<User> {

    private static final long serialVersionUID=1L;

    private String name;
    @TableField(select = false)
    private String pwd;

    private Integer age;

    private String gender;

    private String email;

    public static final String NAME = "name";

    public static final String PWD = "pwd";

    public static final String AGE = "age";

    public static final String GENDER = "gender";

    public static final String EMAIL = "email";

    @Override
    public Serializable pkVal() {
        return null;
    }

}
