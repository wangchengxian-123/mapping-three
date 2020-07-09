package com.qwz.base;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

public abstract class BaseService<T> {
    @Autowired
    private Mapper<T> mapper;

    protected Mapper getMapper(){
        return mapper;
    }
    public ResultData insertData(T t){
        int insert = mapper.insert(t);
        if(insert>0){
            ResultData resultData=new ResultData();
            resultData.setData(insert);
        }
        return null;
    }
}
