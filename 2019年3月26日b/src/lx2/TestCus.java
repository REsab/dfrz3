package lx2;

import java.util.Scanner;

public class TestCus {
    public static void main(String[] args) {
        CustomerBiz customerBiz = new CustomerBiz();

        int n = customerBiz.name.length;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < customerBiz.name.length; i++) {
            System.out.println("请输入用户姓名");
            customerBiz.name[i] = scanner.next();

            System.out.println("继续输入吗  0退出  其他继续");
            String temp = scanner.next();
            if (temp.equals("0")) {
                customerBiz.showNames();
//                System.out.println("bye");
                break;
            }
        }

    }

    private static void isContinue() {


    }

}
