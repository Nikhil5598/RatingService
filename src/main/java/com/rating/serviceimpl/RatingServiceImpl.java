package com.rating.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rating.entity.Rating;
import com.rating.repository.RatingRepository;
import com.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {
	@Autowired
	RatingRepository ratingRepository;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public Rating create(Rating rating) {

		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRating(String userId) {
		List<Rating> ratings = ratingRepository.findByUserId(userId);

		return ratings;

	}

}
