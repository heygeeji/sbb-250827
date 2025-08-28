package com.mysite.sbb.question;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    //    List<Question> findBySubject(String subject);
    Optional<Question> findBySubject(String subject);

    List<Question> findBySubjectLike(String s);
}
