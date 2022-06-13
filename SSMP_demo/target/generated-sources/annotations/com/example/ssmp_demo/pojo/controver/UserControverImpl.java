package com.example.ssmp_demo.pojo.controver;

import com.example.ssmp_demo.entity.User;
import com.example.ssmp_demo.pojo.UserDto;
import com.example.ssmp_demo.pojo.UserDto.UserDtoBuilder;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-13T23:37:56+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
public class UserControverImpl implements UserControver {

    @Override
    public User dtoToEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setName( userDto.getName() );
        user.setPwd( userDto.getPwd() );
        user.setAge( userDto.getAge() );
        user.setGender( userDto.getGender() );
        user.setEmail( userDto.getEmail() );

        return user;
    }

    @Override
    public UserDto entityToDTO(User test) {
        if ( test == null ) {
            return null;
        }

        UserDtoBuilder userDto = UserDto.builder();

        userDto.name( test.getName() );
        userDto.pwd( test.getPwd() );
        userDto.age( test.getAge() );
        userDto.gender( test.getGender() );
        userDto.email( test.getEmail() );

        return userDto.build();
    }
}
