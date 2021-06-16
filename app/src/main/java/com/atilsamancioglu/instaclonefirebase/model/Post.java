package com.atilsamancioglu.instaclonefirebase.model;

public class Post {

    public String email;
    public String comment;
    public String downloadUrl;

    public Post(String email, String comment, String downloadUrl) {
        this.email = email;
        this.comment = comment;
        this.downloadUrl = downloadUrl;
    }
}
