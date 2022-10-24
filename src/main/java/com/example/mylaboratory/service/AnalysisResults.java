package com.example.mylaboratory.service;

import com.example.mylaboratory.entity.Analysis_Results;

import java.util.List;

public interface AnalysisResults {
    Analysis_Results saveAnalysisResults(Analysis_Results analysis_results);
    List<Analysis_Results> findall();
    Analysis_Results getId(long analysis_id);
    Analysis_Results getAnalysisByUserId(long user_id);
}
