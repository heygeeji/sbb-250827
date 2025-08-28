package com.mysite.sbb.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionRepository questionRepository;

    @GetMapping("/question/list")
//    @ResponseBody
    public String list(Model model) {

        List<Question> questionList = questionRepository.findAll();
        model.addAttribute("questionList", questionList);


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
