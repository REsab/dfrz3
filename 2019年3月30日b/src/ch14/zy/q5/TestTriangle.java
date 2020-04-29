package ch14.zy.q5;

import java.awt.*;
import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        Triangle triangle = new Triangle();

        input:
        do {
            System.out.print("输入第一个边:");
            a = scanner.nextDouble();
            System.out.print("输入第二个边:");
            b = scanner.nextDouble();
            System.out.print("输入第三个边:");
            c = scanner.nextDouble();
            if (triangle.isTrinangle((int) a, (int) b, (int) c)) {
                System.out.println(triangle.Shape((int) a, (int) b, (int) c));
            } else {
                System.out.println("这三边不能构成一个三角形");
            }


            System.out.println("输入n 结束 其他键继续");
            String temp = scanner.next();
            if (temp.equals("n")) {

                break input;
            }


        } while (true);


    }


}
