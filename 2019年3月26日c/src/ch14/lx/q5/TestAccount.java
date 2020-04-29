package ch14.lx.q5;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account BBC = new Account();

        while (true) {
            System.out.println("1.存款  2.取款  0退出");
            System.out.print("请选择业务:");
            switch (scanner.next()) {
                case "1":
                    BBC.save(getADoubleNumber(0, 999999999));
                    break;
                case "2":
                    BBC.depoit(getADoubleNumber(0, 999999999));
                    break;
                case "0":
                    System.out.println("bye");
                     System.exit(0);

                    break;
                default:
                    System.out.println("请重选");
                    break;


            }

        }

    }

    public static double getADoubleNumber(double min, double max) {

        double tempNum = 0;   //输入临时存放的数字
        double numReturn = 0;  //真正的数字 要返回给goToMenu的

        do {
            Scanner input = new Scanner(System.in);
            if (input.hasNextDouble()) {   //hasNextInt()只起到判断作用而不是接收数据  判断输入 的是不是数字
                tempNum = input.nextDouble();
                if ((tempNum >= min && tempNum <= max)) {   //如果输入了数字
                    numReturn = tempNum;   //把临时的数字 传给 真正的num 方法最后面 return 传给 main里的goToMenu=menu1()
                } else {   //如果输入的不在 min到min之间
                    System.out.println("选择错误");
                }
            } else {   //如果没输入数字
                System.out.println("请输入正确数字！~");
            }
        } while (!(tempNum >= min && tempNum <= max));
        //当输入的数 不在min和max之间 就一直循环

        return numReturn;  //方法运行完,变成这个值  在main 里 赋值给  goToMenu

    }
}
