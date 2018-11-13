package com.mbas.usersmanager.controllers;

import com.mbas.usersmanager.dto.UserDto;
import com.mbas.usersmanager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/getUser/{userId}")
    public UserDto getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }
    @RequestMapping("/getAllUsers")
    public List< UserDto > getAllUsers() {
        return userService.getAllUsers();
    }
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public void saveUser(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
    }
}
