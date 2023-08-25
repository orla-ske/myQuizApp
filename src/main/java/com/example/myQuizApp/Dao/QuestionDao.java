package com.example.myQuizApp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.myQuizApp.Question;
import java.util.List;


@Repository
public interface QuestionDao  extends JpaRepository<Question, Integer>{
    List<Question> findByCategory(String category);
}
