package com.cg.foodapp.foodapp.repository;

import com.cg.foodapp.foodapp.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<MenuItem, Integer> {
}
