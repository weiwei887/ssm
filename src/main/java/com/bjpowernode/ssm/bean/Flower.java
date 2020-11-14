package com.bjpowernode.ssm.bean;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.ssm.bean
 * @Description: java类作用描述
 * @Author: 刘微
 * @CreateDate: 2020/11/10 20:59
 * @Version: 1.0
 * Copyright: Copyright (c) 2020
 */
@Table(name ="t_flower")
public class Flower {

    @Id
    @KeySql(useGeneratedKeys = true)
    private  String fid;
    private  String fname;
    private  String price;
    private  String cid;

    private Category catagory;

    public Flower() {
    }

    public Flower(String fid, String fname, String price, String cid, Category catagory) {
        this.fid = fid;
        this.fname = fname;
        this.price = price;
        this.cid = cid;
        this.catagory = catagory;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Category getCatagory() {
        return catagory;
    }

    public void setCatagory(Category catagory) {
        this.catagory = catagory;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "fid='" + fid + '\'' +
                ", fname='" + fname + '\'' +
                ", price='" + price + '\'' +
                ", cid='" + cid + '\'' +
                ", catagory=" + catagory +
                '}';
    }
}
