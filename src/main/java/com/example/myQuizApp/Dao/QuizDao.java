package com.example.myQuizApp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myQuizApp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{
    
}
