package com.mysite.sbb;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    //    List<Question> findBySubject(String subject);
    Optional<Question> findBySubject(String subject);

    List<Question> findBySubjectLike(String s);
}
