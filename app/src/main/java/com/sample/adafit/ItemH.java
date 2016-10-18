package com.sample.adafit;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.jpadapter.holder.INormalHolder;


/**
 * Created by jon on 2016/9/28.<br/>
 */

public class ItemH extends INormalHolder<ItemBean> {
    private TextView txt;
    public ItemH(Context ctx) {
        super(ctx);
        layout=R.layout.test_left_layout;
    }

    @Override
    public void initView(View view) {
        txt = (TextView) getView(R.id.txt);//另外一种findid的形式
    }

    @Override
    public void setData(ItemBean itemBean) {
        super.setData(itemBean);
        txt.setText(itemBean.getTxt());
        setOnClickListener(R.id.txt, null, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage("adsfasdf");
            }
        });
    }
}
