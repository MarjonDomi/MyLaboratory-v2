package com.example.mylaboratory.repository;

import com.example.mylaboratory.entity.StaticAnalysis_Type;
import com.example.mylaboratory.entity.StaticComponentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaticComponentTypeRepository extends JpaRepository<StaticComponentType,Long> {
     List<StaticComponentType>findAllByStaticAnalysisTypeTestName(String testName);

}
