package com.vladbrown.core.model.service.planService;

import com.vladbrown.core.model.entity.Plan;
import com.vladbrown.core.model.entity.User;

import java.util.List;

public interface PlanService {

    Plan get(Long id);

    List<Plan> getAll();

    Plan create(Plan plan);

    Plan update(Plan plan);

    User setPlan(User user, Plan plan);
}
