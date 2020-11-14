package com.bjpowernode.ssm.controller;

import com.bjpowernode.ssm.bean.Train;
import com.bjpowernode.ssm.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.ssm.controller
 * @Description: java类作用描述
 * @Author: 刘微
 * @CreateDate: 2020/11/13 20:42
 * @Version: 1.0
 * Copyright: Copyright (c) 2020
 */

@Controller
public class NumberController {

    @Autowired//注入service层
    private NumberService numberService;

    @RequestMapping("/getNumbers")
    //查询所有车次
    @ResponseBody
    public List<Train>getNumbers(){
        return numberService.getNumbers();
    }

}
