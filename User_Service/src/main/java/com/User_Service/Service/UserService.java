package com.User_Service.Service;

import com.User_Service.Entity.UserInfo;
import com.User_Service.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<UserInfo> getUsers(){
        List<UserInfo> all = userRepo.findAll();
        return all;
    }

    public UserInfo addUser(UserInfo userInfo){
        return userRepo.save(userInfo);
    }

    public Optional<UserInfo> findByUserId(long userId){
        return userRepo.findById(userId);
    }

    public long generateRandomId(){
        long min = 1000000L;
        long max=99999999999L;
        return (long)(Math.random()*(max-min))+min;
    }

}
