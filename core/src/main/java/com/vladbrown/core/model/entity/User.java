package com.vladbrown.core.model.entity;

import java.util.List;

public class User {

    private String firstName;
    private String secondName;
    private String middleName;

    private List<String> deliveryAddresses;

    private String email;

    private String password;

    private Physique physique = new Physique();

    private RecommendationData recommendationData = new RecommendationData();

    private Plan plan = new Plan();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public List<String> getDeliveryAddresses() {
        return deliveryAddresses;
    }

    public void setDeliveryAddresses(List<String> deliveryAddresses) {
        this.deliveryAddresses = deliveryAddresses;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Physique getPhysique() {
        return physique;
    }

    public void setPhysique(Physique physique) {
        this.physique = physique;
    }

    public RecommendationData getRecommendationData() {
        return recommendationData;
    }

    public void setRecommendationData(RecommendationData recommendationData) {
        this.recommendationData = recommendationData;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
