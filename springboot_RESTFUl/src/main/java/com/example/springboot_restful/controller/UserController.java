package com.example.springboot_restful.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {
    @RequestMapping(value = "users",method= RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("user save");
        return "{`moudle`:user save}";
    }

    @RequestMapping(value = "users/{id}",method= RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("user delete");
        return "{`moudle`:user delete}";
    }

    @RequestMapping(value = "users{id}",method= RequestMethod.GET)
    @ResponseBody
    public String getByID(@PathVariable Integer id){
        System.out.println("user getById++"+id);
        return "{`moudle`:user getById}";
    }

    @RequestMapping(value = "users",method= RequestMethod.GET)
    @ResponseBody
    public String update(){
        System.out.println("user getAll");
        return "{`moudle`:user getAll}";
    }
}
