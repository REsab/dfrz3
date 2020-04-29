package ch12.lx.q1;

public class Start {
    public static void main(String[] args) {
        ScoreCalc sc = new ScoreCalc();
        sc.db = 77;
        sc.scharp = 99;
        sc.java = 1;
        System.out.println("总分" + sc.getTotal());
        System.out.println("平均分" + sc.getAvg());

    }
}
