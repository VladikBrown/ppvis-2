package com.vladbrown.core.model.service.planService;

import com.vladbrown.core.model.entity.DayPlan;
import com.vladbrown.core.model.entity.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanBuilderImpl implements PlanBuilder {

    @Autowired
    private DayPlanBuilder dayPlanBuilder;

    @Override
    public Plan appendDayPlan(Plan plan, DayPlan dayPlan) {
        return null;
    }

    @Override
    public void removeDayPlan(Plan plan, DayPlan dayPlan) {

    }
}
