package com.cg.foodapp.foodapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MenuItem")
public class MenuItem {
    @Id
    private long menuItemId;
    private String itemName;
    private boolean status;
    private double price;
    private String category;

    public MenuItem() {
    }

    public MenuItem(long menuItemId, String itemName, boolean status, double price, String category) {
        this.menuItemId = menuItemId;
        this.itemName = itemName;
        this.status = status;
        this.price = price;
        this.category = category;
    }

    public long getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(long menuItemId) {
        this.menuItemId = menuItemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
