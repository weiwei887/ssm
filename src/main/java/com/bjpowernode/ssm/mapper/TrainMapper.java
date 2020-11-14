package com.bjpowernode.ssm.mapper;

import com.bjpowernode.ssm.bean.Train;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TrainMapper extends Mapper<Train>{


    List<Train> selectTrain(@Param("tid") String tid);
}

