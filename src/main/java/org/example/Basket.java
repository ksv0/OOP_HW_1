package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;

@Data
@Getter
@Setter
public class Basket {
    private final HashMap<Goods, Integer> cart = new HashMap<>();

    public void addToCart(Category category, Goods goods, Integer amount) {
        if (category.buy(goods, amount)) {
            if (cart.containsKey(goods)) {
                cart.replace(goods, cart.get(goods) + amount);
            } else {
                cart.put(goods, amount);
            }
        } else {
            System.out.printf("%s недостаточно на складе, либо кончился \n", goods.getName());
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Goods> items = new ArrayList<>(cart.keySet());
        for (Goods goods : items) {
            stringBuilder.append(goods.toString()).append(" в корзине = ").append(cart.get(goods));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
