package com.example.foodlocation.repository;

import com.example.foodlocation.model.FoodPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodPostRepository extends JpaRepository<FoodPost, Long> {
}