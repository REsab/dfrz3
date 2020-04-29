package zy;

import javax.imageio.metadata.IIOMetadataFormatImpl;

/*
所谓 "水仙花数 "是指一个三位数，
其各位数字立方和等于该数本身。
例如：153是一个 "水仙花数 "，
因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class Num12 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int a1 = i % 10;  //个位
            int a2 = i / 10 % 10;  //十位
            int a3 = i / 100;  //求百位

            if (i == (Math.pow(a1, 3)) + (Math.pow(a2, 3)) + (Math.pow(a3, 3))) {
                System.out.println(i);
            }
        }
    }

}
