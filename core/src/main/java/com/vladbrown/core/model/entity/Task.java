package com.vladbrown.core.model.entity;

import java.sql.Time;
import java.util.List;

public class Task {

    private double energyValue;

    private List<String> exercises;

    private Time time;

    private TaskStatus taskStatus;

    private Recipe recipe;

    public double getEnergyValue() {
        return energyValue;
    }

    public void setEnergyValue(double energyValue) {
        this.energyValue = energyValue;
    }

    public List<String> getExercises() {
        return exercises;
    }

    public void setExercises(List<String> exercises) {
        this.exercises = exercises;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
}
