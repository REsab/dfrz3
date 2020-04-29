package javaaa;

import java.util.Scanner;

/**
 * 输入一个整数，
 * 获取它的绝对数，
 * 并打印输出。（必做）
 */
public class TestShowAbsoluteValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数取 绝对值");

        int num = scanner.nextInt();
        System.out.println(num + "的绝对值是" + Math.abs(num));


    }

}
