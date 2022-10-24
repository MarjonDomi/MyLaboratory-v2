package com.example.mylaboratory.service;

import com.example.mylaboratory.entity.Users;

import java.util.List;

public interface UsersService {
    Users saveUser(Users user);
    List<Users> findUserByFullname(String fullname);
    List<Users> findAll();
    Users getId(String cardid);
    void deleteUser(Users user);

}
