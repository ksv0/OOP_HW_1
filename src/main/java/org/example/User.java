package org.example;

public class User {
    private final String login;
    private final String password;
    private final Basket basket = new Basket();


    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void buy(Category category, Goods goods, Integer amount) {
        basket.addToCart(category, goods, amount);
    }

    @Override
    public String toString() {
        String sb = "login = '" + login + '\'' +
                "\npassword = '" + password + '\'' +
                "\nbasket: \n" + basket;

        return sb;
    }
}
