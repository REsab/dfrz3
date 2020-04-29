package javaaa;

import java.util.Scanner;

/**
 * 输入一个小于8位的正整数，
 * 求出它是几位数；
 * 分别打印出每一位数字,
 * 按逆序输出各位上的数字
 * （可以使用条件语句或者使用循环语句处理）
 */
public class TestPrint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个小于8位的正整数");
        int num = scanner.nextInt();
        if (num > -100000000 && num < 100000000) {

            int digit = 0;
            int revertNum = 0;
            for (int i = num; i > 0; i /= 10) {
                revertNum = i % 10 + revertNum * 10;
                digit++;
            }
            System.out.println(digit + "位数 反转后" + revertNum);
        } else {
            System.out.println("输入一个小于8位的正整数");

        }
    }

}
