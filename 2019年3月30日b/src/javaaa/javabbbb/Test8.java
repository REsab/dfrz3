package javaaa.javabbbb;

/**
 * 打印出所有的 "水仙花数 ",
 * 所谓 "水仙花数 "是指一个三位数，
 * 其各位数字立方和等于该数本身。（必做）
 */

public class Test8 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int a = i % 10;     //个
            int b = i / 10 % 10;//十
            int c = i / 100;    //百
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }

        }


    }

}
