package ru.zuma.rest.model;

import com.fasterxml.jackson.annotation.JsonGetter;

public class Product {

    private long id;
    private String category;
    private String name;
    private float price;
    private float stars;
    private boolean isLiked;
    private long iconId;

    public Product() {
    }

    public Product(long id, String category, String name, float price, float stars, boolean isLiked, long iconId) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
        this.stars = stars;
        this.isLiked = isLiked;
        this.iconId = iconId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    @JsonGetter(value = "is_liked")
    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    @JsonGetter(value = "icon_id")
    public long getIconId() {
        return iconId;
    }

    public void setIconId(long iconId) {
        this.iconId = iconId;
    }
}
