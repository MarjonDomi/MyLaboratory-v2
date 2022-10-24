package com.example.mylaboratory.repository;


import com.example.mylaboratory.entity.StaticAnalysis_Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticAnalysisTypeRepository extends JpaRepository<StaticAnalysis_Type,Long> {
    StaticAnalysis_Type findAllByTestName(String testName);
}
