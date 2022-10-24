package com.example.mylaboratory.service;

import com.example.mylaboratory.entity.StaticAnalysis_Type;

public interface StaticAnalysisType {
    StaticAnalysis_Type getAllByTestName(String testName);

}
