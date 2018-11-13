package com.mbas.usersmanager.services;

import com.mbas.usersmanager.dto.UserDto;
import java.util.List;

public interface UserService {
    UserDto getUserById(Integer userId);
    void saveUser(UserDto userDto);
    List< UserDto > getAllUsers();
}
