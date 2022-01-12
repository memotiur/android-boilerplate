package com.eudocode.androidboilerplate.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SliderModel {


    @SerializedName("slider_id")
    @Expose
    private Integer sliderId;
    @SerializedName("slider_image")
    @Expose
    private String sliderImage;
    @SerializedName("slider_title")
    @Expose
    private String sliderTitle;
    @SerializedName("slider_url")
    @Expose
    private String sliderUrl;

    public SliderModel(Integer sliderId, String sliderImage, String sliderTitle, String sliderUrl) {
        this.sliderId = sliderId;
        this.sliderImage = sliderImage;
        this.sliderTitle = sliderTitle;
        this.sliderUrl = sliderUrl;
    }

    public Integer getSliderId() {
        return sliderId;
    }

    public void setSliderId(Integer sliderId) {
        this.sliderId = sliderId;
    }

    public String getSliderImage() {
        return sliderImage;
    }

    public void setSliderImage(String sliderImage) {
        this.sliderImage = sliderImage;
    }

    public String getSliderTitle() {
        return sliderTitle;
    }

    public void setSliderTitle(String sliderTitle) {
        this.sliderTitle = sliderTitle;
    }

    public String getSliderUrl() {
        return sliderUrl;
    }

    public void setSliderUrl(String sliderUrl) {
        this.sliderUrl = sliderUrl;
    }
}
