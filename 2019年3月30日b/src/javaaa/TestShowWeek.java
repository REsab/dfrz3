package javaaa;

import java.util.Scanner;

/**
 * 编写程序实现如下功能：
 * 输入0至6
 * 的数字并将其转换为星期日到星期六的字符串，
 * 打印输出（必做）
 */
public class TestShowWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个0-6的数");
        int num = scanner.nextInt();
        String day = "";
        switch (num) {
            case 0:
                day = "星期日";
                System.out.println(day);
                break;
            case 1:
                day = "星期一";
                System.out.println(day);
                break;
            case 2:
                day = "星期二";
                System.out.println(day);
                break;
            case 3:
                day = "星期三";
                System.out.println(day);
                break;
            case 4:
                day = "星期四";
                System.out.println(day);
                break;
            case 5:
                day = "星期五 ";
                System.out.println(day);
                break;
            case 6:
                day = "星期六";
                System.out.println(day);
                break;
            default:
                day = "请输入一个0-6的数";
                System.out.println(day);
                break;
        }


    }

}
