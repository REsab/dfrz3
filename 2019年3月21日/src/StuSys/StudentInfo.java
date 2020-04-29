package StuSys;

import java.util.Scanner;

public class StudentInfo {
    String[] studentName = new String[100];
    int[] stuAge = new int[100];
    String[] stuSex = new String[100];

    StudentInfo() {  //构造 初始化

        for (int i = 0; i < studentName.length; i++) {
            studentName[i] = " ";
        }
        for (int i = 0; i < stuAge.length; i++) {
            stuAge[i] = (int) (Math.random() * 50) + 1;

        }
        for (int i = 0; i < stuSex.length; i++) {
            stuSex[i] = "男";
        }
        studentName[0] = "张三";
        studentName[1] = "李四";
        studentName[2] = "五王";

    }

    //插入学生
    public void stuInset() {
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.println("是否添加学生 y 继续  其他键退出");
            if (scanner.next().equals("y")) {
                System.out.println("输入要添加 的姓名");
                for (int i = 0; i < this.studentName.length; i++) {
                    if (studentName[i].equals(" ")) {
                        studentName[i] = scanner.next();
                        break;
                    }
                    if (i == studentName.length) {
                        System.out.println(" 内存不足了");
                        break;
                    }
                }
            } else {
//                System.out.println("----------------");
//                System.out.println("当前学生姓名如下h ");
//                for (int i = 0; i < studentName.length; i++) {
//                    if (!studentName[i].equals(" ")) {
//                        System.out.println(studentName[i]);
//                    }
//
//                }
//                System.out.println("--------------");
     break;
            }
        }
        //以上是追加录入姓名

    }


    //修改班级的学生姓名
    public void nameChange() {
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("是否修改学生 y 继续  其他键退出");
            if (scanner.next().equals("y")) {
                System.out.println("输入要修改的姓名");
                String tempName = scanner.next();
                boolean isNameChange = false;
                for (int i = 0; i < this.studentName.length; i++) {
                    if (studentName[i].equals(tempName)) {  //查找是否存在这个名字
                        System.out.println("要改成什么名");

                        studentName[i] = scanner.next();
                        isNameChange = true;
                        if (isNameChange) {
                            break;
                        }
                    }
                }
                if (isNameChange == false) {
                    System.out.println("没有这个名字");

                }

            } else {
//                System.out.println("----------------");
//                System.out.println("当前学生姓名如下h ");
//                for (int i = 0; i < studentName.length; i++) {
//                    if (!studentName[i].equals(" ")) {
//                        System.out.println(studentName[i]);
//                    }
//
//                }
//                System.out.println("--------------");
                break;
            }
        }
    }

    //打印学生姓名
    public void printStuName() {
        System.out.println("--------------");
        for (int i = 0; i < studentName.length; i++) {
            if (!studentName[i].equals(" ")) {
                System.out.println(studentName[i]);
            }
        }
        System.out.println("--------------");
    }

    public void printStuNameAndAge() {
        System.out.println("--------------");
        for (int i = 0; i < studentName.length; i++) {
            if (!studentName[i].equals(" ")) {
                System.out.println(studentName[i] + "  " + stuAge[i]);
            }
        }
        System.out.println("--------------");
    }

    public void printStuNameAndSex() {
        System.out.println("--------------");
        for (int i = 0; i < studentName.length; i++) {
            if (!studentName[i].equals(" ")) {
                System.out.println(studentName[i] + "  " + stuSex[i]);
            }
        }
        System.out.println("--------------");
    }

    public void setStuAge() {
        //设置性别
        printStuNameAndAge();
        boolean isKeepSet = false;
        FORAGE:
        for (; ; ) {

            System.out.print("要改谁的年龄  ");
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入名字to change age");
            String tempName = scanner.next();
            boolean isNameExits = false;
            for (int i = 0; i < this.studentName.length; i++) {
                if (studentName[i].equals(tempName)) {  //查找是否存在这个名字
                    System.out.println(studentName[i] + "   " + stuAge[i]);
                    System.out.println("输入新的年龄");
                    stuAge[i] = getAnIntNumber(0, 190);
                    isNameExits = true;


                }
                if ((i == studentName.length - 1) && (isNameExits == false)) {
                    System.out.println("没有这个人");

                }

            }
            System.out.println("是否继续设置  1 继续  2 退出");
            int tmp = getAnIntNumber(1, 2);
            if (tmp == 1) {
                isKeepSet = true;
            } else {
                isKeepSet = false;
                break FORAGE;

            }

        }

    }

    public void setStuSex() {
        //设置性别
        printStuNameAndSex();
        boolean isKeepSet = false;
        forSex:
        for (; ; ) {

            System.out.print("要改谁的性别  ");
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入名字");
            String tempName = scanner.next();
            boolean isNameExits = false;
            for (int i = 0; i < this.studentName.length; i++) {
                if (studentName[i].equals(tempName)) {  //查找是否存在这个名字
                    System.out.println(studentName[i] + "   " + stuSex[i]);
                    System.out.println("设置新的性别  1.男   2 .女");

                    if (scanner.hasNextInt()) {
                        switch (scanner.nextInt()) {
                            case 1:
                                stuSex[i] = "男";
                                break;
                            case 2:
                                stuSex[i] = "女";
                                break;
                            default:
                                System.out.println("输入有误");
                        }

                    }
                } else {
                    if (i == studentName.length - 1) {
                        System.out.println("没有这个人");

                    }
                }


            }
            System.out.println("是否继续设置  1 继续  2 退出");
            int tmp = getAnIntNumber(1, 2);
            if (tmp == 1) {
                isKeepSet = true;
            } else {
                isKeepSet = false;
                break forSex;

            }

        }

    }

    //输入一个min 到max的int 整数
//保证输入正确  ,并且在一个区间内
    public static int getAnIntNumber(int min, int max) {

        int tempNum = 0;   //输入临时存放的数字
        int numReturn = 0;  //真正的数字 要返回给goToMenu的

        do {
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {   //hasNextInt()只起到判断作用而不是接收数据  判断输入 的是不是数字
                tempNum = input.nextInt();
                if ((tempNum >= min && tempNum <= max)) {   //如果输入了数字
                    numReturn = tempNum;   //把临时的数字 传给 真正的num 方法最后面 return 传给 main里的goToMenu=menu1()
                } else {   //如果输入的不在 min到min之间
                    System.out.println("选择错误");
                }
            } else {   //如果没输入数字
                System.out.println("请输入正确数字！~");
            }
        } while (!(tempNum >= min && tempNum <= max));
        //当输入的数 不在min和max之间 就一直循环

        return numReturn;  //方法运行完,变成这个值  在main 里 赋值给  goToMenu

    }


    public static double getADoubleNumber(double min, double max) {

        double tempNum = 0;   //输入临时存放的数字
        double numReturn = 0;  //真正的数字 要返回给goToMenu的

        do {
            Scanner input = new Scanner(System.in);
            if (input.hasNextDouble()) {   //hasNextInt()只起到判断作用而不是接收数据  判断输入 的是不是数字
                tempNum = input.nextDouble();
                if ((tempNum >= min && tempNum <= max)) {   //如果输入了数字
                    numReturn = tempNum;   //把临时的数字 传给 真正的num 方法最后面 return 传给 main里的goToMenu=menu1()
                } else {   //如果输入的不在 min到min之间
                    System.out.println("选择错误");
                }
            } else {   //如果没输入数字
                System.out.println("请输入正确数字！~");
            }
        } while (!(tempNum >= min && tempNum <= max));
        //当输入的数 不在min和max之间 就一直循环

        return numReturn;  //方法运行完,变成这个值  在main 里 赋值给  goToMenu

    }


}
