package com.mbas.usersmanager.converters;

import com.mbas.usersmanager.dto.UserDto;
import com.mbas.usersmanager.entities.User;


public class UserConverter {
    public static User dtoToEntity(UserDto userDto) {
//        User user = new User(userDto.getUserName(), null);
        User user = new User(userDto.getUserName());
        user.setUserId(userDto.getUserId());
//        user.setSkills(userDto.getSkillDtos().stream().map(SkillConverter::dtoToEntity).collect(Collectors.toList()));
        return user;
    }
    public static UserDto entityToDto(User user) {
//        UserDto userDto = new UserDto(user.getUserId(), user.getUserName(), null);
        UserDto userDto = new UserDto(user.getUserId(), user.getUserName());
//        userDto.setSkillDtos(user.getSkills().stream().map(SkillConverter::entityToDto).collect(Collectors.toList()));
        return userDto;
    }
}
