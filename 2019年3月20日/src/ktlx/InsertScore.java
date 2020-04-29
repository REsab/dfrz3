package ktlx;

import java.util.Scanner;
/**
 * 修改数组中的某一个值
 * @author Administrator
 *
 */
public class InsertScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] customerName = {"a", "c", "u", "b", "e", "p", "f", "z"};
        System.out.println("客户管理系统:");
        System.out.println("客户姓名信息:");
         //输入出修改前的客户
        for (String elemt :
                customerName) {
            System.out.print(elemt+"   ");

        }   //这个叫  for -each 作用同for i从0到10之类的循环

        //询问如何修改
        System.out.println("请输入要修改的用户姓名:");
        String nameToChange = scanner.next();   //输入要修改的名字
        boolean isChange = true;  //设置是否修改

        for (int i = 0; i < customerName.length; i++) {
            if (nameToChange.equals(customerName[i])) {  //如果 有存在这个名字
                System.out.println("请问要改成什么名字");
                customerName[i] = scanner.next();
            }
        }



        if (!isChange) {
            System.out.println("没有这个客户");
        } else {
            System.out.println("修改后的客户姓名信息:");
            for (String elemt :
                    customerName) {
                System.out.println(elemt);

            }
        }

        ;


    }
}
