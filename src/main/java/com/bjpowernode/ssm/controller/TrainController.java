package com.bjpowernode.ssm.controller;

import com.bjpowernode.ssm.bean.Category;
import com.bjpowernode.ssm.bean.Train;
import com.bjpowernode.ssm.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.ssm.controller
 * @Description: java类作用描述
 * @Author: 刘微
 * @CreateDate: 2020/11/13 15:37
 * @Version: 1.0
 * Copyright: Copyright (c) 2020
 */

@Controller
public class TrainController {
    //查询车次列表信息
    @Autowired
    private TrainService trainService;

    @RequestMapping("/selectTrain")
    public String selectTrain(Model model, String tid) {
        List<Train> trains = trainService.selectTrain(tid);
        model.addAttribute("tid", tid);

        model.addAttribute("trains", trains);
        return "train";
    }

    //购买车次，应该是由前台传入选中的复选框和后台进行比对，然后回显出来
    @RequestMapping()
    public String buyTicket(){
        return buyTicket();
    }


}
