package com.example.mylaboratory.repository;

import com.example.mylaboratory.entity.Components;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentsRepository extends JpaRepository<Components,Long> {
}
