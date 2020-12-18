package com.vladbrown.core.model.service.planService;

import com.vladbrown.core.model.entity.DayPlan;
import com.vladbrown.core.model.entity.Task;

public interface DayPlanBuilder {

    DayPlan appendTask(DayPlan dayPlan, Task task);

    void removeTask(DayPlan dayPlan, Task task);

}
