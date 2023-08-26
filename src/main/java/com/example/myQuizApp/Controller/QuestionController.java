package com.example.myQuizApp.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List <Question>> getAllQuestionsbyCategory(@PathVariable String category){
        return questionService.getAllQuestionsbyCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @DeleteMapping("delete")
    public String deleteQuestion(Integer id){
        questionService.deleteQuestion(id);
        return "Success";
    }
}
