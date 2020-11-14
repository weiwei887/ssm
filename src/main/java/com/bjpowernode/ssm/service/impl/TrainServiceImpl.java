package com.bjpowernode.ssm.service.impl;

import com.bjpowernode.ssm.bean.Train;
import com.bjpowernode.ssm.mapper.TrainMapper;
import com.bjpowernode.ssm.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.ssm.service.impl
 * @Description: java类作用描述
 * @Author: 刘微
 * @CreateDate: 2020/11/13 15:49
 * @Version: 1.0
 * Copyright: Copyright (c) 2020
 */

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainMapper trainMapper;


    @Override
    public List<Train> selectTrain(String tid) {
        List<Train> trains = trainMapper.selectTrain(tid);
        return trains;
    }

}
