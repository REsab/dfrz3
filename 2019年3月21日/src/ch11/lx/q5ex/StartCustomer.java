package ch11.lx.q5ex;

import java.util.Scanner;

public class StartCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("请输入用户类型: 1金卡,  其他为普卡");
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
         if (temp==1){
             customer.cardType="金卡";
         }else{
             customer.cardType="普卡";
         }
         System.out.println("请输入积分:");
        customer.points = scanner.nextInt();
        System.out.println("积分:"+customer.points+ ",卡类型:"+customer.cardType);
        if ((customer.points>1000&&customer.cardType.equals("金卡"))||(customer.points>5000&&customer.cardType.equals("普卡"))){
            customer.points+=500;
            System.out.println("尊敬的"+customer.cardType+"用户,您获得了"+500+"积分回馈");

        }else {
            System.out.println("积分不足,没有获得回馈");

        }


    }
}
