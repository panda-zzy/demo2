package com.example.ssmp_demo.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date createTime;
    @JsonFormat(pattern = "yyyy")
    private Date updateTime;


}
