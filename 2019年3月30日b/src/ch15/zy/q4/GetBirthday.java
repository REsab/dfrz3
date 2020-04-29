package ch15.zy.q4;

import java.util.Scanner;

public class GetBirthday {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户的身份证号:");
        String idNum = scanner.next();

        if (idNum.length() == 18) {
            String result = getBirthday(idNum);
            System.out.print("该用户的生日是:" + result);
        } else {
            System.out.print( "身份证无效");
        }

    }

    private static String getBirthday(String string) {
        String result;


        result = string.substring(6, 14);
        StringBuffer stringBuffer = new StringBuffer(result);
        //字符串插入 19970108
        //字符串插入 1997年01月08日
        stringBuffer.insert(4, "年");
        stringBuffer.insert(7, "月");
        stringBuffer.insert(10, "日");
        return stringBuffer.toString();


    }

}
