package com.qin.service.impl;

import com.qin.entity.Dept;
import com.qin.dao.DeptDao;
import com.qin.service.DeptService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author AAATeacherChen
 * @since 2020-06-23
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptDao, Dept> implements DeptService {

}
