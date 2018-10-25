package com.example.jianshuapi.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Carousel {
    @Id
    @Column(name = "carousel_img_id")
    private Integer carouselImgId;

    @Column(name = "carousel_img_url")
    private String carouselImgUrl;

    /**
     * @return carousel_img_id
     */
    public Integer getCarouselImgId() {
        return carouselImgId;
    }

    /**
     * @param carouselImgId
     */
    public void setCarouselImgId(Integer carouselImgId) {
        this.carouselImgId = carouselImgId;
    }

    /**
     * @return carousel_img_url
     */
    public String getCarouselImgUrl() {
        return carouselImgUrl;
    }

    /**
     * @param carouselImgUrl
     */
    public void setCarouselImgUrl(String carouselImgUrl) {
        this.carouselImgUrl = carouselImgUrl;
    }
}