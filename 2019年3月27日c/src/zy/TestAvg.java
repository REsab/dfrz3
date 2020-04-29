package zy;
/*
9.	编写程序名为: TestAvg.java
 */
public class TestAvg {
    public static void main(String[] args) {

        int sum = 0;
        int avg = 0;

        int[] course = new int[5];
        for (int i = 0; i < course.length; i++) {
            course[i] = (int) (Math.random() * 100 + 1);
             sum+=course[i];

            System.out.println("第" + (i + 1) + "门成绩  " + course[i]);
        }

        System.out.println("总分 "+sum);
        System.out.println("平均分: "+(sum*1.0/course.length));


    }


}
