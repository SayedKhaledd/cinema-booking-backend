package com.example.usermanagement.transformer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.InjectionStrategy;
import com.example.usermanagement.dto.UserDto;
import com.example.usermanagement.model.User;
import com.example.backendcoreservice.transformer.mapper.AbstractMapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserMapper extends AbstractMapper<User, UserDto> {


}
