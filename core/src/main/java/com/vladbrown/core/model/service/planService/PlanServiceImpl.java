package com.vladbrown.core.model.service.planService;

import com.vladbrown.core.model.dao.plan.PlanDao;
import com.vladbrown.core.model.dao.recipe.RecipeDao;
import com.vladbrown.core.model.dao.user.UserDao;
import com.vladbrown.core.model.entity.Plan;
import com.vladbrown.core.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanDao planDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private RecipeDao recipeDao;

    @Autowired
    private PlanBuilder planBuilder;

    @Override
    public Plan get(Long id) {
        return null;
    }

    @Override
    public List<Plan> getAll() {
        return null;
    }

    @Override
    public Plan create(Plan plan) {
        return null;
    }

    @Override
    public Plan update(Plan plan) {
        return null;
    }

    @Override
    public User setPlan(User user, Plan plan) {
        return null;
    }
}
