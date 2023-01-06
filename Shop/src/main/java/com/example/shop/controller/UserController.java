package com.example.shop.controller;

import com.example.shop.entity.User;
import com.example.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "")
    public Object all(
            @RequestParam(name = "page",defaultValue = "0") int page,
            @RequestParam(name = "count",defaultValue = "30") int count,
            @RequestParam(name = "id",defaultValue = "-1") int id,
            @RequestParam(name = "roleId",defaultValue = "-1") int roleId,
            @RequestParam(name = "userName",defaultValue = "") String userName,
            @RequestParam(name = "email",defaultValue = "") String email,
            @RequestParam(name = "from",defaultValue = "1970-01-01") LocalDate from,
            @RequestParam(name = "to",defaultValue = "1970-01-01") LocalDate to
    ) {
        List<User> userList = userService.all();
        List<User> userListReturn = new ArrayList<>();
        int rowFrom = page * count;
        int rowTo = page * count + count;
        if(id == -1
                && roleId == -1
                && userName.equals("")
                && email.equals("")
                && from.isEqual(LocalDate.parse("1970-01-01"))
                && to.isEqual(LocalDate.parse("1970-01-01")))
            return userList.subList(rowFrom,rowTo > userList.size() ? userList.size() : rowTo);
        for(User user : userList) {
            User userClone = null;
            if(id != -1) if(user.getId() == id) userClone = user; else continue;
            if(roleId != -1) if(user.getRole().getId() == roleId) userClone = user; else continue;
            if(!userName.equals("")) if(user.getUserName().toLowerCase().contains(userName.toLowerCase())) userClone = user; else continue;
            if(!email.equals("")) if(user.getEmail().toLowerCase().contains(email.toLowerCase())) userClone = user; else continue;
            if(!from.isEqual(LocalDate.parse("1970-01-01"))) if(user.getTimeCreate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().isAfter(from.minusDays(1))) userClone = user; else continue;
            if(!to.isEqual(LocalDate.parse("1970-01-01"))) if(user.getTimeCreate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().isBefore(to.plusDays(1))) userClone = user; else continue;
            if(userClone != null) userListReturn.add(userClone);
        }
        return userListReturn.subList(rowFrom,rowTo > userListReturn.size() ? userListReturn.size() : rowTo);
    }
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public void delete(@RequestParam(name = "id") int id) {
        userService.delete(id);
    }
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public void update(@RequestBody User user) {
        userService.save(user);
    }
    @RequestMapping(value = "/count")
    public Object count() {
        HashMap<String,Integer> count = new HashMap<>();
        count.put("count",userService.all().size());
        return count;
    }
}
