package com.example.ssmp_demo.pojo.controver;

import com.example.ssmp_demo.pojo.UserDto;
import com.example.ssmp_demo.pojo.UserDto.UserDtoBuilder;
import com.example.ssmp_demo.pojo.entity.User;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-14T00:02:58+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
public class UserControverImpl implements UserControver {

    @Override
    public User dtoToEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        if ( userDto.getId() != null ) {
            user.setId( String.valueOf( userDto.getId() ) );
        }
        user.setCreateTime( userDto.getCreateTime() );
        user.setUpdateTime( userDto.getUpdateTime() );
        user.setName( userDto.getName() );
        user.setPwd( userDto.getPwd() );
        user.setAge( userDto.getAge() );
        user.setGender( userDto.getGender() );
        user.setEmail( userDto.getEmail() );

        return user;
    }

    @Override
    public UserDto entityToDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDtoBuilder userDto = UserDto.builder();

        if ( user.getId() != null ) {
            userDto.id( Integer.parseInt( user.getId() ) );
        }
        userDto.name( user.getName() );
        userDto.pwd( user.getPwd() );
        userDto.age( user.getAge() );
        userDto.gender( user.getGender() );
        userDto.email( user.getEmail() );
        userDto.createTime( user.getCreateTime() );
        userDto.updateTime( user.getUpdateTime() );

        return userDto.build();
    }
}
