package com.skypro.shoppingcart.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartModel {

    private final List<Integer> itemsList;

    public ShoppingCartModel() {
        this.itemsList = new ArrayList<>();
    }

    public List<Integer> addItem(List<Integer> item){
        itemsList.addAll(item);
        return List.copyOf(itemsList);
    }

    public List<Integer> getItem(){
        return List.copyOf(itemsList);
    }
}
