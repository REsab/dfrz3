package ch14.lx.q5;

public class Account {
    double money = 0;

    public double getMoney() {
        System.out.println("当前有存款" + money);
        return money;
    }

    public void save(double s) {
        money += s;
        getMoney();
    }

    public void depoit(double a) {
        if (a < money) {
            money -= a;
             getMoney();
        }else {
            System.out.println("余额不足");
        }
    }

}
