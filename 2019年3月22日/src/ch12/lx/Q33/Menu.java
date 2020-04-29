package ch12.lx.Q33;

import java.util.Scanner;

public class Menu {

    public void showLoginMenu() {
        System.out.println("\t欢迎使用购物管理系统");
        System.out.println("* * * * * * * * * * * * * * * *");
        System.out.println("\t\t1.登录系统\n\t\t2.退出");
        System.out.println("* * * * * * * * * * * * * * * *");
        System.out.print("请选择,输入数字:");
    }

    public void showMainMenu() {
        System.out.println("\t购物管理系统");
        System.out.println("* * * * * * * * * * * * * * * *");
        System.out.println("\t\t1.客户信息管理\n\t\t2.真情回馈");
        System.out.println("* * * * * * * * * * * * * * * *");
        System.out.print("请选择,输入数字或者输入0返回上一菜单:");
    }

    public void showCustMMenu() {
        System.out.println("\t购物管理系统>客户信息管理");
        System.out.println("* * * * * * * * * * * * * * * *");
        System.out.println("\t\t1.显示所有客户信息\n\t\t2.添加客户信息");
        System.out.println("\t\t3.修改客户信息\n\t\t4.查询客户信息");
        System.out.println("* * * * * * * * * * * * * * * *");
        System.out.print("请选择,输入数字或者输入0返回上一菜单:");
    }

    public void showSendGMenu() {
        System.out.println("\t购物管理系统>真情回馈");
        System.out.println("* * * * * * * * * * * * * * * *");
        System.out.println("\t\t1.幸运大放送\n\t\t2.幸运抽奖\n\t\t3.生日问候");
        System.out.println("* * * * * * * * * * * * * * * *");
        System.out.print("请选择,输入数字或者输入0返回上一菜单:");
    }
    public void err() {
        System.out.println("功能尚未开发完成,返回上一级");
    }
}
