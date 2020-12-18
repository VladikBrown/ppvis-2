package com.vladbrown.core.model.entity;

import java.util.ArrayList;
import java.util.List;

public class DayPlan {

    private double totalEnergyValue;

    private String name;

    private String description;

    private List<Task> taskList = new ArrayList<>();

    public double getTotalEnergyValue() {
        return totalEnergyValue;
    }

    public void setTotalEnergyValue(double totalEnergyValue) {
        this.totalEnergyValue = totalEnergyValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
