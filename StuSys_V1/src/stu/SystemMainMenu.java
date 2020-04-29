package stu;

import stu.Stu_UI;
import stu.Student;

public class SystemMainMenu {
    Student[] DFRZ = new Student[88];

    public SystemMainMenu() {

        for (int i = 0; i < DFRZ.length; i++) {
            DFRZ[i] = new Student();
        }

        DFRZ[1].name = "张三";
        DFRZ[2].name = "张5";
        DFRZ[3].name = "张6";
        DFRZ[4].name = "张七 ";


    }

    public void showStudent() {
        Stu_UI.mainMenu();
        for (int i = 0; i < DFRZ.length; i++) {
            if (DFRZ[i].name != null) {
                System.out.print(DFRZ[i].name);
                System.out.print("   " + DFRZ[i].age);
                System.out.print("   " + DFRZ[i].sex);
                System.out.println();
            }

        }


    }


}
