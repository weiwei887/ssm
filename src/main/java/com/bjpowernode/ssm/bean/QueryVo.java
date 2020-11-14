package com.bjpowernode.ssm.bean;

import org.apache.ibatis.annotations.Param;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.ssm.bean
 * @Description: 自定义pojo
 * @Author: 刘微
 * @CreateDate: 2020/11/12 15:53
 * @Version: 1.0
 * Copyright: Copyright (c) 2020
 */
/*
* 查询条件复杂
* 多个查询条件
* 多表的查询
**/

public class QueryVo {
        private String cid;
        private  String fname;
        private  String start;
        private  String end;

    @Override
    public String toString() {
        return "QueryVo{" +
                "cid='" + cid + '\'' +
                ", fname='" + fname + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                '}';
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

}
