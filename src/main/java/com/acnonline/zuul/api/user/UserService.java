package com.acnonline.zuul.api.user;

import com.acnonline.zuul.domain.User.User;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aranga on 28/03/2016.
 */
@RestController
@RequestMapping("api/user")
public class UserService
{
    @RequestMapping("/")
    public List<User> getAll()
    {
        final List<User> list = new ArrayList<User>();
        list.add(new User(1,"Aranga","Nanayakkara","Melbourne"));
        list.add(new User(2,"Nirasha","Unawatuna","Melbourne"));



        return list;
    }
}
