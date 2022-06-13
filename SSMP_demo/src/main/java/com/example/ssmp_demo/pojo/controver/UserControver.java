package com.example.ssmp_demo.pojo.controver;

import com.example.ssmp_demo.pojo.entity.User;
import com.example.ssmp_demo.pojo.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

/**
 * @author Panda
 * @create 2022-12-0:18
 */
@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserControver {
    UserControver INSTANCE = Mappers.getMapper(UserControver.class);
//    对象转换器
    User dtoToEntity(UserDto userDto);
    UserDto entityToDTO(User test);
}
