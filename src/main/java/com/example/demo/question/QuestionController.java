package com.example.demo.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping("/question/list")
//    @ResponseBody
    public String list(Model model) {
        List<Question> questionlist = this.questionService.getList();
        model.addAttribute("questionList", questionlist);
        return "question_list";
    }
}
