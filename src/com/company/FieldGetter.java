package com.company;

import java.lang.reflect.Field;


public class FieldGetter {

    private static Field[] getFields(Class<?> classObject){
        return classObject.getDeclaredFields();
    }


    public static String getFieldNames(Class<?> classObject){
        StringBuilder sb = new StringBuilder();
        for (Field field: getFields(classObject)) {
            sb.append(field.getName()).append(",");
        }

        return "(" + sb.substring(0,sb.length()-1) + ")";
    }

    public static String getParams (Class<?> classObject){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <classObject.getDeclaredFields().length; i++) {
            sb.append("?,");
        }
        return "(" + sb.substring(0,sb.length()-1) + ")";
    }
}
