package javaaa.javabbbb;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 有一个二维数组，循环输出所有元素值
 * （注其中每一维一行）（选做）
 */

public class Test7 {
    public static void main(String[] args) {
        int array[][] = {{3, -9, 6}, {8, 0, 1,11}, {11, 9, 8}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j < array[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }

    }

}
