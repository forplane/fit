package com.jpadapter.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


import java.util.List;

/**
 * Created by planes on 2016/8/25.
 */

public abstract class SuperAdapter<T> extends BaseAdapter {
    protected List<T> list;
    protected Context mContext;

    public SuperAdapter(List<T> list, Context mContext) {
        this.list=list;
        this.mContext=mContext;
    }

    public void updateLists(List<T> list){
        this.list=list;
        notifyDataSetChanged();
    }



    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        T t = list.get(position);
        return t;
    }

    @Override
    public abstract View getView(int i, View view, ViewGroup viewGroup);

    @Override
    public long getItemId(int position) {
        return position;
    }

}
