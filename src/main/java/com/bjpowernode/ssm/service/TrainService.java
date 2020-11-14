package com.bjpowernode.ssm.service;

import com.bjpowernode.ssm.bean.Train;

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


public interface TrainService {

    List<Train> selectTrain(String tid);


}
