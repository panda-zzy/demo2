package com.example.ssmp_demo.pojo.controver;

import com.example.ssmp_demo.pojo.entity.Car;
import com.example.ssmp_demo.pojo.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Panda
 * @create 2022-12-22:21
 */
@Mapper
public interface CarControver {
    CarControver INSTANCE = Mappers.getMapper(CarControver.class);

    Car dtoTopojo(CarDto carDto);
    CarDto pojoToDto(Car car);

}
