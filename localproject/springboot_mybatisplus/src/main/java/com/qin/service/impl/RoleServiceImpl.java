package com.qin.service.impl;

import com.qin.entity.Role;
import com.qin.dao.RoleDao;
import com.qin.service.RoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色信息表 服务实现类
 * </p>
 *
 * @author AAATeacherChen
 * @since 2020-06-23
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements RoleService {

}
