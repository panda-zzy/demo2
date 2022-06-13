package com.example.ssmp_demo;

import com.example.ssmp_demo.pojo.entity.Car;
import com.example.ssmp_demo.pojo.CarDto;
import com.example.ssmp_demo.pojo.controver.CarControver;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Panda
 * @create 2022-12-22:06
 */

public class MapStructTest {
    @Test
    public void testMapstruct() throws ParseException {

        Car car = new Car();
        car.setName("BM");
//        car.setColor("red");
        CarDto carDto = CarControver.INSTANCE.pojoToDto(car);
        carDto.setColor("blue");
        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2022-06-13 00:41:50");
        carDto.setDate(parse);
        Car car1 = CarControver.INSTANCE.dtoTopojo(carDto);
        System.out.println(car1);
        System.out.println(carDto);

    }
}
