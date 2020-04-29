package ch05.zy.q5;

import java.util.Scanner;

/*
while实现：根据输入数字显示对应的中英文星期名称缩写或中文星期几。
提示： 手工输入整数，0则退出循环，1-7显示星期一至星期天，其它提示非法输入重新再输入。

 */
public class Weekdays {
    public static void main(String[] args) {

        while (true) {
            int weekday = 0;
            System.out.println("输入1-7 ,显示对应的中文星期名称缩写");
            weekday = getAnIntNumber(0, 7);
            switch (weekday) {
                case 1:
                    System.out.println("今天是周1");
                    break;
                case 2:
                    System.out.println("今天是周2");
                    break;
                case 3:
                    System.out.println("今天是周3");
                    break;
                case 4:
                    System.out.println("今天是周4");
                    break;
                case 5:
                    System.out.println("今天是周5");
                    break;
                case 6:
                    System.out.println("今天是周6");
                    break;
                case 7:
                    System.out.println("今天是周日");
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
        }
    }

    //获取一个整数 区间min -max
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
