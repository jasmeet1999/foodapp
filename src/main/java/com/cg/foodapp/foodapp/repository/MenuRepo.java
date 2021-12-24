package com.cg.foodapp.foodapp.repository;

import com.cg.foodapp.foodapp.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuRepo extends JpaRepository<MenuItem, Integer> {
    @Query("from MenuItem where itemName=:itemName")
     MenuItem getItemByName(String itemName);


    @Query("from MenuItem where status=true")
    List<MenuItem> getAvailableItems();

    @Query("from MenuItem where category=:itemCategory")
    List<MenuItem> getItemCategory(String itemCategory);

    @Query("UPDATE MenuItem set price=:itemPrice where menuItemId=:itemId")
    MenuItem updateItem(Long itemId, double itemPrice);

    @Query("DELETE from MenuItem where menuItemId=:itemId")
    List<MenuItem> deleteItemById(long itemId);
}
