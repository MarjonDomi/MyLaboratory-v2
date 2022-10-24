package com.example.mylaboratory.service;

import com.example.mylaboratory.entity.Analysis_Results;
import com.example.mylaboratory.entity.Analysis_Type;
import com.example.mylaboratory.repository.Analysis_ResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalysisResultsImpl implements AnalysisResults{

    @Autowired
    private Analysis_ResultsRepository analysis_resultsRepository;

    @Override
    public Analysis_Results saveAnalysisResults(Analysis_Results analysis_results) {
        return analysis_resultsRepository.save(analysis_results);
    }

    @Override
    public List<Analysis_Results> findall() {
        return analysis_resultsRepository.findAll();
    }

    @Override
    public Analysis_Results getId(long analysis_id) {
        return analysis_resultsRepository.getById(analysis_id);
    }

    @Override
    public Analysis_Results getAnalysisByUserId(long user_id) {
        return analysis_resultsRepository.getById(user_id);
    }

}
