package com.zyll.service;

import com.zyll.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> findAll();
}
