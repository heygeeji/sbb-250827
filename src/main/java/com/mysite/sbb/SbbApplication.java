package com.mysite.sbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbbApplication {

    public static void main(String[] args) {

        //		// 답글로 부터 질문을 찾아가는 방법
//		Answer a = new Answer();
//
//		Question question = a.getQuestion();
//		question.getContent();
//
//		a.getQuestion().getContent();
//
//		// 질문을 조회하는 방법
//		Question q = new Question();
//		List<Answer> answers = q.getAnswers();


        SpringApplication.run(SbbApplication.class, args);
    }

}
