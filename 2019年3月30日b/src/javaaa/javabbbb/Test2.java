package javaaa.javabbbb;

/**
 * 输出1~100之间的偶数，5个数字一行输出。（必做）
 */

public class Test2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i+"\t");
            }

            if (i % 10 == 0) {
                System.out.println();
            }

        }
    }

}
