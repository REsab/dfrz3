package ch12.lx.q1;

import java.io.ObjectOutputStream;

public class ScoreCalc {
    int java;
    int scharp;
    int db;

    public int getTotal() {
        int total = 0;
        total = java + scharp + db;
        return total;
    }

    public double getAvg() {
        double avg = getTotal() * 1.0 / 3;
        return avg;
    }

}
