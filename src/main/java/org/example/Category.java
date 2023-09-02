package org.example;


import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;

@Data
@Getter
public class Category {
    private final String name;
    HashMap<Goods, Integer> stock = new HashMap<>();

    public Category(String name) {
        this.name = name;
    }

    public boolean buy(Goods goods, Integer amount) {
        if (stock.get(goods) < amount) {
            return false;
        } else {
            stock.replace(goods, stock.get(goods) - amount);
        }
        return true;
    }

    void addToStorage(Goods goods, Integer amount) {
        stock.put(goods, amount);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(String.format("%s:\n", name));
        ArrayList<Goods> items = new ArrayList<>(stock.keySet());
        for (Goods goods : items) {
            stringBuilder.append(goods.toString()).append(" в наличии = ").append(stock.get(goods));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }


}
