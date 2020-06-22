package com.qin.controller;

import com.github.pagehelper.PageInfo;
import com.qin.entity.News;
import com.qin.service.FileHandleService;
import com.qin.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("news")
public class NewsController {
    @Autowired
    private NewsService newsService;
    @Autowired
    private FileHandleService fileHandleService;
    @GetMapping("/query")
    public PageInfo<News> query(@RequestParam("currentPage") Integer currentPage,@RequestParam("pageSize") Integer pageSize){
        return newsService.list(currentPage,pageSize);
    }
    @PostMapping("/add")
    public int add(@RequestBody News news){
        return newsService.add(news);
    }

    @RequestMapping("/upFile")
    public Object upFile(@RequestParam MultipartFile file) throws IOException {
        return fileHandleService.upload(file,"news/images");
    }
}
