package com.vladbrown.core.model.entity;

import java.util.List;

public class Plan {

    private double weight;

    private double height;

    private int age;

    private Sex sex;

    private List<DayPlan> dayPlanList;

    public List<DayPlan> getDayPlanList() {
        return dayPlanList;
    }

    public void setDayPlanList(List<DayPlan> dayPlanList) {
        this.dayPlanList = dayPlanList;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
