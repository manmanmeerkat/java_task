package com.example.ITS.web.issue;

import com.example.ITS.domain.Issue.IssueEntity;
import com.example.ITS.domain.Issue.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class IssueController {

    private final IssueService issueService;

    @GetMapping("/issues")
    public String showList(Model model) {

        model.addAttribute("issueList", issueService.findAll());
        return "/issues/List";
    }

}
