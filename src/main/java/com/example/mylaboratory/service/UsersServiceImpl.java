package com.example.mylaboratory.service;

import com.example.mylaboratory.entity.Users;
import com.example.mylaboratory.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users saveUser(Users user) {
        return usersRepository.save(user);
    }

    @Override
    public List<Users> findUserByFullname(String fullname) {
        return usersRepository.findAllByFullname(fullname);
    }

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Users getId(String cardid) {
        return usersRepository.getById(cardid);
    }

    @Override
    public void deleteUser(Users user) {
     usersRepository.delete(user);
    }
}
