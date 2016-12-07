package com.example.administrator.video.entity;

/**
 * 实体类3
 * Created by Administrator on 2016/12/7.
 */
public class C {
    private int itemNum;//当前剧集
    private String itemName;//当前剧集小标题
    private String iteUrl;//当前剧集地址

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public String getIteUrl() {
        return iteUrl;
    }

    public void setIteUrl(String iteUrl) {
        this.iteUrl = iteUrl;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "C{" +
                "itemNum=" + itemNum +
                ", itemName='" + itemName + '\'' +
                ", iteUrl='" + iteUrl + '\'' +
                '}';
    }
}
