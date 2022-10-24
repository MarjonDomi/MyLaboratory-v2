package com.example.mylaboratory.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Components {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long component_id;
    private String component_name;
    private String component_norma;
}
