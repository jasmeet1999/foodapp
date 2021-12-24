package com.cg.foodapp.foodapp.service;

import com.cg.foodapp.foodapp.model.MenuItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuItemService {
    void addItem(MenuItem menuItem);
    



    @Query("from FoodApp where itemName=:itemName")
    MenuItem getItemByName(@Param("itemName") String itemName);

    List<MenuItem> getAvailableItems();

    List<MenuItem> getItemCategory(String itemCategory);

    void updateItem(Long itemId, double itemPrice);

    List<MenuItem> deleteItemById(long itemId);
}
