package ch12.zy.q3;


public class Calculator {
    double num1;  //全局变量
    double num2;

    public double add() {  //加法
        System.out.println(num1 + "+" + num2 + "="+(num1 + num2));
        return num1 + num2;
    }

    public double minus() {  //减法
        System.out.println(num1 + "-" + num2 + "="+(num1 - num2));

        return num1 - num2;
    }


    public double multiple() {  //乘法
        System.out.println(num1 + "*" + num2 + "="+(num1 * num2));

        return num1 * num2;
    }

    public double diviide() {  //除法
        if (num2 != 0) {
            System.out.println(num1 + "/"+num2);
            return num1 / num2;
        } else {
            System.out.println("除数不能为零,这题老夫做不到");
        }
        return 0;

    }


}
