package com.example.mylaboratory.controller;

import com.example.mylaboratory.entity.StaticAnalysis_Type;
import com.example.mylaboratory.entity.StaticComponentType;
import com.example.mylaboratory.repository.StaticComponentTypeRepository;
import com.example.mylaboratory.service.StaticAnalysisTypeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/t")
public class StaticAnalysisTypeController {

    @Autowired
    private StaticAnalysisTypeImpl staticAnalysisType;
    @Autowired
    private StaticComponentTypeRepository staticComponentTypeRepository;

    @GetMapping("/staticanalysistype/{testName}")
    public StaticAnalysis_Type getAllByTestName(@PathVariable String testName){
        return staticAnalysisType.getAllByTestName(testName);
    }
    @GetMapping("/componentsList/{testName}")
    public List<StaticComponentType> getAllComponentsByAnalysisTestName(@PathVariable(name = "testName") String testName){
        return staticComponentTypeRepository.findAllByStaticAnalysisTypeTestName(testName);
    }
}
