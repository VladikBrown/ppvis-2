package com.vladbrown.web.contollers;

import com.vladbrown.core.model.entity.Cart;
import com.vladbrown.core.model.service.cartService.CartService;
import com.vladbrown.core.model.service.cartService.HttpSessionCartService;
import com.vladbrown.core.model.service.orderService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/order")
public class OrderPageController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private HttpSessionCartService cartService;

    @GetMapping("{orderId}")
    public String showOrder(HttpSession httpSession, @PathVariable String orderId) {
        return "orderPage";
    }

    @PostMapping
    public String createOrder(HttpSession httpSession) {
        return "redirect:/order";
    }
}
