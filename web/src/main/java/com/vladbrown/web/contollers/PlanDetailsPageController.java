package com.vladbrown.web.contollers;

import com.vladbrown.core.model.service.planService.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/planDetails")
public class PlanDetailsPageController {

    @Autowired
    private PlanService planService;

    @GetMapping("/{planId}")
    public String showPlanDetails(@PathVariable String planId) {
        return "planDetailsPage";
    }
}
