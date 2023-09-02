package org.example;


import lombok.Data;

import java.util.Objects;

@Data
public class Goods {

    private String name;
    private Double price;
    private Double rank;


    public Goods(String name, Double price, Double rank) {
        this.name = name;
        this.price = price;
        this.rank = rank;
    }


    @Override
    public String toString() {
        return String.format("%s price - %s, rank - %s ", this.name, this.price, this.rank);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRank() {
        return rank;
    }

    public void setRank(Double rank) {
        this.rank = rank;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Objects.equals(name, goods.name);
    }


}
