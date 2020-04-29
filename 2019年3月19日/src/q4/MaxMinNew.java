package q4;

import java.util.Scanner;

/*
while实现：手工输入一批整数，最后显示最大值和最小值


 */
public class MaxMinNew {
    public static void main(String[] args) {

        int max = 0;
        int min = 0;
        int times = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("来了老弟,来10个数吧");
        while (times < 10) {
            if (times == 1) {   //第一个数要赋值给max min 不能初始化为0
                max = scanner.nextInt();
                min = max;
                times++;
                continue;
            }
            System.out.println("再来一个 ");
            int temp = scanner.nextInt();
            if (max < temp) {  //让max变大
                max = temp;
                continue; //直接到下次循环  忽略后面的 代码
            }
            if (min > temp) {  //让min变小
                min = temp;
            }

            times++;
        }
        System.out.println("biggest " + max);
        System.out.println("lowest " + min);

    }
}
