package ch14.zy.q3;

import java.util.Scanner;


public class TestLoan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入贷款金额: ");
        double money =scanner.nextDouble();
        System.out.print("贷款年限有: 1.3年(36个月) 2.5年(60个月)  3. 20年(240个月) 4.30年(360个月) :");

        System.out.print("请选择: ");
        int choice=scanner.nextInt();
         Loan loan=new Loan();
         double monthlyPayment=loan.loan(money ,choice);
        System.out.println("月供为: "+monthlyPayment);







    }

}
