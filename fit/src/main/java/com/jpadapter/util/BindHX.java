package com.jpadapter.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Field;

/**
 * Created by jp on 2016/11/22.</br>
 */

public class BindHX {

    public static void x(Activity currentClass){
        View view = currentClass.findViewById(android.R.id.content);
        x(view, currentClass);
    }

    public static void x(View view,Object currentClass){
        Field[] fields = currentClass.getClass().getDeclaredFields();
        if(fields != null && fields.length > 0) {
            Field[] var6 = fields;
            int var5 = fields.length;
            for(int var4 = 0; var4 < var5; ++var4) {
                Field field = var6[var4];
                BindH bindView = field.getAnnotation(BindH.class);
                if(bindView != null) {
                    int viewId = bindView.id();
                    boolean clickLis = bindView.click();
                    try {
                        field.setAccessible(true);
                        if(clickLis) {
                            view.findViewById(viewId).setOnClickListener((View.OnClickListener)currentClass);
                        }
                        field.set(currentClass, view.findViewById(viewId));
                    } catch (Exception var11) {
                        var11.printStackTrace();
                    }
                }
            }
        }
    }
}
