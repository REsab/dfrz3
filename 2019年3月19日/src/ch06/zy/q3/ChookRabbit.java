package ch06.zy.q3;

//for循环:鸡兔同笼,共有头35个,足94只,求鸡兔各有多少只。
//2019年3月19日
public class ChookRabbit {
    public static void main(String[] args) {

        int chook = 0;
        int rabbit = 0;
        int head = 35;
        int foot = 94;
        for (int i = 0; i < head; i++) {
            chook++;
            rabbit = 35 - chook;
            if (chook * 2 + rabbit * 4 == foot) {
                System.out.println("鸡有" + (chook) + "只" + "兔子有" + (rabbit) + "只 ");
            }
        }
    }
}
