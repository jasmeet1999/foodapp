package com.cg.foodapp.foodapp.controller;

import com.cg.foodapp.foodapp.model.MenuItem;

import com.cg.foodapp.foodapp.service.MenuItemService;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuItemController {
    @Autowired
    MenuItemService menuItemService;

    @PostMapping("/additem")
    public String addItem(@RequestBody MenuItem menuItem) {

        menuItemService.addItem(menuItem);
        return "Data Added Successfully";
    }

    @GetMapping("/name/{name}")
    public MenuItem getItemByName(@PathVariable("name") String itemName) {
        return menuItemService.getItemByName(itemName);
    }
    @GetMapping("/item/available")
    public List<MenuItem> getAvailableItems() {
        return menuItemService.getAvailableItems();
    }

    @GetMapping("/item/{category}")
    public List<MenuItem> getItemCategory(@PathVariable("category") String itemCategory) {
        return menuItemService.getItemCategory(itemCategory);
    }
    @PutMapping("/item/{id}/{price}")
    public String updateItem(@PathVariable("id") Long itemId , @PathVariable("price") double itemPrice){
        menuItemService.updateItem(itemId,itemPrice);
        return "";
    }
    @DeleteMapping("/item/{id}")
    public List<MenuItem> deleteItemById(@PathVariable("id") long itemId) {
        return menuItemService.deleteItemById(itemId);
    }
}
