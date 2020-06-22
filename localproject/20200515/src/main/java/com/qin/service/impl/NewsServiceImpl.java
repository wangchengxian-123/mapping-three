package com.qin.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qin.entity.News;
import com.qin.mapper.NewsMapper;
import com.qin.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsMapper newsMapper;
    @Override
    public PageInfo<News> list(Integer curretnPage, Integer pagesize) {
        PageHelper.offsetPage((curretnPage-1)*pagesize,pagesize);
        List<News> list = newsMapper.list();
        PageInfo<News> list1=new PageInfo<>(list);
        return list1;
    }

    @Override
    public int add(News news) {
        return newsMapper.add(news);
    }
}
