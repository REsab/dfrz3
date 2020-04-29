package ch11.lx.q4;

import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
        StartChangePwd user=new StartChangePwd();
        System.out.println("请输入用户名");
        Scanner scanner=new Scanner(System.in);
        String tempName=scanner.next();
        System.out.println("请输入密码");
         String tempPass=scanner.next();

        if (tempName.equals(user.name) && tempPass.equals(user.pwd)) {
            System.out.println("请输入新密码:");
             String newPwd=scanner.next();

             user.setPwd(newPwd);

            System.out.println("成功设置密码为"+user.getPwd());


        }else{
            System.out.println("用户名和密码不匹配,您没有权限更新信息");
        }



    }

}
