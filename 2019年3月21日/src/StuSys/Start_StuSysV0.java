package StuSys;

import java.util.Scanner;

public class Start_StuSysV0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentInfo classDFRZ = new StudentInfo();
aaa:
while (true){



        classDFRZ.printStuName();
        System.out.println("1 inset");
        System.out.println("2 修改");
        System.out.println("3设置性别");
        System.out.println("4 设置年龄");
        System.out.println("5 退出");

        switch (classDFRZ.getAnIntNumber(1, 5)) {
            case 1:
                classDFRZ.stuInset();

                break;
            case 2:
                classDFRZ.nameChange();

                break;
            case 3:
                classDFRZ.setStuSex();

                break;
            case 4:
                classDFRZ.setStuAge();

                break;
                default:
                    break aaa;

        }


    }

}}
