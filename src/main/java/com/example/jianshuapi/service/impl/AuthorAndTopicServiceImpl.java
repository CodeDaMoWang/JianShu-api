package com.example.jianshuapi.service.impl;

import com.soft1611.jianshu.core.AbstractService;
import com.soft1611.jianshu.dao.AuthorAndTopicMapper;
import com.soft1611.jianshu.model.AuthorAndTopic;
import com.soft1611.jianshu.service.AuthorAndTopicService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by xupeng on 2018/10/25.
 */
@Service
@Transactional
public class AuthorAndTopicServiceImpl extends AbstractService<AuthorAndTopic> implements AuthorAndTopicService {
    @Resource
    private AuthorAndTopicMapper authorAndTopicMapper;

}
