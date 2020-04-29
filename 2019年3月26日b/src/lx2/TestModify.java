package lx2;

import java.util.OptionalDouble;
import java.util.Scanner;

public class TestModify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerBiz customerBiz = new CustomerBiz();

        int n = customerBiz.name.length;

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


        System.out.println("请输入要改的名字");
         String oldName=scanner.next();

        System.out.println("请问大佬要改成什么名字");
         String newName=scanner.next();
          if (customerBiz.editName(oldName,newName)){
              System.out.println("修改成功");
               customerBiz.showNames();
          }else {
              System.out.println("修改失败");
          }



    }

}
