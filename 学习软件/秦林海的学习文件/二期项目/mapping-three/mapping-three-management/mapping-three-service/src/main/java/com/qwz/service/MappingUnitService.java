package com.qwz.service;

import com.qwz.base.BaseService;
import com.qwz.mapper.MappingUnitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service
public class MappingUnitService  extends BaseService<MappingUnit> {
    @Autowired
    private MappingUnitMapper mappingUnitMapper;
    @Override
    protected Mapper getMapper() {
        super.mapper=this.mappingUnitMapper;
        return mappingUnitMapper;
    }


}
