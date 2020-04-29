package ch06.kzb.q2;


import java.util.Scanner;

public class CheckDay {
    public static void main(String[] args) {
        int[] days1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] days2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayCount = 0;
        System.out.println("输入年份");
        int year = getAnIntNumber(1, 9999999);
        System.out.println("输入月份");
        int month = getAnIntNumber(1, 12);
        int day=0;
        System.out.println("输入日");
        switch (month){
            case 2:
                if (year % 400 == 0 || (year / 100 != 0 && year / 4 == 0)) {
                    day=getAnIntNumber(1,29);
                }else{
                    day=getAnIntNumber(1,28);
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                  day=getAnIntNumber(1,31);
                 break;
          default:
               day=getAnIntNumber(1,30);
              break;
        }

        //如果能整除400 就是闰年
        //如果不是100的倍数,那么能整除4 就是闰年
        if (year % 400 == 0 || (year / 100 != 0 && year / 4 == 0)) {
            for (int i = 0; i < month; i++) {
                 dayCount+=days2[i];

            }
            dayCount +=day;
        //            System.out.println("是闰年");
        } else {  //是平年
            for (int i = 0; i < month; i++) {
                dayCount+=days1[i];  //把之前月份的天数先加起来
            }
            dayCount += day;
        }
        System.out.println("这是"+year+"年的第"+dayCount+"天");

    }
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
}
