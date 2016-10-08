package com.jpadapter.adapter;

import android.view.View;

/**
 * Created by planes on 2016/9/3.<br/>
 * adapter选择类型的接口
 * 暂不提供此接口
 */

@Deprecated
public interface SelectAdapterListener {
    //传入item，然后把代选择的view加进去
    View initSelectView(View view, int pos);
}
