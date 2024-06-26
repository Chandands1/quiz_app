package com.quiz_application.dao;

import com.quiz_application.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
