package com.jpadapter.holder;

import android.view.View;

/**
 * Created by john on 16-7-1.
 * adapter中复用类接口
 */

public interface IHolder<T> extends IViewOpe{
    /**处理操作控件*/
    void initView(View view);

    /**传入一个bean处理数据*/
    void setData(T t);
}
