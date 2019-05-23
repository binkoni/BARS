package com.example.bars;

import com.google.firebase.database.Exclude;
import java.util.HashMap;
import java.util.Map;

public class FirebasePost {
    public String id;
    public String image;
    public String name;
    public String style;
    public String company;
    public double rating;
    public String ABV;
    public String comment;

    public FirebasePost(){
        // Default constructor required for calls to DataSnapshot.getValue(FirebasePost.class)
    }

    public FirebasePost(String id, String image,String name, String style, String company, double rating, String ABV, String comment) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.style = style;
        this.company = company;
        this.rating = rating;
        this.ABV = ABV;
        this.comment = comment;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("id", id);
        result.put("image", image);
        result.put("name", name);
        result.put("style", style);
        result.put("company", company);
        result.put("rating", rating);
        result.put("abv", ABV);
        result.put("comment", comment);
        return result;
    }

}
