package com.vladbrown.core.model.service.planService;

import com.vladbrown.core.model.entity.DayPlan;
import com.vladbrown.core.model.entity.Plan;

public interface PlanBuilder {

    Plan appendDayPlan(Plan plan, DayPlan dayPlan);

    void removeDayPlan(Plan plan, DayPlan dayPlan);
}
