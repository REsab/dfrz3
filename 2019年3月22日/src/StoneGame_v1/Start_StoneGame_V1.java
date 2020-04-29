package StoneGame_v1;

import java.util.Scanner;

public class Start_StoneGame_V1 {
    public static void main(String[] args) {
        int countWin=0;  //胜利
        int countLose =0;  //失败
        int tiedCount=0;  //平局


        while (true) {

            int computeSel = (int) (Math.random() * 3) + 1;  // 1.石头    2.剪刀    3.布
            System.out.println("请选择: 1.石头    2.剪刀    3.布");
            Scanner scanner = new Scanner(System.in);
            int userSelect =getAnInputInt(1,3);
//////在用户玩家出完剪刀石头布后,公布电脑的选择
            switch (computeSel) {
                case 1:
                    System.out.println("电脑玩家选择的是石头");
                    break;
                case 2:
                    System.out.println("电脑玩家选择的是剪刀");
                    break;
                case 3:
                    System.out.println("电脑玩家选择的是布");
                    break;
            }

//要把用户选择   判断是否赢了

            //用户赢了
            if(computeSel==userSelect){
                tiedCount++;
                System.out.println("平局");
                //1.石头    2.剪刀    3.布
            } else if ((computeSel==1&&userSelect==2)||(computeSel==2&&userSelect==3)||(computeSel==3&&userSelect==1)){
                System.out.println("电脑赢了");
                countLose++;
            }else{
                System.out.println("恭喜你 赢了");
                 countWin++;
            }



            //以下 用来判断是否离开这个循环代码
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\n输入 n 退出  按任意键继续");
            String str = sc.next();
            if (str.equalsIgnoreCase("n")) {
                System.out.println("胜:"+countWin+"  败:"+countLose+"  平局:"+tiedCount);
                break;  //退出while 循环
            } else {
                System.out.println("\n\n\n\n\n\n\n\n\n");
            }
        }
    }

    //输入一个min 到max的int 整数
    //保证输入正确  ,并且在一个区间内
    public static int getAnInputInt(int min, int max) {

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

