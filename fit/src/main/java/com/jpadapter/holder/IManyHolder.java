package com.jpadapter.holder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import java.lang.reflect.Constructor;

/**
 * Created by planes on 2016/8/25.
 */
public class IManyHolder<T> extends SuperHolder<T> {

    public IManyHolder(Context ctx) {
        super(ctx);
    }

    @Override
    public void initView(View view) {

    }

    private static IManyHolder initholderByClass(Context mContext, Class cls) {
        Constructor c1 = null;
        IManyHolder holder = null;
        try {
            c1 = cls.getDeclaredConstructor(Context.class);
            c1.setAccessible(true);
            holder = (IManyHolder) c1.newInstance(mContext);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return holder;
    }

    public static IManyHolder getIManyHolder(View convertView, Context mContext, Class holderCls) {
        IManyHolder manyHolder;
        if (convertView == null) {
            manyHolder=initHolder(mContext, holderCls);
        } else {
            manyHolder = (IManyHolder) convertView.getTag();
            if (!holderCls.getName().equals(manyHolder.getClass().getName())) {
                manyHolder=initHolder(mContext, holderCls);
            }
        }
        return manyHolder;
    }

    private static IManyHolder initHolder(Context mContext, Class holderCls){
        IManyHolder manyHolder = initholderByClass(mContext, holderCls);
        View convertView = LayoutInflater.from(mContext).inflate(manyHolder.layout, null);
        manyHolder.convertView=convertView;
        manyHolder.initView(convertView);
        convertView.setTag(manyHolder);
        return manyHolder;
    }



}
