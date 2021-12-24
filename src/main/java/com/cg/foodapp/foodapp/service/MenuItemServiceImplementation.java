package com.cg.foodapp.foodapp.service;

import com.cg.foodapp.foodapp.model.MenuItem;
import com.cg.foodapp.foodapp.repository.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemServiceImplementation implements MenuItemService {
    @Autowired
    MenuRepo repoObj;

    @Override
    public void addItem(MenuItem menuItem) {
        repoObj.save(menuItem);
    }

    @Override
    public MenuItem getItemByName(String itemName) {
        return repoObj.getItemByName(itemName);
    }

    @Override
    public List<MenuItem> getAvailableItems() {
        return repoObj.getAvailableItems();
    }

    @Override
    public List<MenuItem> getItemCategory(String itemCategory) {
        return repoObj.getItemCategory(itemCategory);    }

    @Override
    public void updateItem(Long itemId, double itemPrice) {
         repoObj.updateItem(itemId,itemPrice);

    }

    @Override
    public List<MenuItem> deleteItemById(long itemId) {
        return repoObj.deleteItemById(itemId);
    }
}
