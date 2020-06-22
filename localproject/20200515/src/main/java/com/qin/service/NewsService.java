package com.qin.service;

import com.github.pagehelper.PageInfo;
import com.qin.entity.News;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Service;


public interface NewsService {
    PageInfo<News> list(Integer curretnPage, Integer pagesize);
    int add(News news);
}
