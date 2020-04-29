package stusys.ch08;

import java.util.Scanner;

public class NameEntry {
    public static void start() {
        String[] stus = new String[50];
        for (int i = 0; i < stus.length; i++) {
            stus[i] = " ";
        }
        stus[0] = "张三";
        stus[1] = "李四";
        stus[2] = "五王";
        System.out.println("当前学生姓名如下h ");
        for (int i = 0; i < stus.length; i++) {
            if (!stus[i].equals(" ")) {
                System.out.println(stus[i]);
            }

        }
        System.out.println("--------------");
        //以上代码输入当前存在的学生
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.println("是否添加学生 y 继续  其他键退出");
            if (scanner.next().equals("y")) {
                System.out.println("输入要添加 的姓名");
                for (int i = 0; i < stus.length; i++) {
                    if (stus[i].equals(" ")) {
                        stus[i] = scanner.next();
                        break;
                    }else {
                        System.out.println("内存不足");
                    }
                }
            } else {
                System.out.println("----------------");
                System.out.println("当前学生姓名如下h ");
                for (int i = 0; i < stus.length; i++) {
                    if (!stus[i].equals(" ")) {
                        System.out.println(stus[i]);
                    }

                }
                System.out.println("--------------");
                break;
            }
        }
        //以上是录入姓名


        //接下来修改姓名

         for (;;){
             System.out.println("是否修改学生 y 继续  其他键退出");
             if (scanner.next().equals("y")) {
                 System.out.println("输入要修改的姓名");
                 String tempName=scanner.next();

                 for (int i = 0; i < stus.length; i++) {
                     if (stus[i].equals(tempName)) {  //查找是否存在这个名字
                         System.out.println("要改成什么名");

                         stus[i]=scanner.next();
                         break;
                     }else {
                         System.out.println("没有这个名字");
                    break;
                     }
                 }
             } else {
                 System.out.println("----------------");
                 System.out.println("当前学生姓名如下h ");
                 for (int i = 0; i < stus.length; i++) {
                     if (!stus[i].equals(" ")) {
                         System.out.println(stus[i]);
                     }

                 }
                 System.out.println("--------------");
                 break;
             }
         }


    }


}
