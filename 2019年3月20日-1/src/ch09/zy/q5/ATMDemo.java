package ch09.zy.q5;

import java.util.Scanner;

public class ATMDemo {
    public static void main(String[] args) {
        //输入密码  只有3次机会
        System.out.println("请输入密码::");
        for (int i = 3; i > 0; i--) {  //倒计数输入密码的次数
            int pwd = getAnIntNumber(0, 1111999999);   //获一个密码
            if (pwd == 111111) {  //如果密码满足条件
                break;//如果密码对了  ,关掉for循环
            } else {  //没输对密码
                System.out.print("密码错误");

            }
             //判断 3次到 了没有
            if (i == 0) {//判断是否用完3次 机会
                System.out.println("没机会了");
                System.exit(0);  //关闭程序
            }

        }//以上是用来输入密码

        //输入取款金额
        System.out.println("请输入金额:  ");

        boolean isMoneyWrong = false;  //判断有没有输入对金额
        int money = 0;   //假设要取钱的金额


        while (!isMoneyWrong) {   //当钱没输对的时候
            money = getAnIntNumber(1, 100000000);  //获取一个整数

            if (money >= 100 && money <= 1000) {  //在100与1000之间
                if (money % 10 == 0) {   //个位数是0
                    if (money / 10 % 10 == 0) {   //去掉个位数,新的个位数也是0   //就是看原来的十位数==0
                         //来到这里的话,金额就输入对了  三个if可以合成一个
                        System.out.println("您取了" + money + "元  ");
                        System.out.println("交易完成,请 取卡");
                        isMoneyWrong=true;  //改变真假值   让while 下次不再 循环
                    } else {  //金额不对
                        System.out.println("金额有误,100-1000的整百");
                    }
                } else {  //金额又不对
                    System.out.println("金额有误,100-1000的整百");
                }
            } else {  //金额还不对
                System.out.println("金额有误,100-1000的整百");
            }
        }


    }


     //这个方法 也叫函数 用来获取一个整数  ,比如从1到12折整数
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
