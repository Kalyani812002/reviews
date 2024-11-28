package com.example.review.googlereview;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class ReviewController {

	    @Autowired
	    private GoogleReviewService googleReviewService;

	    @GetMapping("/reviews")
	    public String getGoogleReviews(@RequestParam String placeId) {
	        // Fetch reviews from Google
	        String reviews = googleReviewService.fetchGoogleReviews(placeId);
	        return reviews; // You can process and format the reviews here before returning them
	    }
	}


