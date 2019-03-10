package com.zyll.controller;

import com.zyll.entity.UserEntity;
import com.zyll.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<UserEntity> findAll(){
        return this.userService.findAll();
    }
}
