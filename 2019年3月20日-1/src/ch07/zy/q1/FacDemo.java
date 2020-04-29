package ch07.zy.q1;

import java.util.Scanner;

/*
阶乘
 */
public class FacDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个10以内的正整数");
        int integer = getAnIntNumber(1, 10);
        int multiply = 1;  //乘数初始值
        System.out.print(integer + "!=1");
        for (int i = 1; i < integer + 1; i++) {  //循环运算 并打印 *号
            multiply *= i;
            if (i == 1) {
                continue;  //如果是1  循环内不做多余的打印
            } else {
                System.out.print("*" + i);  //控制打印格式
            }
        }
        if (multiply != 1) {
            System.out.println("=" + multiply);

        }
    }

    public static int getAnIntNumber(int min, int max) {

        int tempNum = 0;   //输入临时存放的数字
        int numReturn = 0;  //真正的数字 要返回给goToMenu的

        do {
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {   //hasNextInt()只起到判断作用而不是接收数据  判断输入 的是不是数字
                tempNum = input.nextInt();
                if ((tempNum >= min && tempNum <= max)) {   //如果输入了数字
                    numReturn = tempNum;   //把临时的数字 传给 真正的num 方法最后面 return 传给 main里的goToMenu=menu1()
                } else {   //如果输入的不在 min到min之间
                    System.out.println("选择错误");
                }
            } else {   //如果没输入数字
                System.out.println("请输入正确数字！~");
            }
        } while (!(tempNum >= min && tempNum <= max));
        //当输入的数 不在min和max之间 就一直循环

        return numReturn;  //方法运行完,变成这个值  在main 里 赋值给  goToMenu

    }

}
