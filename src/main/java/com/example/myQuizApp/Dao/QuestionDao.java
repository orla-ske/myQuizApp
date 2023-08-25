package com.example.myQuizApp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.myQuizApp.Question;

@Repository
public interface QuestionDao  extends JpaRepository<Question, Integer>{
    
}
