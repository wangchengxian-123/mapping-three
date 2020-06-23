package com.qin.service.impl;

import com.qin.entity.UserRole;
import com.qin.dao.UserRoleDao;
import com.qin.service.UserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户和角色关联表 服务实现类
 * </p>
 *
 * @author AAATeacherChen
 * @since 2020-06-23
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRole> implements UserRoleService {

}
