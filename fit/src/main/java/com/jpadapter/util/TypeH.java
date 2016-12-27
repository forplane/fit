package com.jpadapter.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by planes on 2016/8/25.
 * 主要是用在多钟item类型的时候，需要在type字段注解
 */
@Retention(RetentionPolicy.RUNTIME)//在运行时可以获取
@Target({ElementType.FIELD })//作用到类的域上面
public @interface TypeH {
}
