package javaaa;

import java.util.Scanner;

/*
 * 输入一个年份，判断是否是闰年，
 * 输出不同的提示是闰年或不是闰年
 * （使用条件嵌套和逻辑运算符分别实现）（必做）
 */
public class TestYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();

        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + "年是闰年");

        } else {
            System.out.println(year + "年是平年");
        }

    }

}
