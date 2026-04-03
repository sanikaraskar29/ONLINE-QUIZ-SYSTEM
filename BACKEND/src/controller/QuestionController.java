package com.example.quiz.controller;

import com.example.quiz.model.Question;
import com.example.quiz.repository.QuestionRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    private final QuestionRepository repository;

    public QuestionController(QuestionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsByQuiz(@PathVariable Long quizId) {
        return repository.findByQuizId(quizId);
    }

    @PostMapping
    public Question addQuestion(@RequestBody Question question) {
        return repository.save(question);
    }
}