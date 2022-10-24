package com.example.mylaboratory.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Analysis_Results {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long analysis_id;
    private String result_values;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "analysis_type_id")
    private Analysis_Type analysis_res;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Users user;
}
