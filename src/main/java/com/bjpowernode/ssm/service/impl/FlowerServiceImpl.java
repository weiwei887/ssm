package com.bjpowernode.ssm.service.impl;

import com.bjpowernode.ssm.bean.Flower;
import com.bjpowernode.ssm.bean.QueryVo;
import com.bjpowernode.ssm.mapper.FlowerMapper;
import com.bjpowernode.ssm.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.ssm.service.impl
 * @Description: java类作用描述
 * @Author: 刘微
 * @CreateDate: 2020/11/10 21:05
 * @Version: 1.0
 * Copyright: Copyright (c) 2020
 */

@Service("flowerService")
public class FlowerServiceImpl implements FlowerService {

    @Autowired
    private FlowerMapper flowerMapper;

    @Override
    public List<Map<String, String>> list(QueryVo queryVo) {

        return flowerMapper.list(queryVo);
    }

    @Override
    public List<Map<String, String>> queryByCategory(String cid) {
        return flowerMapper.queryByCategory(cid);
    }

    @Override
    public void addFlower(Flower flower) {
        //添加的时候flower没有fid  修改的时候有fid
        if ("".equals(flower.getFid() != null) && flower.getFid()!=null) {
            flowerMapper.updateByPrimaryKeySelective(flower);
        } else {
            flowerMapper.insertSelective(flower);
        }

    }

    @Override
    public Flower queryByFid(String fid) {
        return flowerMapper.selectByPrimaryKey(fid);
    }

    @Override
    public void deleteBatch(String fids) {
        String[] splits = fids.split(",");
        for (String fid:splits) {
            flowerMapper.deleteByPrimaryKey(fid);
        }

    }

  /*  @Override
    public List<Flower> list01() {
        return flowerMapper.list01();
    }
*/

}
