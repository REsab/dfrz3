package ch14.kt.q3;



public class StudentsBiz {

    /**
     * 求平均分
     * scores 参赛成绩数组
     */
    public double calAvg(int[] score) {
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum / score.length;
    }

    public double calMax(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;


    }


}
