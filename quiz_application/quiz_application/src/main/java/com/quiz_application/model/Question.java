package com.quiz_application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "questions")
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String category;

    private String questionTitle;

    private String option1;

    private String option2;

    private String option3;

    private String option4;

    private String correctAnswer;

    private String difficultLevel;
}
