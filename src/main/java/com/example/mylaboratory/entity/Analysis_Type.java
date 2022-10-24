package com.example.mylaboratory.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class Analysis_Type {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long analysistype_id;
    private String description;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Components> componentList;



}
