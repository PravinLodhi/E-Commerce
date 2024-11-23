package com.User_Service.Controller;

import com.User_Service.Entity.UserInfo;
import com.User_Service.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<List<UserInfo>> getAllUsers(){
        List<UserInfo> users = userService.getUsers();
        if(users.isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(users);
    }


    @PostMapping
    public ResponseEntity<Object> CreateUser(@RequestBody UserInfo userInfo){
        if(userInfo.getName()==null || userInfo.getEmail()==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Request: Name and Email are require.");

        }
        long generateUserId = userService.generateRandomId();
        userInfo.setUserId(generateUserId);

        UserInfo addUser = userService.addUser(userInfo);
        return ResponseEntity.status(HttpStatus.CREATED).body(addUser);
    }

    @GetMapping("/id")
    public ResponseEntity<Object> getUserById(@PathVariable long id){
        Optional<UserInfo> getUser = userService.findByUserId(id);
        if(getUser.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User Not Found");
        }
        return ResponseEntity.status(HttpStatus.FOUND).body(getUser);
    }
}
