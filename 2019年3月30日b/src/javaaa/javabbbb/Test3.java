package javaaa.javabbbb;

/**
 * 使用循环输出九九乘法表（注意排版）。（必做）
 */

public class Test3 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + i * j + "\t");

            }
            System.out.println();
        }


    }

}
