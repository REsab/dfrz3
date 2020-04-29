package javaaa.javabbbb;

import java.time.temporal.Temporal;
import java.util.zip.DeflaterOutputStream;

/**
 * 有一分数序列：2/1 ，3/2 ，5/3 ，8/5 ，13/8 ， 21/13...
 * 输出这个数列的前20项，并求出它们的和。（必做）
 */

public class Test5 {
    public static void main(String[] args) {
        double top = 2;
        double down = 1;
        double sum = 0;

        for (int i = 1; i <= 20; i++) {

            sum = top / down + sum;

            //  System.out.println(i + "   " + top + "/" + down + "=" + top / down+ "  "+sum);
            System.out.println(i + "\t" + top + "/" + down );

            double temp = top;
            top = down + top;
            down = temp;
        }
        System.out.println("20项之和为"+sum);

    }

}
