package com.example.jianshuapi.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Collections {
    @Id
    @Column(name = "label_id")
    private Integer labelId;

    @Column(name = "label_articles_count")
    private Integer labelArticlesCount;

    @Column(name = "label_avatar")
    private String labelAvatar;

    @Column(name = "label_follow_count")
    private Integer labelFollowCount;

    @Column(name = "label_summary")
    private String labelSummary;

    @Column(name = "label_title")
    private String labelTitle;

    /**
     * @return label_id
     */
    public Integer getLabelId() {
        return labelId;
    }

    /**
     * @param labelId
     */
    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    /**
     * @return label_articles_count
     */
    public Integer getLabelArticlesCount() {
        return labelArticlesCount;
    }

    /**
     * @param labelArticlesCount
     */
    public void setLabelArticlesCount(Integer labelArticlesCount) {
        this.labelArticlesCount = labelArticlesCount;
    }

    /**
     * @return label_avatar
     */
    public String getLabelAvatar() {
        return labelAvatar;
    }

    /**
     * @param labelAvatar
     */
    public void setLabelAvatar(String labelAvatar) {
        this.labelAvatar = labelAvatar;
    }

    /**
     * @return label_follow_count
     */
    public Integer getLabelFollowCount() {
        return labelFollowCount;
    }

    /**
     * @param labelFollowCount
     */
    public void setLabelFollowCount(Integer labelFollowCount) {
        this.labelFollowCount = labelFollowCount;
    }

    /**
     * @return label_summary
     */
    public String getLabelSummary() {
        return labelSummary;
    }

    /**
     * @param labelSummary
     */
    public void setLabelSummary(String labelSummary) {
        this.labelSummary = labelSummary;
    }

    /**
     * @return label_title
     */
    public String getLabelTitle() {
        return labelTitle;
    }

    /**
     * @param labelTitle
     */
    public void setLabelTitle(String labelTitle) {
        this.labelTitle = labelTitle;
    }
}