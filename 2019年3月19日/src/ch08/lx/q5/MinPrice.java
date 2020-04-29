package ch08.lx.q5;

import javax.sql.rowset.FilteredRowSet;
import java.util.Scanner;

public class MinPrice {
    public static void main(String[] args) {
        int n = 0;
        double minPrice = 666666666;

        System.out.println("输入店家个数:");
        n = getAnIntNumber(0, 999999);
        double[] prices = new double[n];
        //循环录入价格
        for (int i = 0; i < n; i++) {
            System.out.println("输入第" + (i + 1) + "家店的苹果单价:");
            prices[i] = getADoubleNumber(1, 123456789);
        }

        //遍历最低价格
        for (int i = 0; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];

            }

        }
        System.out.println("最低价是" + minPrice);
    }

    //输入一个整数的方法
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

    //输入一个double的方法
    public static double getADoubleNumber(double min, double max) {

        double tempNum = 0;   //输入临时存放的数字
        double numReturn = 0;  //真正的数字 要返回给goToMenu的

        do {
            Scanner input = new Scanner(System.in);
            if (input.hasNextDouble()) {   //hasNextInt()只起到判断作用而不是接收数据  判断输入 的是不是数字
                tempNum = input.nextDouble();
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
