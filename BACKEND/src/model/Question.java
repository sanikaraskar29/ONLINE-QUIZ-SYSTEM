package com.example.quiz.entity;

import jakarta.persistence.*;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String questionText;
    private String answer;

    // Constructors
    public Question() {}
    public Question(String questionText, String answer) {
        this.questionText = questionText;
        this.answer = answer;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public String getQuestionText() { return questionText; }
    public void setQuestionText(String questionText) { this.questionText = questionText; }
    public String getAnswer() { return answer; }
    public void setAnswer(String answer) { this.answer = answer; }
}