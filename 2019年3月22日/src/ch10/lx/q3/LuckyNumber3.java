package ch10.lx.q3;

import java.util.Scanner;

public class LuckyNumber3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 9999;
        int min = 1000;
        int cardNumber = 5562;
while(true) {

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
            System.out.println("请填写个人注册信息:");
            System.out.println("用户名:");
            String name = scanner.next();
            System.out.println("密码:");
            String pwd = scanner.next();
            System.out.println("注册成功,请记好您的会员卡号");
            cardNumber = (int) (Math.random() * (max - min)) + 1;

            System.out.println("用户名\t密码\t会员卡号");
            System.out.println(name + "  " + pwd + "  " + cardNumber);
            System.out.println("继续吗 y继续 其他键退出");
            break;
        case 2:
            System.out.println("[奖客富翁系统>登录]");
            break;
        case 3:
            System.out.println("[奖客富翁系统>抽奖]");
            break;
    }
    String str =scanner.next();
    if (str.equals("n")) {
        System.out.println("谢谢使用");
        break;
    }


}}



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
