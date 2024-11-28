package com.example.review.googlereview;

@Service
public class GoogleReviewService {

    private final String GOOGLE_API_URL = "https://console.cloud.google.com/apis/credentials?project=heroic-vial-441710-c8";
    private final String API_KEY = "AIzaSyBUJO9YWSBwOkkRPHNo21RPSz1GrRKHZeA"; // API Key from Google Cloud

    public String fetchGoogleReviews(String placeId) {
        String url = UriComponentsBuilder.fromHttpUrl(GOOGLE_API_URL)
                .queryParam("ChIJsxSZsJDS3TsRXCEonV2EB8s", placeId)
                .queryParam("AIzaSyBUJO9YWSBwOkkRPHNo21RPSz1GrRKHZeA", API_KEY)
                .toUriString();

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        return response;
    }
}
