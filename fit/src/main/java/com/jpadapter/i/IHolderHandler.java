package com.jpadapter.i;

/**
 * Created by jon on 2016/10/18.<br/>
 * Holder通知Context接口
 */

public interface IHolderHandler {
    /**Holder需要跟Context是，直接调用此方法，传入需要参数即可*/
    void sendMessage(Object obj);


    /**Holder需要跟Fragment是，直接调用此方法，传入需要参数即可*/
    void sendMessage(String key,Object obj);
}
