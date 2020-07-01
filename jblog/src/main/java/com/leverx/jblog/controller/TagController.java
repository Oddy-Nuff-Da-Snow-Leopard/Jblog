package com.leverx.jblog.controller;

import com.leverx.jblog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/jblog/articles/tag_cloud")
public class TagController {

    @Autowired
    private TagService tagService;

    @GetMapping
    public Map<String, Long> countAllTagsInAllArticles() {
        return tagService.tagCloud();
    }
}
