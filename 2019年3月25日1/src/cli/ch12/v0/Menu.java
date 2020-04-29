package cli.ch12.v0;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int NextMenu = 1;
    int gotoMenu = 0;
    boolean isStop = false;

    public void run() {
        aaa:
        while (!isStop) {
            switch (NextMenu) {
                case 1:
                    showLoginMenu();
                    break;
                case 2:
                    showMainMenu();
                    break;
                case 3:  //客户信息
                    showCustomerMenu();
                    break;
                case 4:  //真情回馈
                    showSendMenu();
                    break;

                case -1:

                    break aaa;
            }
        }
    }

    public void switchMenu(int menu, int Select) {
        if (menu == 1) {
            //在一级菜单 下面
            switch (Select) {  //选择
                case 1:   //登录系统
                    NextMenu = 2; //下一级菜单
                    break;
                case 2: //2 退出
                    System.out.println("谢谢使用");
                    isStop = true;
                    NextMenu = -1;
                    break;

            }
        }
        if (menu == 2) {
//在二级菜单 下
            switch (Select) {
                case 1:
                    NextMenu = 3;
                    break;
                case 2:
                    NextMenu = 4;
                    break;
                case 0:
                    NextMenu = 1;
                    break;
            }
        }
        if (menu == 3) {
            //在客户信息下
            switch (Select) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("功能正在路上");
                    System.out.println("按0返回");
                    int temp = getAnInputZero();
                    NextMenu = 2;
                    break;
                case 0:
                    NextMenu = 2;
                    break;
            }
        }
        if (menu == 4) {
            //真情回馈
            switch (Select) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("功能正在路上");
                    System.out.println("按0返回");
                    int temp = getAnInputZero();
                    NextMenu = 2;
                    break;
                case 0:
                    System.out.println("功能正在路上");
                    NextMenu = choose(0, 0);
                    NextMenu = 2;
                    break;
            }
        }
    }

    public void showLoginMenu() {
        System.out.println("\t欢迎使用购物系统");
        System.out.println("\t\t1.登录系统");
        System.out.println("\t\t2.退出");
        gotoMenu = choose(1, 2);
        switchMenu(1, gotoMenu);

    }

    public void showMainMenu() {

        System.out.println("购物管理系统主菜单:");
        System.out.println("1.客户信息管理");
        System.out.println("2.真情回馈");
        System.out.println("0 返回");
        gotoMenu = choose(0, 2);
        switchMenu(2, gotoMenu);

    }

    public void showCustomerMenu() {
        System.out.println("购物管理系统 >客户信息管理 ");
        System.out.println("1.显示所有客户信息");
        System.out.println("2.添加客户信息");
        System.out.println("3.修改客户信息");
        System.out.println("4.查询客户信息");
        System.out.println("0 返回");
        gotoMenu = choose(0, 4);
        switchMenu(3, gotoMenu);
    }

    public void showSendMenu() {
        System.out.println("购物管理系统>真情回馈");
        System.out.println("1幸运大放送");
        System.out.println("2.幸运抽奖");
        System.out.println("3.生日伺候");
        System.out.println("0 返回");
        switchMenu(4, choose(0, 4));

    }

    //输入一个min 到max的int 整数
    //保证输入正确  ,并且在一个区间内
    public static int choose(int min, int max) {
        System.out.println("请输入入数字" + min + "-" + max + "选择");
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

    public static int getAnInputZero() {

        int tempNum = 0;   //输入临时存放的数字
        int numReturn = 0;  //真正的数字 要返回给goToMenu的
        do {
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {   //hasNextInt()只起到判断作用而不是接收数据  判断输入 的是不是数字
                tempNum = input.nextInt();
                //如果输入了数字
                if ((tempNum == 0)) {


                    numReturn = tempNum;   //把临时的数字 传给 真正的num 方法最后面 return 传给 main里的goToMenu=menu1()

                } else {   //如果输入的不在 min到min之间
                    System.out.println("选择错误");
                }
            } else {   //如果没输入数字
                System.out.println("请输入正确数字！~");


            }
        } while (!(tempNum == 0));
        //当输入的数 不在min和max之间 就一直循环

        return numReturn;  //方法运行完,变成这个值  在main 里 赋值给  goToMenu

    }
}
