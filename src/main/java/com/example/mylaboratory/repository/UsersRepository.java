package com.example.mylaboratory.repository;

import com.example.mylaboratory.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users,String> {

    List<Users> findAllByFullname(String fullname);
}
