package com.example.ssmp_demo.pojo.controver;

import com.example.ssmp_demo.pojo.Car;
import com.example.ssmp_demo.pojo.CarDto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-13T23:37:56+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
public class CarControverImpl implements CarControver {

    @Override
    public Car dtoTopojo(CarDto carDto) {
        if ( carDto == null ) {
            return null;
        }

        Car car = new Car();

        car.setName( carDto.getName() );
        car.setColor( carDto.getColor() );
        if ( carDto.getDate() != null ) {
            car.setDate( new SimpleDateFormat().format( carDto.getDate() ) );
        }

        return car;
    }

    @Override
    public CarDto pojoToDto(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDto carDto = new CarDto();

        carDto.setName( car.getName() );
        carDto.setColor( car.getColor() );
        try {
            if ( car.getDate() != null ) {
                carDto.setDate( new SimpleDateFormat().parse( car.getDate() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }

        return carDto;
    }
}
