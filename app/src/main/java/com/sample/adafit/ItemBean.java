package com.sample.adafit;


import com.jpadapter.util.NormalH;

/**
 * Created by jon on 2016/9/28.
 *
 */
@NormalH(holderName = ItemH.class)
public class ItemBean {
    private String txt;

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getTxt() {
        return txt;
    }
}
