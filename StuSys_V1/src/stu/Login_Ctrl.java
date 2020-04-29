package stu;


import java.util.Scanner;

public class Login_Ctrl {
    Scanner scanner = new Scanner(System.in);
    Manager manager = new Manager();
    Stu_UI ui = new Stu_UI();




    public boolean login() {

        ui.login();
        int tmp = Input.getAnInputInt(1, 2);
        if (tmp == 1) {
            for (int i = 2; i >= 0; i--) {

                System.out.println("请输入用户 名");
                String name = scanner.next();
                System.out.println("请输入密码");
                String pwd = scanner.next();
                if (name.equals(manager.userName) && pwd.equals(manager.password)) {

                    //验证成功
                    System.out.println("@@登录成功: " + manager.userName + "@@");
                    return true;
                } else {
                    if (i == 0) {
                        System.out.println("系统正在关闭");
                        break;
                    }
                    System.out.println("登录失败还有" + i + "次机会");
                }

            }
        }else {
            //退出
            System.out.println("谢谢使用");
        }

        return false;
    }


}
