package ch11.lx.q5;

import java.util.Scanner;

public class StartCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("请输入用户类型");
        Scanner scanner = new Scanner(System.in);
        customer.cardType = scanner.next();
         System.out.println("请输入积分:");
        customer.points = scanner.nextInt();

        if ((customer.points>1000&&customer.cardType.equals("金卡"))||(customer.points>5000&&customer.cardType.equals("普卡"))){
            customer.points+=500;
            System.out.println("尊敬的"+customer.cardType+"用户,您获得了"+500+"积分回馈");

        }else {
            System.out.println("记录成功,谢谢使用");
        }


    }
}
