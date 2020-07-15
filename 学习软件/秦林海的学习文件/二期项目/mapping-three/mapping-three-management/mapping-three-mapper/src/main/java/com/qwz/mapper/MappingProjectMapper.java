package com.qwz.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
@Repository
public interface MappingProjectMapper extends Mapper<MappingProject> {

    /**
     * @author  qlh
     * @date   2020/7/14
     * @desc
     * 查询成功登记的项目信息
     **/
    @Select("select * from t_mapping_project where user_id=#{userId} and audit_status=0")
    List<MappingProject> selectSuccessRegister(@Param("userId") Integer userID);
}