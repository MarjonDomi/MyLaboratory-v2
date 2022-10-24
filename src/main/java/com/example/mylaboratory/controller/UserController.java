package com.example.mylaboratory.controller;

import com.example.mylaboratory.entity.Users;
import com.example.mylaboratory.service.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/u")
public class UserController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/alluser")
    public List<Users> getAllUsers(){
        return  usersService.findAll();
    }

    @GetMapping("/user/{cardid}")
    public Users getById(@PathVariable (value = "cardid")String cardid){
        return usersService.getId(cardid);
    }

    @GetMapping("/userfullname/{fullname}")
    public List<Users> getByFullname(@PathVariable (value = "fullname") String fullname){
    return usersService.findUserByFullname(fullname);
    }

    @PostMapping("/addnewuser")
    public Users createNewUser(@RequestBody Users users) {
        return usersService.saveUser(users);
    }

    @PutMapping("/updateuser/{id}")
    public Users updateUser(@PathVariable(value = "id") String cardid, @RequestBody Users users){
        Users upduser = usersService.getId(cardid);
        upduser.setCardid(cardid);
        upduser.setFullname(upduser.getFullname());
        upduser.setReferencenumber(upduser.getReferencenumber());
        upduser.setAge(upduser.getAge());
        upduser.setAddress(upduser.getAddress());
        return usersService.saveUser(upduser);
    }
    @DeleteMapping("/deleteuser/{cardid}")
    public void deleteUser(@PathVariable (value = "cardif")String cardid){
        Users users =  usersService.getId(cardid);
        usersService.deleteUser(users);
        System.out.println("user deleted");
    }
}
