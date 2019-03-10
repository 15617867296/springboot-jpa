package com.zyll.service.impl;

import com.zyll.dao.UserRestory;
import com.zyll.entity.UserEntity;
import com.zyll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRestory userRestory;

    @Override
    public List<UserEntity> findAll() {
        return userRestory.findAll();
    }
}
