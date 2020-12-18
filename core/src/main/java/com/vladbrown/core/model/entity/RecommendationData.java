package com.vladbrown.core.model.entity;

import java.util.List;

public class RecommendationData {

    private List<Product> favoriteProducts;

    private List<Product> bannedProducts;

    public List<Product> getFavoriteProducts() {
        return favoriteProducts;
    }

    public void setFavoriteProducts(List<Product> favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }

    public List<Product> getBannedProducts() {
        return bannedProducts;
    }

    public void setBannedProducts(List<Product> bannedProducts) {
        this.bannedProducts = bannedProducts;
    }
}
