package com.qwz.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qwz.service.MappingProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mappingProject")
public class MappingProjectController {
    @Autowired
    private MappingProjectService mappingProjectService;
    @RequestMapping("/selectAll")
    public PageInfo selectAll(@RequestParam("currentPage") Integer currentPage,@RequestParam("pageSize") Integer pageSize,
                              @RequestParam("userId") Integer userId) throws Exception {

       return mappingProjectService.selectSuccessRegister(userId,currentPage,pageSize);
    }
}
