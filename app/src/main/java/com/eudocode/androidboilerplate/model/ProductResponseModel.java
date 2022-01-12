package com.eudocode.androidboilerplate.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductResponseModel {

    @SerializedName("status_code")
    @Expose
    private Integer statusCode;
    @SerializedName("custom_status_code")
    @Expose
    private Integer customStatusCode;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("sliders")
    @Expose
    private List<SliderModel> sliders = null;
    @SerializedName("top_categories")
    @Expose
    private List<CategoryModel> topCategories = null;
    @SerializedName("popular_products")
    @Expose
    private List<ProductModel> popularProducts = null;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getCustomStatusCode() {
        return customStatusCode;
    }

    public void setCustomStatusCode(Integer customStatusCode) {
        this.customStatusCode = customStatusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<SliderModel> getSliders() {
        return sliders;
    }

    public void setSliders(List<SliderModel> sliders) {
        this.sliders = sliders;
    }

    public List<CategoryModel> getTopCategories() {
        return topCategories;
    }

    public void setTopCategories(List<CategoryModel> topCategories) {
        this.topCategories = topCategories;
    }

    public List<ProductModel> getPopularProducts() {
        return popularProducts;
    }

    public void setPopularProducts(List<ProductModel> popularProducts) {
        this.popularProducts = popularProducts;
    }
}
