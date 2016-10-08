package com.jpadapter.holder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import java.lang.reflect.Constructor;

/**
 * Created by john on 16-7-11.
 */

public abstract class INormalHolder<T> extends SuperHolder<T> {
    public INormalHolder(Context ctx) {
        super(ctx);
    }



    public static INormalHolder getINorMalHolder(View convertView, Class cls, Context mContext){
        /**复用类的最基对象*/
        INormalHolder normalHolder=null;
        if (convertView==null){
            try {
                Constructor c1=cls.getDeclaredConstructor(new Class[]{Context.class});
                c1.setAccessible(true);
                normalHolder = (INormalHolder) c1.newInstance(new Object[]{mContext});
            } catch (Exception e) {
                throw new NullPointerException("holder class 不能为null");
            }
            convertView= LayoutInflater.from(mContext).inflate(normalHolder.layout,null);
            normalHolder.convertView=convertView;
            normalHolder.initView(convertView);
            convertView.setTag(normalHolder);
        }else{
            normalHolder=(INormalHolder)convertView.getTag();
            normalHolder.convertView = convertView;
        }
        return normalHolder;
    }
}
