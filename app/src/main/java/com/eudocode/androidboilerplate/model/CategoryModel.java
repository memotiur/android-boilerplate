package com.eudocode.androidboilerplate.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoryModel {
    @SerializedName("parent_category_id")
    @Expose
    private Integer parentCategoryId;
    @SerializedName("parent_category_name_en")
    @Expose
    private String parentCategoryNameEn;
    @SerializedName("parent_category_name_bn")
    @Expose
    private String parentCategoryNameBn;
    @SerializedName("featured_image")
    @Expose
    private String featuredImage;
    @SerializedName("is_active")
    @Expose
    private Integer isActive;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public Integer getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Integer parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public String getParentCategoryNameEn() {
        return parentCategoryNameEn;
    }

    public void setParentCategoryNameEn(String parentCategoryNameEn) {
        this.parentCategoryNameEn = parentCategoryNameEn;
    }

    public String getParentCategoryNameBn() {
        return parentCategoryNameBn;
    }

    public void setParentCategoryNameBn(String parentCategoryNameBn) {
        this.parentCategoryNameBn = parentCategoryNameBn;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
