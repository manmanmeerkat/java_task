package com.example.ITS.web.issue;

import com.example.ITS.domain.Issue.IssueEntity;
import com.example.ITS.domain.Issue.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/issues")
@RequiredArgsConstructor
public class IssueController {

    private final IssueService issueService;

    @GetMapping
    public String showList(Model model) {

        model.addAttribute("issueList", issueService.findAll());
        return "issues/List";
    }

    @GetMapping("/creationForm")
    public String showCreationForm(@ModelAttribute IssueForm form) {
        return "issues/creationForm";
    }

    @PostMapping
    public  String create(IssueForm form, Model model) {
        return showList(model);
    }
}
