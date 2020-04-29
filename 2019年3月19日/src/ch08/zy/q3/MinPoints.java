package ch08.zy.q3;

public class MinPoints {
    public static void main(String[] args) {

        int[] arr = {18, 25, 7, 36, 13, 2, 89, 63};
        int min = 99999;   //????初值怎么解决???
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {  //如果有比min小的数 则交换两者
                int temp = 0;
                temp = min;
                min = arr[i];
                arr[i] = min;
                minIndex = i;  //重新赋值下标
            }


        }
        System.out.println("最低分是" + min);
        System.out.println("最低分的下标是" + minIndex);


    }
}
