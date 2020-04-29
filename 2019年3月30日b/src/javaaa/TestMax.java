package javaaa;

/*2019年3月31日
有四个整数，求其中最大的数并输出;（必做）
 */
public class TestMax {
    public static void main(String[] args) {
        int a = 32, b = 54, c = 12, d = 98;
        int max = a;
        max = max > b ? max : b;
        max = max > c ? max : c;
        max = max > d ? max : d;
        System.out.println("abcd中最大的值是"+max);


    }


}
