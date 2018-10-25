package com.example.jianshuapi.service.impl;

import com.soft1611.jianshu.core.AbstractService;
import com.soft1611.jianshu.dao.ArticleMapper;
import com.soft1611.jianshu.model.Article;
import com.soft1611.jianshu.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by xupeng on 2018/10/25.
 */
@Service
@Transactional
public class ArticleServiceImpl extends AbstractService<Article> implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

}
