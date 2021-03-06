package com.qwz.service;

import com.qwz.base.BaseService;
import com.qwz.mapper.AuditMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;

@Service
public class AuditService extends BaseService<Audit>{
    @Autowired
    private AuditMapper auditMapper;


    @Override
    protected Mapper getMapper() {
        super.mapper=auditMapper;
        return auditMapper;
    }

    public List<Audit> select(){
        return getMapper().selectAll();
    }
}
