package com.sangarius.springmvcblog.mapper;

import com.sangarius.springmvcblog.dto.UserDTO;
import com.sangarius.springmvcblog.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}