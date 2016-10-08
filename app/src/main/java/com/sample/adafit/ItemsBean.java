package com.sample.adafit;


import com.jpadapter.util.ManyH;
import com.jpadapter.util.TypeH;

/**
 * Created by jon on 2016/9/28.<br/>
 */
@ManyH(holders = {ItemsLeftH.class,ItemsRightH.class})
public class ItemsBean {
    @TypeH//注解类型字段
    private int type;//哪一种布局 0:ItemsLeftH 1:ItemsRightH

    private String txt;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
