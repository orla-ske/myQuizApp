package com.example.myQuizApp.Service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.myQuizApp.Dao.QuestionDao;
import com.example.myQuizApp.model.Question;

@Service
public class questionService {

    @Autowired
    QuestionDao QuestionDao;

    public ResponseEntity<List <Question>> getAllQuestions(){
        try{
            return new ResponseEntity<>(QuestionDao.findAll(), HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }
         return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Question>> getAllQuestionsbyCategory(String category){

        try{
            return  new ResponseEntity<>(QuestionDao.findByCategory(category),HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }

        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(Question question){
        QuestionDao.save(question);

        try{
            return new ResponseEntity<>("success", HttpStatus.CREATED);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>("failed", HttpStatus.BAD_REQUEST);
    }

    public void deleteQuestion(Integer id){
        QuestionDao.deleteById(id);
    }
}
