package com.jpadapter.util;

import android.view.View;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by jp on 2016/11/22.</br>
 */

@Retention(RetentionPolicy.RUNTIME)//在运行时可以获取
@Target({ElementType.FIELD })//作用到类的域上面
public @interface BindH {
    int id();
    boolean click() default false;
}
