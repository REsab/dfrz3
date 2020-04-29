package ch12.zy.q3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TestCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator baby = new Calculator();
        System.out.println("请输入第一个数");

        baby.num1 = scanner.nextDouble();
        System.out.println("请输入第二个数");
        baby.num2 = scanner.nextDouble();
        System.out.println("请选择运算类型 ");
        System.out.println("1.加" + "2.减" + "3.乘" + "4.除");
        int select = scanner.nextInt();
        switch (select) {
            case 1:
                baby.add();
                break;

            case 2:
                baby.minus();
                 break;
            case 3:
                baby.multiple();
                 break;
            case 4:
                baby.diviide();
                 break;
                default:
                    System.out.println("选择错误 ");
                    System.out.println("1.加" + "2.减" + "3.乘" + "4.除");
                     break;

        }


    }

}
