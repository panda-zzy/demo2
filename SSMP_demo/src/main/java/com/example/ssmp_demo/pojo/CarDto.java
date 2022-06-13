package com.example.ssmp_demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Panda
 * @create 2022-12-22:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {
    private String name;
    private String color;
    private String wheel;
    private Date date;
}