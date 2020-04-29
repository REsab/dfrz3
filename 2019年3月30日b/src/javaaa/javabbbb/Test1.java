package javaaa.javabbbb;

/**
 * 输出100以内(不含100)能被3整除
 * 且个位数为6的所有整数（必做）
 */

public class Test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0&&i%10==6) {
                System.out.println(i);
            }

        }


    }

}
