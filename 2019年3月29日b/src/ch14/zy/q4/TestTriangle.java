package ch14.zy.q4;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("请输入行高：");
         int line=scanner.nextInt();
        System.out.print("请输入打印的字符：");
        String character=scanner.next();

        Triangle triangle=new Triangle();
        triangle.printTriangle(line,character);



    }

}
