package com.springmvc.demo.controller;

import com.springmvc.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: shipotian
 * @Date: 2020/3/6 23:39
 */
@Controller
public class UserController {
    /**
     * 响应对象
     * @return
     */
    @RequestMapping(value = "/userResponse.action",produces = "application/json;charset=utf-8")
    @ResponseBody
    public User userResponse(){
        User user = new User();
        user.setId(1);
        user.setUsername("123");
        user.setPassword("1234");
        return user;
    }

    /**
     * 响应list
      * @return
     */
    @RequestMapping(value = "/userListResponse.action",produces = "application/json;charset=utf-8")
    @ResponseBody
    public List<User> userListResponse(){
        List<User> userList =new ArrayList<User>();
        userList.add(new User(110,"admin","123456"));
        userList.add(new User(112,"jack","love"));
        userList.add(new User(114,"lucy","lili"));
        return  userList;
    }

    /**
     * 响应map
      * @return
     */
    @RequestMapping(value = "/mapResponse.action",produces = "application/json;charset=utf-8")
    @ResponseBody
    public Map<String,Object> mapResponse(){
        Map<String,Object> map =new HashMap<String,Object>();
        List<User> userList =new ArrayList<User>();
        userList.add(new User(110,"admin","123456"));
        userList.add(new User(112,"jack","love"));
        userList.add(new User(114,"lucy","lili"));
        map.put("status","1");
        map.put("total",3);
        map.put("userList",userList);
        return  map;
    }
}
