package com.vladbrown.core.model.service.cartService;

import com.vladbrown.core.model.entity.Cart;
import com.vladbrown.core.model.entity.Product;
import com.vladbrown.core.model.entity.User;

import java.util.List;

public interface CartService<SessionSource> {

    Cart get(User user, SessionSource sessionSource);

    void addProduct(Cart cart, Product product, int quantity);

    void update(Cart cart, List<Product> productList);

    void remove(Cart cart, Product product);
}
