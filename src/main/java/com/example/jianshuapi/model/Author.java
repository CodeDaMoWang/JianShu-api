package com.example.jianshuapi.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Author {
    @Id
    @Column(name = "author_id")
    private Integer authorId;

    private String account;

    @Column(name = "author_article_count")
    private Integer authorArticleCount;

    @Column(name = "author_avatar")
    private String authorAvatar;

    @Column(name = "author_description")
    private String authorDescription;

    @Column(name = "author_fans_count")
    private Integer authorFansCount;

    @Column(name = "author_favorite_count")
    private Integer authorFavoriteCount;

    @Column(name = "author_follow_count")
    private Integer authorFollowCount;

    @Column(name = "author_nickname")
    private String authorNickname;

    @Column(name = "author_words_count")
    private Integer authorWordsCount;

    private String password;

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
     * @return account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return author_article_count
     */
    public Integer getAuthorArticleCount() {
        return authorArticleCount;
    }

    /**
     * @param authorArticleCount
     */
    public void setAuthorArticleCount(Integer authorArticleCount) {
        this.authorArticleCount = authorArticleCount;
    }

    /**
     * @return author_avatar
     */
    public String getAuthorAvatar() {
        return authorAvatar;
    }

    /**
     * @param authorAvatar
     */
    public void setAuthorAvatar(String authorAvatar) {
        this.authorAvatar = authorAvatar;
    }

    /**
     * @return author_description
     */
    public String getAuthorDescription() {
        return authorDescription;
    }

    /**
     * @param authorDescription
     */
    public void setAuthorDescription(String authorDescription) {
        this.authorDescription = authorDescription;
    }

    /**
     * @return author_fans_count
     */
    public Integer getAuthorFansCount() {
        return authorFansCount;
    }

    /**
     * @param authorFansCount
     */
    public void setAuthorFansCount(Integer authorFansCount) {
        this.authorFansCount = authorFansCount;
    }

    /**
     * @return author_favorite_count
     */
    public Integer getAuthorFavoriteCount() {
        return authorFavoriteCount;
    }

    /**
     * @param authorFavoriteCount
     */
    public void setAuthorFavoriteCount(Integer authorFavoriteCount) {
        this.authorFavoriteCount = authorFavoriteCount;
    }

    /**
     * @return author_follow_count
     */
    public Integer getAuthorFollowCount() {
        return authorFollowCount;
    }

    /**
     * @param authorFollowCount
     */
    public void setAuthorFollowCount(Integer authorFollowCount) {
        this.authorFollowCount = authorFollowCount;
    }

    /**
     * @return author_nickname
     */
    public String getAuthorNickname() {
        return authorNickname;
    }

    /**
     * @param authorNickname
     */
    public void setAuthorNickname(String authorNickname) {
        this.authorNickname = authorNickname;
    }

    /**
     * @return author_words_count
     */
    public Integer getAuthorWordsCount() {
        return authorWordsCount;
    }

    /**
     * @param authorWordsCount
     */
    public void setAuthorWordsCount(Integer authorWordsCount) {
        this.authorWordsCount = authorWordsCount;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}