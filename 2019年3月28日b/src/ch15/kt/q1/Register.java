package ch15.kt.q1;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Register register = new Register();
        boolean isRegisterSusscessful = false;

        do {
            System.out.print("请输入用户名： ");
            String name= scanner.next();
            System.out.print("请输入密码： ");
            String pwd1 = scanner.next();
            System.out.print("请确认密码： ");
            String pwd2 = scanner.next();
            isRegisterSusscessful = register.verify(name, pwd1, pwd2);

        } while (!isRegisterSusscessful);


    }

    public boolean verify(String name, String pwd1, String pwd2) {
        boolean isTrue = false;
        if (name.length() < 3) {
            System.out.println("用户名长度不能小于3个字");
            return isTrue;
        }
        if (!pwd1.equals(pwd2)) {
            System.out.println("两次密码不同");
            return isTrue;
        }

        if (pwd1.length() < 6) {
            System.out.println("密码长度不能小于6");
            return isTrue;
        }
         isTrue=true;
        System.out.println("注册成功,请记住用户名和密码");
        return isTrue;


    }


}
