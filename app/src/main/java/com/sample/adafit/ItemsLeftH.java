package com.sample.adafit;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.jpadapter.holder.IManyHolder;


/**
 * Created by jon on 2016/9/28.
 */

public class ItemsLeftH extends IManyHolder<ItemsBean> {
    private TextView txt;
    public ItemsLeftH(Context ctx) {
        super(ctx);
        layout=R.layout.test_left_layout;//代表关联的是那个布局
    }

    @Override
    public void initView(View view) {
        txt= (TextView) view.findViewById(R.id.txt);
    }

    @Override
    public void setData(ItemsBean itemsBean) {
        super.setData(itemsBean);
        txt.setText(itemsBean.getTxt());
    }
}
