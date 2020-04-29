package zy;
/*
1)编写程序名为: TestTriangle.java;
2)从控制台输入数字如下程序
import java.util.Scanner;
public class TestTriangle{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    int j = scanner.nextInt():
 */

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        System.out.println("输入三个边");
        Scanner scanner = new Scanner(System.in);
        double edge2 = scanner.nextInt();
        double edge3 = scanner.nextInt();
        double edge1 = scanner.nextInt();


        if ((edge1 + edge2) > edge3 && (edge1 + edge3) > edge2 && (edge3 + edge2) > edge1) {
            System.out.println("周长: " + (edge1 + edge2 + edge3));
            double s = 1.0 / 4.0 * Math.sqrt((edge1 + edge2 + edge3) * (edge1 + edge2 - edge3) * (edge1 + edge3 - edge2) * (edge2 + edge3 - edge1));
            System.out.println("面积  " + s);
        } else {
            System.out.println("这三边不能构成三角形");
        }


        System.out.println();


    }

}
