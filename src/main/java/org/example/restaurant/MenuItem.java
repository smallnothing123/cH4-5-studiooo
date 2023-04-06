package org.example.restaurant;
import java.util.ArrayList; // import the ArrayList class
import java.util.Collection;
import java.util.Objects;


public class MenuItem {

    private String category;
    private String name;
    private String description;
    private Double prices;
    private Boolean newitem;

    public MenuItem(String category, String name, String description, Double prices, Boolean newitem) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.prices = prices;
        this.newitem = newitem;
    }

    // Setter
    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrices(Double prices) {
        this.prices = prices;
    }

    public void setNewitem(Boolean newitem) {
        this.newitem = newitem;
    }
}
