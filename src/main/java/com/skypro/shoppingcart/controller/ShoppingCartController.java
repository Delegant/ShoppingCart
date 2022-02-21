package com.skypro.shoppingcart.controller;

import com.skypro.shoppingcart.service.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add-item")
    public List<Integer> addItem(@RequestParam("item") List<Integer> item){
       return shoppingCartService.addItem(item);
    }

    @GetMapping("/get-item")
    public List<Integer> getItem(){
        return shoppingCartService.getItem();
    }
}
