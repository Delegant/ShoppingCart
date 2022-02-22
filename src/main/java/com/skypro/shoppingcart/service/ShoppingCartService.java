package com.skypro.shoppingcart.service;

import java.util.List;

public interface ShoppingCartService {
    List<Integer> addItem(List<Integer> Item);
    List<Integer> getItem();
}
