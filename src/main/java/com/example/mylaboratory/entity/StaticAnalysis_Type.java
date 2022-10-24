package com.example.mylaboratory.entity;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class StaticAnalysis_Type {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String testName;


}
