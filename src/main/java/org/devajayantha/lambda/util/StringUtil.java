package org.devajayantha.lambda.util;

public class StringUtil {
    public static boolean isLowerCase(String value) {
        for (var i: value.toCharArray()) {
            if (!Character.isLowerCase(i)) {
                return false;
            }
        }

        return true;
    }
}
