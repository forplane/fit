package com.jpadapter.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by planes on 2016/8/25.
 * 单种布局注解
 */
@Retention(RetentionPolicy.RUNTIME)//在运行时可以获取
@Target({ElementType.TYPE})//作用到类上面
public @interface NormalH {
    Class holderName();
}
