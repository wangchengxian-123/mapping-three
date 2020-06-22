package com.qin.mapper;

import com.qin.entity.News;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface NewsMapper {
    @Select("select * from tb_news")
    List<News> list();
    @Insert("insert into tb_news (title,content,clicknum,path,addtime) values(#{title},#{content},#{clicknum},#{path},#{addtime})")
    int add(News news);

}
