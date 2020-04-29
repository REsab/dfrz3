package javaaa;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

/**
 * 从控制台输入年份和月份，输出此月的天数。（选做）
 */
public class TestShowMonthDays {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份");
        int year = scanner.nextInt();
        System.out.print("请输入月份");
        int month = scanner.nextInt();


        System.out.print(year + "年" + month + "月");
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("有31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("有30天");
                break;
            case 2:
                if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                    System.out.println("有29天");

                } else {
                    System.out.println("有28天");
                }
                break;

            default:
                System.out.println("月份有误");
                break;

        }


    }

}
