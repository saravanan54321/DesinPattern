package com.example.foodlocation.controller;

import com.example.foodlocation.model.FoodPost;
import com.example.foodlocation.repository.FoodPostRepository;
import com.example.foodlocation.util.GeoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class LocationController {

    @Autowired
    private FoodPostRepository repo;

    @PostMapping("/posts")
    public FoodPost createPost(@RequestBody FoodPost post) {
        return repo.save(post);
    }

    @GetMapping("/posts")
    public List<FoodPost> getAllPosts() {
        return repo.findAll();
    }

    @GetMapping("/posts-with-distance")
    public List<PostWithDistance> getPostsWithDistance(@RequestParam double lat, @RequestParam double lon) {
        List<FoodPost> all = repo.findAll();
        return all.stream().map(p -> new PostWithDistance(p,
                        GeoUtil.haversine(lat, lon, p.getLatitude(), p.getLongitude())))
                .collect(Collectors.toList());
    }

    public static class PostWithDistance {
        public FoodPost post;
        public double distanceKm;
        public PostWithDistance(FoodPost post, double distanceKm) {
            this.post = post;
            this.distanceKm = distanceKm;
        }
    }
}