package javaaa.javabbbb;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.regex.Pattern;

/**
 * 动态输入一个数字后，
 * 判断该数字是不是素数
 * （素数就是除了1和本身不可以被其他数字整除：
 * 例如1，2，3，5，7，11，13，17，19，23，，，，，，）
 * （必做）
 */

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个的整数");
        int num = scanner.nextInt();
        int fori = (int) Math.sqrt(num);
        boolean isSuShu = true;

        for (int i = 2; i < fori; i++) {
            if (num % i == 0) {
                isSuShu = false;
                break;
            }
        }

        if (isSuShu) {
            System.out.println(num + "是素数");
        } else {
            System.out.println(num + "是不素数");
        }


    }

}
