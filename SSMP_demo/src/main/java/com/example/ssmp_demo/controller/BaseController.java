package com.example.ssmp_demo.controller;

import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Panda
 * @create 2022-08-0:39
 */
@ApiModel
@Controller
@RequestMapping("/base")
public class BaseController {
    @GetMapping("/baseController")
    public String baseController(){

        return "test";
    }
}
