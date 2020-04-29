package ch15.zy.q7;

import java.net.SocketTimeoutException;

public class TestUnicode {
    public static void main(String[] args) {

        String str = "kdlf j";
        System.out.println(toUnicode(str));

        str = "\\u006b\\u0064\\u006c\\u0066\\u0020\\u006a";

        System.out.println(unicode2String(str));

    }

    public static String toUnicode(String string) {
        String result = "";
        StringBuffer unicode = new StringBuffer();
        for (int i = 0; i < string.length(); i++) {
            // 取出每一个字符
            char c = string.charAt(i);
            // 转换为unicode
            int len = Integer.toHexString(c).length();
            switch (len) {
                case 1:
                    result += "\\u000" + Integer.toHexString(c);
                    break;
                case 2:
                    result += "\\u00" + Integer.toHexString(c);
                    break;
                case 3:
                    result += "\\u0" + Integer.toHexString(c);
                    break;
                case 4:
                    result += "\\u" + Integer.toHexString(c);
                    break;
            }

            unicode.append("\\u" + Integer.toHexString(c));
        }


        return result;


    }

    public static String unicode2String(String unicode) {
        StringBuffer string = new StringBuffer();
        String[] hex = unicode.split("\\\\u");
        for (int i = 1; i < hex.length; i++) {
            // 转换出每一个代码点
            int data = Integer.parseInt(hex[i], 16);
            // 追加成string
            string.append((char) data);
        }
        return string.toString();
    }

}
