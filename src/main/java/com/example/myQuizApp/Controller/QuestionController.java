package com.example.myQuizApp.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myQuizApp.Question;
import com.example.myQuizApp.Service.questionService;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    questionService questionService;

    
    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }
}