package ch15.lx.q4;

import java.util.Scanner;

public class Goods {
    String[] goodsName = new String[]{"电风扇", "洗衣机", "电视机", "冰箱", "空调"};
    double[] prince = {124.23, 4500, 0, 8800, 9, 5000.88, 456.0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String strName = scanner.next();
        System.out.print("请输入密码:");
        String strPwd = scanner.next();
        Goods goods = new Goods();
        if (goods.login(strName, strPwd)) {
            System.out.println("登录成功");
            goods.showGoods();
            System.out.print("请输入你的批发商品编号:");
            int select = scanner.nextInt();
            System.out.print("请输入批发数量:");
            int nums = scanner.nextInt();

            double totalMoney = goods.prince[select - 1] * nums;
            StringBuffer str = goods.change(totalMoney);
            System.out.println("您需要付款:" + str);

        } else {
            System.out.println("登录失败");
        }


    }

    public void showGoods() {
        System.out.println("*****************欢迎进入商品批发城******************");
        System.out.println("编号\t\t商品\t\t价格");

        for (int i = 0; i < goodsName.length; i++) {
            System.out.print((i + 1) + "\t\t" + goodsName[i] + "\t\t\t\t" );
             StringBuffer str=change(prince[i]);
            System.out.println(str);

        }

        System.out.println("**************************************************");


    }

    public boolean login(String name, String pwd) {
        if (name.equals("admin") && pwd.equals("123")) {
            return true;
        }
        return false;

    }

    public StringBuffer change(double d) {

        StringBuffer str = new StringBuffer(String.valueOf(d));
        for (int i = str.indexOf("."); i > 0; i = i - 3) {
            str.insert(i, ',');

        }


        return str;
    }


}
