package com.banyuan.study.controller;

import com.banyuan.study.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author poi 2021/6/1 20:58
 * @version 1.0
 * 2021/6/1 20:58
 */
@Controller
@ResponseBody
@RequestMapping("/rest")
public class RestController {
    @GetMapping("/users")
    public List<User> queryAllUsers(){
        System.out.println("get");
        User user = new User();
        user.setId(0);
        user.setName("张三");
        user.setBirth(new Date());
        user.setGender(false);

        User user2 = new User();
        user2.setId(2);
        user2.setName("lisi");
        user2.setBirth(new Date());
        user2.setGender(false);
        List<User> users = Arrays.asList(user,user2);
        return users;
    }

    @PostMapping("/users")
    public String addUser(@RequestBody User user){
        System.out.println("Post user :"+user);
        return "{status:1}";
    }

    @PutMapping("/users")
    public String updateUser(@RequestBody User user){
        System.out.println("Put user:" + user);
        return "{status:1}";
    }

    @GetMapping("/users/{id}")
    public String queryOneUser(@PathVariable Integer id){//@PathVariable 接收路径中的值
        System.out.println("Get user id:"+id);
        return "{status:1}";
    }

    @DeleteMapping("/users/{id}")
    public String deleteOneUser(@PathVariable Integer id){//@PathVariable 接收路径中的值
        System.out.println("delete user id:"+id);
        return "{status:1}";
    }
}
