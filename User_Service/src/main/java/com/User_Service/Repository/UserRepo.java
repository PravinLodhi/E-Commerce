package com.User_Service.Repository;

import com.User_Service.Entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserInfo,Long> {

    public UserInfo findByEmail(String email);
}
