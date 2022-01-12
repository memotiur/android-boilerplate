package com.eudocode.androidboilerplate.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ImageModel implements Serializable {
    @SerializedName("product_image_id")
    @Expose
    private String productImageId;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("product_id")
    @Expose
    private String productId;

    public String getProductImageId() {
        return productImageId;
    }

    public void setProductImageId(String productImageId) {
        this.productImageId = productImageId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
