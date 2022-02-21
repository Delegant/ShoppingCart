package com.skypro.shoppingcart.service.impl;

import com.skypro.shoppingcart.model.ShoppingCartModel;
import com.skypro.shoppingcart.service.ShoppingCartService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    public final ShoppingCartModel shoppingCartModel;

    public ShoppingCartServiceImpl(ShoppingCartModel shoppingCartModel) {
        this.shoppingCartModel = shoppingCartModel;
    }

    @Override
    public List<Integer> addItem(List<Integer> Item) {
        return shoppingCartModel.addItem(Item);
    }

    @Override
    public List<Integer> getItem() {
        return shoppingCartModel.getItem();
    }
}
