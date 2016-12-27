package com.jpadapter.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by planes on 2016/8/31.
 * Holder中view的操作接口
 */
public interface IViewOpe {
    /**设置指定tv的文本*/
    TextView setTvText(int tvId, String text);


    /**
     * @deprecated 不可使用
     */
    ImageView displayImg(int imgId, String url);

    /**
     * 设置本地资源图片
     * @param imgId 控件id
     * @param resId 资源id
     */
    ImageView displayImgRes(int imgId, int resId);

    /**获得指定控件id的view*/
    View getView(int viewId);

    /**设置监听事件*/
    void setOnClickListener(int viewId, ICutOnClick cutOnClick, View.OnClickListener OnClick);
}
