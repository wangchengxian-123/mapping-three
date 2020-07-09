package com.qwz.controller;

import com.qwz.base.BaseService;
import com.qwz.base.CommonController;
import com.qwz.base.ResultData;
import com.qwz.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class UserController extends CommonController<User> {
    @Autowired
    private BaseService<User> userService;

    @Override
    public BaseService<User> getBaseService() {
        return userService;
    }



    public ResultData inserData(User user){
        ResultData resultData = getBaseService().insertData(user);
        return resultData;
    }

}
