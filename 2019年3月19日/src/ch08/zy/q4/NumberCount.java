package ch08.zy.q4;

import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;
        int countIllegal = 0;
        System.out.println("input ten number:");
        for (int i = 0; i < 10; i++) {
            arr[i] = getAnIntNumber(0, 99999999);
            if (arr[i] == 1) {
                countOne++;
            } else if (arr[i] == 2) {
                countTwo++;
            } else if (arr[i] == 3) {
                countThree++;
            } else {
                countIllegal++;
            }


        }
        System.out.println("数字1的个数:"+countOne);
        System.out.println("数字2的个数:"+countTwo);
        System.out.println("数字3的个数:"+countThree);
        System.out.println("非法数字的个数:"+countIllegal);



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
