package com.bjpowernode.ssm.service.impl;

import com.bjpowernode.ssm.bean.Train;
import com.bjpowernode.ssm.mapper.NumberMapper;
import com.bjpowernode.ssm.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.ssm.service.impl
 * @Description: java类作用描述
 * @Author: 刘微
 * @CreateDate: 2020/11/13 20:45
 * @Version: 1.0
 * Copyright: Copyright (c) 2020
 */

@Service("numberService")
public class NumberServiceImpl implements NumberService {
    @Autowired//注入mapper层，注入后dao.xml文件里配置了创建mapper实现类的标签
    private NumberMapper numberMapper;

    @Override
    public List<Train> getNumbers() {
        return numberMapper.selectAll();
    }
}
