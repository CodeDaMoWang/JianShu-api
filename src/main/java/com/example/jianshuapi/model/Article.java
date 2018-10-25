package com.example.jianshuapi.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Article {
    @Id
    @Column(name = "article_id")
    private Integer articleId;

    @Column(name = "article_comment_count")
    private Integer articleCommentCount;

    @Column(name = "article_content")
    private String articleContent;

    @Column(name = "article_like_count")
    private Integer articleLikeCount;

    @Column(name = "article_publish_time")
    private String articlePublishTime;

    @Column(name = "article_read_count")
    private Integer articleReadCount;

    @Column(name = "article_summary")
    private String articleSummary;

    @Column(name = "article_thumbnail")
    private String articleThumbnail;

    @Column(name = "article_title")
    private String articleTitle;

    @Column(name = "article_words_count")
    private Integer articleWordsCount;

    @Column(name = "author_id")
    private Integer authorId;

    @Column(name = "label_id")
    private Integer labelId;

    /**
     * @return article_id
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * @param articleId
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * @return article_comment_count
     */
    public Integer getArticleCommentCount() {
        return articleCommentCount;
    }

    /**
     * @param articleCommentCount
     */
    public void setArticleCommentCount(Integer articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    /**
     * @return article_content
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * @param articleContent
     */
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    /**
     * @return article_like_count
     */
    public Integer getArticleLikeCount() {
        return articleLikeCount;
    }

    /**
     * @param articleLikeCount
     */
    public void setArticleLikeCount(Integer articleLikeCount) {
        this.articleLikeCount = articleLikeCount;
    }

    /**
     * @return article_publish_time
     */
    public String getArticlePublishTime() {
        return articlePublishTime;
    }

    /**
     * @param articlePublishTime
     */
    public void setArticlePublishTime(String articlePublishTime) {
        this.articlePublishTime = articlePublishTime;
    }

    /**
     * @return article_read_count
     */
    public Integer getArticleReadCount() {
        return articleReadCount;
    }

    /**
     * @param articleReadCount
     */
    public void setArticleReadCount(Integer articleReadCount) {
        this.articleReadCount = articleReadCount;
    }

    /**
     * @return article_summary
     */
    public String getArticleSummary() {
        return articleSummary;
    }

    /**
     * @param articleSummary
     */
    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary;
    }

    /**
     * @return article_thumbnail
     */
    public String getArticleThumbnail() {
        return articleThumbnail;
    }

    /**
     * @param articleThumbnail
     */
    public void setArticleThumbnail(String articleThumbnail) {
        this.articleThumbnail = articleThumbnail;
    }

    /**
     * @return article_title
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * @param articleTitle
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    /**
     * @return article_words_count
     */
    public Integer getArticleWordsCount() {
        return articleWordsCount;
    }

    /**
     * @param articleWordsCount
     */
    public void setArticleWordsCount(Integer articleWordsCount) {
        this.articleWordsCount = articleWordsCount;
    }

    /**
     * @return author_id
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * @param authorId
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

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
}