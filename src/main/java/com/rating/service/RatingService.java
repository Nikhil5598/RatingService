package com.rating.service;

import java.util.List;

import com.rating.entity.Rating;

public interface RatingService {
	
	Rating create(Rating rating);
	
	List<Rating> getAllRating(String userId);
	

}
