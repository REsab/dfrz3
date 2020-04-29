package ch14.kt.q3;


import java.util.Scanner;

public class TestCal {
    public static void main(String[] args) {

        StudentsBiz stu = new StudentsBiz();
        System.out.println("请输入5个成绩");
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }
        System.out.println("平均分: " + stu.calAvg(scores));
        System.out.println("最高分：" + stu.calMax(scores));

    }


}
