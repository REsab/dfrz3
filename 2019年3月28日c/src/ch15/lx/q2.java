package ch15.lx;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        q2 q2 = new q2();

        System.out.println("*****欢迎进入注册系统****");
        System.out.print("请输入身份证:");
        String id = scanner.next();
        System.out.print("请输入手机号:");
        String cell = scanner.next();
        System.out.print("请输入座机号:");
        String phone = scanner.next();

        String str = q2.verify(id, cell, phone);
        System.out.println(str);

    }

    public String verify(String id, String cell, String phone) {
        String flag = "";


        if (!(id.length() == 16 || id.length() == 18)) {
            flag += "身份证必须是16位或18位!";
        }
        if (cell.length() != 11) {
            flag += "\n手机必须是11位!";
        }

        String[] phoneArray = phone.split("-");
        if (phoneArray.length != 2 || phoneArray[0].length() != 4 || phoneArray[1].length() != 7) {
            flag += "\n座机区号必须为4位,电话号码必须是7位!";

        }
        if (flag.equals("")) {

            flag = "注册成功!";
        }
        return flag;
    }


}
