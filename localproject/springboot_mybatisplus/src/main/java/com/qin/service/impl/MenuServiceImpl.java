package com.qin.service.impl;

import com.qin.entity.Menu;
import com.qin.dao.MenuDao;
import com.qin.service.MenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单权限表 服务实现类
 * </p>
 *
 * @author AAATeacherChen
 * @since 2020-06-23
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuDao, Menu> implements MenuService {

}
