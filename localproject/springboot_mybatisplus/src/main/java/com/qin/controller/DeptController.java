package com.qin.controller;


import com.qin.entity.Dept;
import com.qin.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 部门表 前端控制器
 * </p>
 *
 * @author AAATeacherChen
 * @since 2020-06-23
 */
@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @GetMapping("/all")
   public String all(Map map){
        List<Dept> depts = deptService.selectList(null);
        map.put("list",depts);
        return "list";

    }
}

