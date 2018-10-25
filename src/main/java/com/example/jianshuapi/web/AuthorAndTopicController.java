package com.example.jianshuapi.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.soft1611.jianshu.core.Result;
import com.soft1611.jianshu.core.ResultGenerator;
import com.soft1611.jianshu.model.AuthorAndTopic;
import com.soft1611.jianshu.service.AuthorAndTopicService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by xupeng on 2018/10/25.
*/
@RestController
@RequestMapping("/author/and/topic")
public class AuthorAndTopicController {
    @Resource
    private AuthorAndTopicService authorAndTopicService;

    @PostMapping("/add")
    public Result add(AuthorAndTopic authorAndTopic) {
        authorAndTopicService.save(authorAndTopic);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        authorAndTopicService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(AuthorAndTopic authorAndTopic) {
        authorAndTopicService.update(authorAndTopic);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        AuthorAndTopic authorAndTopic = authorAndTopicService.findById(id);
        return ResultGenerator.genSuccessResult(authorAndTopic);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<AuthorAndTopic> list = authorAndTopicService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
