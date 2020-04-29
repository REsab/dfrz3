package ch07.zy;

public class q2NumDemo {
    public static void main(String[] args) {

        int line = 0;
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 7 == 0) {  //判断能不能整除7
                continue;
            }
             //输出满足条件的数值
            System.out.print(i + "\t");
            sum += i;  //累加
            line++;  //计数每行的个数
            if (line == 4) {
                System.out.println();
                line = 0;
            }
        }
        System.out.println("\n数据之和为:"+sum);

    }
}
