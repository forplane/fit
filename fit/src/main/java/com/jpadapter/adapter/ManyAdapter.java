package com.jpadapter.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;


import com.jpadapter.holder.IManyHolder;
import com.jpadapter.util.AdaptTypeUtil;

import java.util.List;

/**
 * Created by planes on 2016/8/25.<br/>
 * 多重item布局适配器
 */

public class ManyAdapter<T> extends SuperAdapter<T> {


    public ManyAdapter(List<T> list, Context mContext){
        super(list,mContext);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        /**复用类中需要用到的最基bean对象*/
        T o = list.get(position);
        int type = AdaptTypeUtil.getAnnotaionType(o);
        Class[] classes = AdaptTypeUtil.getAnnotaionHolders(o);
        Class aClass =classes[type];
        IManyHolder manyHolder = IManyHolder.getIManyHolder(convertView,mContext,aClass);
        manyHolder.setIndex(position);
        manyHolder.setData(o);
        return manyHolder.getConvertView();
    }


}
