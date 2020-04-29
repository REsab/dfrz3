package ch12.zy.q1;

import java.util.Scanner;
public class start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Season season = new Season();
        System.out.println("请输入月份");
        int mouth = scanner.nextInt();
        switch (mouth) {
            case 3:
            case 4:
            case 5:
                System.out.println(mouth + "月是" + season.spring());
                System.out.println(mouth + "月是" + season.spring(1));
                System.out.println(mouth + "月是" + season.spring(1,2));
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(mouth + "月是" + season.summer());
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(mouth + "月是" + season.autumn());
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(mouth + "月是" + season.winter());
                break;
            default:
                System.out.println("月份有误");
        }

    }

}
