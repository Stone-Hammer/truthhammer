package com.hammer.truthhammer.repository;

import com.hammer.truthhammer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("select u from User u where u.email=?1 and u.password=?2 ")
    User findByEmailAndPassword(String email, String password);

    @Query("select u from User u where u.phone=?1 and u.password=?2 ")
    User findByPhoneAndPassword(String phone, String password);
}
