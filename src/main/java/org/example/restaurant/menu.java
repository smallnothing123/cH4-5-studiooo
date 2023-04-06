package org.example.restaurant;
import java.awt.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import org.example.restaurant.MenuItem;

public class menu {

    private ArrayList <MenuItem> items;
    private Date dataUpdated;

    public menu(ArrayList<MenuItem> items, Date dataUpdated) {
        this.items = items;
        this.dataUpdated = dataUpdated;
    }


    // setters
    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void setDataUpdated(Date dataUpdated) {
        this.dataUpdated = dataUpdated;
    }


    // getter
    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public Date getDataUpdated() {
        return dataUpdated;
    }

}
