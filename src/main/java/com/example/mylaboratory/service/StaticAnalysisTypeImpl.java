package com.example.mylaboratory.service;

import com.example.mylaboratory.entity.StaticAnalysis_Type;
import com.example.mylaboratory.repository.StaticAnalysisTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.mylaboratory.entity.StaticAnalysis_Type;
import org.springframework.stereotype.Service;

@Service
public class StaticAnalysisTypeImpl implements StaticAnalysisType{

    @Autowired
    private StaticAnalysisTypeRepository staticAnalysisTypeRepository;

    @Override
    public StaticAnalysis_Type getAllByTestName(String testName) {
        return staticAnalysisTypeRepository.findAllByTestName(testName);
    }
}
