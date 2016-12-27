package com.jpadapter.util;

import java.lang.reflect.Field;

/**
 * Created by planes on 2016/8/25.
 * 注解操作类
 */

public class AdaptTypeUtil {

    /**
     * 获取的bean中注解的type值
     */
    public static int getAnnotaionType(Object info) {
        int methodName = -1;
        try {
            Class cla = info.getClass();
            Class temp=cla.getSuperclass();
            boolean is=temp.getCanonicalName().equals(Object.class.getCanonicalName());
            while (!is) {
                cla=temp;
                temp = cla.getClass().getSuperclass();
                is=temp.getCanonicalName().equals(Object.class.getCanonicalName());
            }
            Field[] declaredFields = cla.getDeclaredFields();
            for (int i = 0; i < declaredFields.length; i++) {
                Field field = declaredFields[i];
                //判断这个Field上是否有这个注解
                if (field.isAnnotationPresent(TypeH.class)) {
                    //如果有这个注解，则获取注解类
                    TypeH fieldAnnotations = field.getAnnotation(TypeH.class);
                    if (fieldAnnotations != null) {
                        field.setAccessible(true);
                        methodName= (int) field.get(info);
                        break;
                    }
                }
            }
        } catch (Exception e) {
        }
        if (methodName == -1) {
            throw new NullPointerException("找不到对应type类型的方法");
        }
        return methodName;
    }


    /**
     * 获取的bean中注解的Holder
     */
    public static Class getAnnotaionHolder(Object info) {
        Class holderCls = null;
        boolean isPresent = info.getClass().isAnnotationPresent(NormalH.class);
        if (isPresent) {
            NormalH fieldAnnotations = info.getClass().getAnnotation(NormalH.class);
            holderCls = fieldAnnotations.holderName();
        }
        return holderCls;
    }

    /**
     * 获取的bean中注解的Holder
     */
    public static Class[] getAnnotaionHolders(Object info) {
        Class[] holderCls = null;
        boolean isPresent = info.getClass().isAnnotationPresent(ManyH.class);
        if (isPresent) {
            ManyH fieldAnnotations = info.getClass().getAnnotation(ManyH.class);
            holderCls = fieldAnnotations.holders();
        }
        return holderCls;
    }

}
