package com.jpadapter.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;


import com.jpadapter.holder.INormalHolder;
import com.jpadapter.util.AdaptTypeUtil;

import java.util.List;


/**
 * Created by john on 16-7-11.<br/>
 * 单重布局适配器
 */

public class NormalAdapter<T> extends SuperAdapter<T> {

    private Class holderCls;//item的复用类

    public NormalAdapter(List<T> list, Context mContext) {
        super(list, mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        T o = list.get(position);
        if (holderCls == null)
            holderCls = AdaptTypeUtil.getAnnotaionHolder(o);
        INormalHolder normalHolder = INormalHolder.getINorMalHolder(convertView, holderCls, mContext);
        /**复用类中需要用到的最基bean对象*/
        normalHolder.setData(o);
        normalHolder.setIndex(position);
        Log.i("view", normalHolder.getConvertView()+"--pos="+position);
        return normalHolder.getConvertView();
    }



}
