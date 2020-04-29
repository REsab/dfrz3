package zy;
/*

编写程序，
要求输入一个4位的整数，
再将4位的数字相加，
最后判断输出和为偶数还是奇数。

 */

import java.util.Scanner;

public class TestNumSum {
    public static void main(String[] args) {

        System.out.println("请输入一个四位数1000-9999");
        int num = getAnIntNumber(1000, 9999);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum = sum + num % 10;
            num /= 10;
        }
        System.out.println(sum);


    }


    //保证输入正确  ,并且在一个区间内
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
