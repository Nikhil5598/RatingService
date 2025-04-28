package com.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rating.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, Integer>{

	//create custom methods
	List<Rating> findByUserId(String userId);
	
	List<Rating> findByCafeId(String cafeId);
}
