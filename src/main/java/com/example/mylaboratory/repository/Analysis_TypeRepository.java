package com.example.mylaboratory.repository;

import com.example.mylaboratory.entity.Analysis_Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Analysis_TypeRepository extends JpaRepository<Analysis_Type,Long> {
  List<Analysis_Type>findAllByDescription(Analysis_Type description);

}
