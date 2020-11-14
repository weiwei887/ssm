package com.bjpowernode.ssm.mapper;


import com.bjpowernode.ssm.bean.Flower;
import com.bjpowernode.ssm.bean.QueryVo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;


public interface FlowerMapper extends Mapper<Flower>{

  List<Map<String,String>> list(QueryVo queryVo);

    List<Map<String, String>> queryByCategory(String cid);

    //List<Flower> list01();
}
