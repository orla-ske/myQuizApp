package com.example.myQuizApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.myQuizApp.Dao.QuestionDao;
import com.example.myQuizApp.Question;

@Service
public class questionService {

    @Autowired
    QuestionDao QuestionDao;

    public List <Question> getAllQuestions(){
        return QuestionDao.findAll();
    }
}
