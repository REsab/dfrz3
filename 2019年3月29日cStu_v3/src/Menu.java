import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    StudentCtrl StudentCtrl = new StudentCtrl();

    public void showMenu() {
        while (true) {


            System.out.println("*****************************************************");
            System.out.println("*****************************************************");
            System.out.println("\t\t\t主菜单");
            System.out.println("\t\t\t1显示姓名列表");
            System.out.println("\t\t\t2.添加姓名");
            System.out.println("\t\t\t3.修改姓名 ");
            System.out.println("\t\t\t4.删除姓名");
            System.out.println("\t\t\t5.退出");
            System.out.println("*****************************************************");
            System.out.println("请输入:");
            String sel = scanner.next();

            switch (sel) {
                case "1":
                    StudentCtrl.list();
                    StudentCtrl.goBack();

                    break;

                case "2":
                    StudentCtrl.insert();
                    break;

                case "3":
                    StudentCtrl.update();
                    break;

                case "4":
                    StudentCtrl.delete();

                    break;

                case "5":
                    break;


            }


        }
    }


    public void run() {



        showMenu();


    }


}
