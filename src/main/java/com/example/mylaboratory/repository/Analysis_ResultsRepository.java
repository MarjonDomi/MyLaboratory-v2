package com.example.mylaboratory.repository;

import com.example.mylaboratory.entity.Analysis_Results;
import com.example.mylaboratory.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Analysis_ResultsRepository extends JpaRepository<Analysis_Results,Long> {
    List<Analysis_Results> findAllByUserCardid(String cardid);
//    Analysis_Results save(long analysis_id);
}
