package com.vladbrown.web.contollers;

import com.vladbrown.core.model.service.planService.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/planList")
public class PlanListPageController {

    @Autowired
    private PlanService planService;

    @GetMapping
    public String showPlanList() {
        return "planListPage";
    }
}
