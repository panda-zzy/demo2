package com.example.ssmp_demo.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author Panda
 * @create 2022-11-23:49
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class UserDto {

    @ApiModelProperty(dataType = "Integer",value = "用户ID")
    @NotNull(message = "ID不能为NULL")
    private Integer id;

    /**
     *
     */
    @ApiModelProperty(dataType = "String")
    private String name;

    private String pwd;

    private Integer age;

    private String gender;

    private String email;

    private Date createTime;

    private Date updateTime;


}