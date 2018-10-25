package com.example.jianshuapi.service.impl;

import com.soft1611.jianshu.core.AbstractService;
import com.soft1611.jianshu.dao.CarouselMapper;
import com.soft1611.jianshu.model.Carousel;
import com.soft1611.jianshu.service.CarouselService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by xupeng on 2018/10/25.
 */
@Service
@Transactional
public class CarouselServiceImpl extends AbstractService<Carousel> implements CarouselService {
    @Resource
    private CarouselMapper carouselMapper;

}
