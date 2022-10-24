package com.example.mylaboratory.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class StaticComponentType {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id_component;
    private String component_name;
    private String norma;

    @ManyToOne(cascade = CascadeType.ALL)
    private StaticAnalysis_Type staticAnalysisType;
}
