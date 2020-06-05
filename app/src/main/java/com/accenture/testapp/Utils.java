package com.accenture.testapp;

/**
 * @Author peiyi.liu
 * @Date 6/4/2020 4:06 PM
 */
public class Utils {

    public static String getLibName() {
        return "Hi, I'm from TestApp's Utils!1.0.0";
    }

    public static String getLibNameAndWhen02() {
        return "second version 1.0.1";
    }

    public static String getLibNameAndRelease() {
        return "1.0.3 , " + BuildConfig.BUILD_TYPE;
    }
}
