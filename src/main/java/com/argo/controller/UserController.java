package com.argo.controller;


import com.argo.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("user save....");
        return "{'module': springmvc}";
    }

    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("list common(json) 参数传递 list ==>" + likes);
        return "{'module': 'list common for json param'}";
    }

    @RequestMapping("pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("pojo(json) 参数传递 user ==>" + user);
        return "{'module': 'pojo for json param'}";
    }

    @RequestMapping("listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> userList){
        System.out.println("pojo(json) 参数传递 user ==>" + userList);
        return "{'module': 'list pojo for json param'}";
    }

    @RequestMapping("/dateParam")
    @ResponseBody
    public String dataParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date){
        System.out.println("pojo(json) 参数传递 date ==>" + date);
        return "{'module': 'date param'}";
    }
}
