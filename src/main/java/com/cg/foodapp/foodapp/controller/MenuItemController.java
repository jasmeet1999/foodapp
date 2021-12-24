package com.cg.foodapp.foodapp.controller;

import com.cg.foodapp.foodapp.model.MenuItem;

import com.cg.foodapp.foodapp.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuItemController {
    @Autowired
    MenuItemService menuItemService;

    @PostMapping("/additem")
    public void addItem(@RequestBody MenuItem menuItem) {
        menuItemService.addItem(menuItem);
    }
}
