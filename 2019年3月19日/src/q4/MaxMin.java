package q4;

import java.util.Scanner;

/*
while实现：手工输入一批整数，最后显示最大值和最小值


 */
public class MaxMin {
    public static void main(String[] args) {
        int max = -99999999;
        int min = 999999999;
        int temp = 0;
        int Nums = 0;
        int[] integerArray = new int[Nums];


        System.out.println("连续输入几个整数,我来找出最大最小的值");
        System.out.println("你要输入几个整数");
        Scanner scanner = new Scanner(System.in);
        Nums = getAnIntNumber(0, 99999999);

        //循环输入
        for (int i = 0; i < Nums; i++) {
            integerArray[i] = getAnIntNumber(-999999999, 99999999);

        }
        //遍历整堆数  找出最大  最小 是哪只
        for (int i = 0; i < Nums; i++) {
            if (integerArray[i] < min) {
                min = integerArray[i];

            }
            if (integerArray[i] > max) {
                max = integerArray[i];
            }

        }
        System.out.println("最大是 " + max);
        System.out.println("最小是 " + min);


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
