package com.harryjin.authdemo.service;

import com.harryjin.authdemo.dto.UserDto;
import com.harryjin.authdemo.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}