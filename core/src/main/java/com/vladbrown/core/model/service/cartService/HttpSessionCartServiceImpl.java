package com.vladbrown.core.model.service.cartService;

import com.vladbrown.core.model.entity.Cart;
import com.vladbrown.core.model.entity.Product;
import com.vladbrown.core.model.entity.User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class HttpSessionCartServiceImpl implements HttpSessionCartService {


    @Override
    public Cart get(User user, HttpSession httpSession) {
        return null;
    }

    @Override
    public void addProduct(Cart cart, Product product, int quantity) {

    }

    @Override
    public void update(Cart cart, List<Product> productList) {

    }

    @Override
    public void remove(Cart cart, Product product) {

    }
}
