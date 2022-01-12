package com.eudocode.androidboilerplate.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ProductModel implements Serializable {

    @SerializedName("product_id")
    @Expose
    private String productId;
    @SerializedName("product_name")
    @Expose
    private String productName;
    @SerializedName("product_details")
    @Expose
    private String productDetails;
    @SerializedName("product_specification")
    @Expose
    private String productSpecification;
    @SerializedName("product_slug")
    @Expose
    private String productSlug;
    @SerializedName("qr_code")
    @Expose
    private String qrCode;
    @SerializedName("stock")
    @Expose
    private String stock;
    @SerializedName("regular_price")
    @Expose
    private String regularPrice;
    @SerializedName("selling_price")
    @Expose
    private String sellingPrice;
    @SerializedName("discount_rate")
    @Expose
    private String discountRate;
    @SerializedName("stock_status")
    @Expose
    private String stockStatus;
    @SerializedName("length")
    @Expose
    private String length;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("length_class")
    @Expose
    private String lengthClass;
    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("weight_class")
    @Expose
    private String weightClass;
    @SerializedName("brand_id")
    @Expose
    private String brandId;
    @SerializedName("product_size")
    @Expose
    private List<String> productSize = null;
    @SerializedName("product_color")
    @Expose
    private List<String> productColor = null;
    @SerializedName("featured_image")
    @Expose
    private String featuredImage;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("is_featured")
    @Expose
    private String isFeatured;
    @SerializedName("product_type")
    @Expose
    private String productType;
    @SerializedName("publish_status")
    @Expose
    private String publishStatus;
    @SerializedName("minimum_order_quantity")
    @Expose
    private String minimumOrderQuantity;
    @SerializedName("meta_title")
    @Expose
    private String metaTitle;
    @SerializedName("meta_description")
    @Expose
    private String metaDescription;
    @SerializedName("meta_keywords")
    @Expose
    private String metaKeywords;
    @SerializedName("product_tags")
    @Expose
    private String productTags;
    @SerializedName("shop_id")
    @Expose
    private String shopId;
    @SerializedName("parent_category_id")
    @Expose
    private String parentCategoryId;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("sub_category_id")
    @Expose
    private String subCategoryId;
    @SerializedName("video")
    @Expose
    private String video;
    @SerializedName("delivery_charge")
    @Expose
    private String deliveryCharge;
    @SerializedName("deliverable_quantity")
    @Expose
    private String deliverableQuantity;
    @SerializedName("extra_delivery_charge")
    @Expose
    private String extraDeliveryCharge;
    @SerializedName("is_active")
    @Expose
    private String isActive;
    @SerializedName("images")
    @Expose
    private List<ImageModel> images = null;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    public String getProductSpecification() {
        return productSpecification;
    }

    public void setProductSpecification(String productSpecification) {
        this.productSpecification = productSpecification;
    }

    public String getProductSlug() {
        return productSlug;
    }

    public void setProductSlug(String productSlug) {
        this.productSlug = productSlug;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(String regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getLengthClass() {
        return lengthClass;
    }

    public void setLengthClass(String lengthClass) {
        this.lengthClass = lengthClass;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeightClass() {
        return weightClass;
    }

    public void setWeightClass(String weightClass) {
        this.weightClass = weightClass;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public List<String> getProductSize() {
        return productSize;
    }

    public void setProductSize(List<String> productSize) {
        this.productSize = productSize;
    }

    public List<String> getProductColor() {
        return productColor;
    }

    public void setProductColor(List<String> productColor) {
        this.productColor = productColor;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIsFeatured() {
        return isFeatured;
    }

    public void setIsFeatured(String isFeatured) {
        this.isFeatured = isFeatured;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    public String getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    public void setMinimumOrderQuantity(String minimumOrderQuantity) {
        this.minimumOrderQuantity = minimumOrderQuantity;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getProductTags() {
        return productTags;
    }

    public void setProductTags(String productTags) {
        this.productTags = productTags;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(String parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(String subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(String deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public String getDeliverableQuantity() {
        return deliverableQuantity;
    }

    public void setDeliverableQuantity(String deliverableQuantity) {
        this.deliverableQuantity = deliverableQuantity;
    }

    public String getExtraDeliveryCharge() {
        return extraDeliveryCharge;
    }

    public void setExtraDeliveryCharge(String extraDeliveryCharge) {
        this.extraDeliveryCharge = extraDeliveryCharge;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public List<ImageModel> getImages() {
        return images;
    }

    public void setImages(List<ImageModel> images) {
        this.images = images;
    }

}
