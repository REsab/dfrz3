package ch06.lx.q4;

import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);



        System.out.println("请输入用户名:");
        String userName=scanner.next();

        for (int i = 2; i >=0 ; i--) {
            System.out.println("请输入密码:");
             int pwd=scanner.nextInt();
            if (pwd == 123) {
                System.out.println("欢迎光临");
                break;
            }else {
                System.out.println("密码不对,还有"+i+"次机会可以玩 ");
            }
            if (i == 0) {
                System.out.println("对不起,机会用完了,不能再 猜密码了");
            }


        }



    }

}
