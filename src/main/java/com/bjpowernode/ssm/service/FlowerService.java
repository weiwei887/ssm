package com.bjpowernode.ssm.service;


import com.bjpowernode.ssm.bean.Flower;
import com.bjpowernode.ssm.bean.QueryVo;

import java.util.List;
import java.util.Map;

public interface FlowerService {
  List<Map<String,String>> list( QueryVo queryVo);

    List<Map<String, String>> queryByCategory(String cid);

    void addFlower(Flower flower);

   Flower queryByFid(String fid);

    void deleteBatch(String fids);

    // List<Flower>list01();
}
