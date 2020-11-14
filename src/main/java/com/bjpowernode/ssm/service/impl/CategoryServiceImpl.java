package com.bjpowernode.ssm.service.impl;

import com.bjpowernode.ssm.bean.Category;
import com.bjpowernode.ssm.mapper.CategoryMapper;
import com.bjpowernode.ssm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.ssm.service.impl
 * @Description: java类作用描述
 * @Author: 刘微
 * @CreateDate: 2020/11/11 19:18
 * @Version: 1.0
 * Copyright: Copyright (c) 2020
 */

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
@Autowired
private CategoryMapper categoryMapper;

    @Override
    public List<Category> getCategroies() {
        return categoryMapper.selectAll();
    }
}
