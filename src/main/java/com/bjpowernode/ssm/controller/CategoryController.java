package com.bjpowernode.ssm.controller;

import com.bjpowernode.ssm.bean.Category;
import com.bjpowernode.ssm.bean.Flower;
import com.bjpowernode.ssm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.ssm.controller
 * @Description: java类作用描述
 * @Author: 刘微
 * @CreateDate: 2020/11/11 19:11
 * @Version: 1.0
 * Copyright: Copyright (c) 2020
 */

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    //查询所有鲜花种类
    @RequestMapping("/getCategroies")
    @ResponseBody
    public List<Category>getCategroies(){
     return  categoryService.getCategroies();
    }

}
