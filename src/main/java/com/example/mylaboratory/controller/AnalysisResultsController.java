package com.example.mylaboratory.controller;


import com.example.mylaboratory.entity.Analysis_Results;
import com.example.mylaboratory.repository.Analysis_ResultsRepository;
import com.example.mylaboratory.service.AnalysisResults;
import com.example.mylaboratory.service.AnalysisResultsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/")
public class AnalysisResultsController {

    @Autowired
    private Analysis_ResultsRepository analysis_resultsRepository;
    @Autowired
    private AnalysisResultsImpl analysisResultsService;

    @GetMapping("/allanalysisresults")
    public List<Analysis_Results> getAllAnalysisResults(){
        return analysisResultsService.findall();
    }

    @GetMapping("/analysisresultsbyid/{cardid}")
    public List<Analysis_Results> getAllAnalysisResultsById(@PathVariable (value = "cardid") String cardid){
        return analysis_resultsRepository.findAllByUserCardid(cardid);
    }
    @Transactional
    @PostMapping("/addnewanalysisresult")
    public Analysis_Results createAnalysisResults(@RequestBody Analysis_Results analysis_results){
        return analysis_resultsRepository.save(analysis_results);
    }

}
