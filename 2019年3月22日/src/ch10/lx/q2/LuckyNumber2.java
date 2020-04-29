package ch10.lx.q2;

import java.util.Scanner;

public class LuckyNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {


            luckyNumber1();
            System.out.println("继续吗?");
            String temp = sc.next();
            if (temp.equals("n")) {
                System.out.println("系统退出,谢谢使用");
                break;
            } else if (temp.equals("y")) {
                int i = 3;

            } else {
                int i = 4;
                System.out.println("输入错误");
            }


        }
    }

    private static void luckyNumber1() {
        System.out.println("******欢迎进入奖客富翁系统**********");
        System.out.println("\t\t1.注册");
        System.out.println("\t\t2.登录");
        System.out.println("\t\t3.抽奖");
        System.out.println("***********************************");

        System.out.println("请选择菜单 ");
        int menu = getAnIntNumber(1, 3);
        switch (menu) {

            case 1:
                System.out.println("[奖客富翁系统>注册]");
                break;
            case 2:
                System.out.println("[奖客富翁系统>登录]");
                break;
            case 3:
                System.out.println("[奖客富翁系统>抽奖]");
                break;
        }
    }

    public static int getAnIntNumber(int min, int max) {

        int tempNum = 0;   //输入临时存放的数字
        int numReturn = 0;  //真正的数字 要返回给goToMenu的

        do {
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {   //hasNextInt()只起到判断作用而不是接收数据  判断输入 的是不是数字
                tempNum = input.nextInt();
                if ((tempNum >= min && tempNum <= max)) {   //如果输入了数字
                    numReturn = tempNum;   //把临时的数字 传给 真正的num 方法最后面 return 传给 main里的goToMenu=menu1()
                } else {   //如果输入的不在 min到min之间
                    System.out.println("您的输入有误");
                }
            } else {   //如果没输入数字
                System.out.println("您的输入有误!");
            }
        } while (!(tempNum >= min && tempNum <= max));
        //当输入的数 不在min和max之间 就一直循环

        return numReturn;  //方法运行完,变成这个值  在main 里 赋值给  goToMenu

    }

}

