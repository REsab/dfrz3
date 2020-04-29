package ch12.lx.Q33;




import java.util.Scanner;

public class StartMenu {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        while (true) {
            menu.showLoginMenu();// 一级菜单
            int chose = sc.nextInt();
            if (chose == 1) {
                while (true) {
                    menu.showMainMenu();// 二级菜单
                    chose = sc.nextInt();
                    if (1 == chose || 2 == chose) {
                        switch (chose) {
                            case 0:

                                break;
                            case 1:
                                menu.showCustMMenu();//三级菜单
                                break;
                            case 2:
                                menu.showSendGMenu();//三级菜单
                                break;
                        }
                    } else {
                        break;
                    }
                    chose = sc.nextInt();
                    if (chose != 0) {
                        menu.err();
                        chose = 0;
                    }
                }
            } else {
                break;
            }

        }
    }

}
