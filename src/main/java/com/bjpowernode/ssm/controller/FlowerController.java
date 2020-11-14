package com.bjpowernode.ssm.controller;

import com.bjpowernode.ssm.bean.Flower;
import com.bjpowernode.ssm.bean.QueryVo;
import com.bjpowernode.ssm.service.FlowerService;
import com.bjpowernode.ssm.util.PageHelpUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.ssm.controller
 * @Description: java类作用描述
 * @Author: 刘微
 * @CreateDate: 2020/11/10 21:02
 * @Version: 1.0
 * Copyright: Copyright (c) 2020
 */

@Controller
public class FlowerController {
    @Autowired
    private FlowerService flowerService;
    //自定义每页所需数
    private int pageSize = 3;

    //该方法实现多种功能
    @RequestMapping({"/index", "/"})// @RequestParam可以定义默认值
    public String index(Model model, @RequestParam(defaultValue = "1") int page, QueryVo queryVo) {
        //分页：如果为空默认为第一页,等同于limit a，b
        PageHelper.startPage(page, pageSize);
        List<Map<String, String>> mapList = flowerService.list(queryVo);
        PageInfo<Map<String, String>> pageInfo = new PageInfo<>(mapList);

        //把前台查询的条件封装到map里
        Map<String, Object> params = new HashMap<>();
        params.put("cid", queryVo.getCid());
        params.put("fname", queryVo.getFname());
        params.put("start", queryVo.getStart());
        params.put("end", queryVo.getEnd());

        /*向前台返回也么字符串
         * 参数1：url:每次点击页码调用后台的地址
         * 参数2：pageInfo：数据
         * 参数3：paraMap：用于查询的时候封装查询参数
         * */
        String page1 = PageHelpUtil.bootStrapPage("/ssm", pageInfo, params);
        // List<Flower> flowers = flowerService.list01();
        model.addAttribute("mapList", pageInfo.getList());
        model.addAttribute("page1", page1);
        //查询条件回显
        model.addAttribute("queryVo", queryVo);
        return "index";

    }
        //添加或者修改鲜花
    @RequestMapping("/addFlower")
    public String addFlower(Flower flower){
        flowerService.addFlower(flower);
        return "forward:/index";
    }

    /*根据主键查询鲜花*/
    @RequestMapping("/queryByFid")
    @ResponseBody
    public Flower queryByFid(String fid){
       Flower flower= flowerService.queryByFid(fid);
        return flower;
    }


    //单删和批删
    @RequestMapping("/deleteBatch")
    public String deleteBatch(String fids){
        flowerService.deleteBatch(fids);
        return "forward:/index";
    }

  /*  //查询选中种类下的所有鲜花
    @RequestMapping("/queryByCategory")
    @ResponseBody
    public List<Map<String, String>> queryByCategory(String cid) {
        List<Map<String, String>> query = flowerService.queryByCategory(cid);
        return query;
    }*/
}
