package com.jpadapter.holder;


import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by john on 16-7-1.<br/>
 */

public abstract class SuperHolder<T> implements IHolder<T> {
    protected int layout;
    protected int index;//存放索引位置
    protected T bean;
    protected Context mContext;
    protected View convertView;

    public void setConvertView(View convertView) {
        this.convertView = convertView;
    }

    public View getConvertView() {
        return convertView;
    }

    public SuperHolder(Context ctx) {
        this.mContext = ctx;
    }

    /**
     * 传入一个bean处理数据
     */
    public void setData(T t) {
        this.bean = t;
    }

    /**
     * 主要是为了防止需要索引的情况预防的
     */
    public void setIndex(int index) {
        this.index = index;
    }


    @Override
    public TextView setTvText(int tvId, String text) {
        TextView tv = (TextView) getView(tvId);
        tv.setText(text);
        return tv;
    }

    /**
     * @deprecated 不可使用 暂不支持网络图片设置
     */
    @Override
    public ImageView displayImg(int imgId, String url) {
        return null;
    }


    @Override
    public ImageView displayImgRes(int imgId, int resId) {
        ImageView img = (ImageView) getView(imgId);
        img.setImageResource(resId);
        return img;
    }

    @Override
    public View getView(int viewId) {
        return convertView.findViewById(viewId);
    }

    @Override
    public void setOnClickListener(final int viewId, final ICutOnClick cutOnClick, final View.OnClickListener OnClick) {
        getView(viewId).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cutOnClick != null) {
                    if (cutOnClick.isCut()) {
                        return;
                    }
                }
                OnClick.onClick(getView(viewId));
            }
        });
    }
}
