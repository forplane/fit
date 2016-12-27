package com.jpadapter.i;

/**
 * Created by jon on 2016/10/18.
 * Context接受IHolderHandler通知接口
 */

public interface IHolderAccept {
    /**Context接收到obj对象后，各己所需，操作自己的obj对象*/
    void acceptMessage(Object obj);
}
