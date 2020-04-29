package ch06.zy.q4;

/*
从1计数到100-即输出1至100;
遇到3的倍数就替换为单词"Flip",
5数t1换单词"Flop",
既为3的倍数又为5的倍数则替换为单词"FlipFlop.
 */
public class FilpFlop {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FlipFlop");
                continue;  //跳进下一次循环
            }
            if (i % 3 == 0) {
                System.out.println("Flip");
                continue;  //直接下一次循环
            }
            if (i % 5 == 0) {
                System.out.println("Flop");
                continue;
            }
            System.out.println(i);


        }
    }
}
