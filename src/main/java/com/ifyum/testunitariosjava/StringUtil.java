package com.ifyum.testunitariosjava;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//

public class StringUtil {

//    private static final Logger logger = LoggerFactory.getLogger(StringUtil.class);

    public static String repeat(String str, int times) {
        StringBuilder result = new StringBuilder();
        if (times < 0) {
            throw new IllegalArgumentException("negative times not allowed");
        }
        for (int i = 0; i < times; i++) {

            if (i >= 1) {
                result.append(" ");
            }
            result.append(str);
        }


        return result.toString();
    }

    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() <= 0;
    }
}
