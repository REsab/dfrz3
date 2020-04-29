package zy;

/*
6
定义两个整数并初始化，
把两个数字输出，
然后交换两个数字并且输出结果
（必做）

 */
public class TestConvDigit {
    public static void main(String[] args) {
        int num1 = 33;
        int num2 = 334;
        System.out.println("交换前" + num1 + "  " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("交换后" + num1 + "  " + num2);


    }


}
