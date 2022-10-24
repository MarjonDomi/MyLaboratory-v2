package com.example.mylaboratory.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name="users")
@Data
public class Users {

    public enum Roles {
        ADMIN,
        USER
    }
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String cardid;
    private Integer referencenumber;
    private String fullname;
    private Integer age;
    private String address;
    @Enumerated(EnumType.STRING)
    private Roles roles;

}
