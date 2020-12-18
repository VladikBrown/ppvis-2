package com.vladbrown.core.model.service.planService;

import com.vladbrown.core.model.entity.DayPlan;
import com.vladbrown.core.model.entity.Task;
import org.springframework.stereotype.Service;


@Service
public class DayPlanBuilderImpl implements DayPlanBuilder {

    @Override
    public DayPlan appendTask(DayPlan dayPlan, Task task) {
        return null;
    }

    @Override
    public void removeTask(DayPlan dayPlan, Task task) {

    }
}
