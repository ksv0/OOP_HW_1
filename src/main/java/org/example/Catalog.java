package org.example;

import lombok.Data;

import java.util.HashSet;

@Data
public class Catalog {
    HashSet<Category> categories = new HashSet<>();


    public void addCategory(Category category) {
        categories.add(category);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Catalog :\n");
        for (Category category : categories) {
            stringBuilder.append(category.toString());
        }
        return stringBuilder.toString();
    }
}
