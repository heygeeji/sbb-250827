package com.mysite.sbb.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionRepository questionRepository;

    @GetMapping("/question/list")
//    @ResponseBody
    public String list() {

        String questions = questionRepository.findAll()
                .stream()
                .map(e -> "<li)%s</li>".formatted(e.getSubject()))
                .collect(Collectors.joining("\n"));

        System.out.println(questionRepository.findAll().size());


        return "question_list";
//        return """
//                <html>
//                    <body>
//                        <ul>
//                           %s
//                        </ul>
//                    </body>
//                </html>
//                """.formatted(questions);

//        return """
//                <html>
//                    <body>
//                        <ul>
//                            <li>질문1</li>
//                            <li>질문2</li>
//                            <li>질문3</li>
//                        </ul>
//                    </body>
//                </html>
//                """;
    }
}
