package com.bjpowernode.ssm.bean;

import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.ssm.bean
 * @Description: java类作用描述
 * @Author: 刘微
 * @CreateDate: 2020/11/10 21:01
 * @Version: 1.0
 * Copyright: Copyright (c) 2020
 */
@Table(name= "t_category")
public class Category {


    @Id
    @KeySql(useGeneratedKeys = true)
    private String cid;
    private String cname;

    public Category() {
    }

    public Category(String cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}