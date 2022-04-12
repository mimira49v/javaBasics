package com.syntax.util;

public class StringUtilities {

    public static boolean contains(String str,String regex){
        String newStr=str.replaceAll(regex,"");
        return !newStr.equals(str);
    }
}