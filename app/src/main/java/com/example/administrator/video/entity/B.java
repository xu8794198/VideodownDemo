package com.example.administrator.video.entity;

import java.lang.ref.PhantomReference;
import java.util.Arrays;

/**
 * 实体类2
 * Created by Administrator on 2016/12/7.
 */
public class B {

    private int id;//	动画/漫画编号
    private String name;	//动画/漫画名称
    private int fmPic;	//封面图
    private int totalCount;//	总集数
    private String description;//	动画/漫画描述
    private int view;	//访问次数
    private int date;	//发布日期
    private int typeNames;	//类别名称列表
    private boolean isSc;	//是否已经收藏，布尔型，true是，false否
    private C[] itemlist;//C类集合


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public C[] getItemlist() {
        return itemlist;
    }

    public void setItemlist(C[] list) {
        this.itemlist = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFmPic() {
        return fmPic;
    }

    public void setFmPic(int fmPic) {
        this.fmPic = fmPic;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTypeNames() {
        return typeNames;
    }

    public void setTypeNames(int typeNames) {
        this.typeNames = typeNames;
    }

    public boolean isSc() {
        return isSc;
    }

    public void setIsSc(boolean isSc) {
        this.isSc = isSc;
    }

    @Override
    public String toString() {
        return "B{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fmPic=" + fmPic +
                ", totalCount=" + totalCount +
                ", description='" + description + '\'' +
                ", view=" + view +
                ", date=" + date +
                ", typeNames=" + typeNames +
                ", isSc=" + isSc +
                ", itemlist=" + Arrays.toString(itemlist) +
                '}';
    }
}
