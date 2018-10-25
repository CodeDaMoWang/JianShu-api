package com.example.jianshuapi.service.impl;

import com.soft1611.jianshu.core.AbstractService;
import com.soft1611.jianshu.dao.AuthorMapper;
import com.soft1611.jianshu.model.Author;
import com.soft1611.jianshu.service.AuthorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by xupeng on 2018/10/25.
 */
@Service
@Transactional
public class AuthorServiceImpl extends AbstractService<Author> implements AuthorService {
    @Resource
    private AuthorMapper authorMapper;

}
