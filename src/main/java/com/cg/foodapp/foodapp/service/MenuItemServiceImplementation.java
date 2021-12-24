package com.cg.foodapp.foodapp.service;

import com.cg.foodapp.foodapp.model.MenuItem;
import com.cg.foodapp.foodapp.repository.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuItemServiceImplementation implements MenuItemService {
    @Autowired
    MenuRepo repoObj;

    @Override
    public void addItem(MenuItem menuItem) {
        repoObj.save(menuItem);
    }
}
