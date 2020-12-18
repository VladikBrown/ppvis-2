package com.vladbrown.web.contollers;

import com.vladbrown.core.model.service.planService.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/planCreation")
public class PlanCreatorPageController {

    @Autowired
    private PlanService planService;

    @GetMapping
    public String getCreatePlanForm() {
        return "planCreation";
    }

    @PostMapping
    public String createPlan(Model model) {
        return "redirect:/planCreation";
    }

}
