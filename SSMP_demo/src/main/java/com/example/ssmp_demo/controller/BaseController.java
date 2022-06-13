package com.example.ssmp_demo.controller;

import com.example.ssmp_demo.generator.domain.Test;
import com.example.ssmp_demo.pojo.UserDto;
import com.example.ssmp_demo.pojo.controver.UserControver;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Panda
 * @create 2022-08-0:39
 */
@Api(tags = "测试控制层接口")
@RestController
@RequestMapping("/base")
@Slf4j
public class BaseController {
    @ApiOperation(value = "基本接口", notes = "基本接口测试")
//    @ApiImplicitParam(paramType = "path",name = "uid",value = "测试ID",dataType = "String")
    @GetMapping("/baseController/{id}")
    public String baseController(@PathVariable int id){
        System.out.println(id);
        return "test";
    }
    @ApiOperation(value = "转换器接口", notes = "测试user表转换器")

    @PostMapping("/testUserControver")
    public String baseController2(@RequestBody@Valid UserDto userDto){
        log.info("testUserControver入参为：" + userDto.toString());
        Test test = UserControver.INSTANCE.dtoToEntity(userDto);
        log.info("testUserControver转换器输出为：" + test.toString());
        return test.toString();
    }
}
