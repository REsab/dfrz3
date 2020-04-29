package ch14.zy.q2;

public class TestCalc {
    public static void main(String[] args) {
        System.out.print("请选择运算: 1.加法 2.减法 3.乘法 4.除法 :");
        int theWayOfOperation = Input.getAnInputInt(1, 4);
        System.out.print("请输入第一个数: ");
        int num1 = Input.getAnInputInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.print("请输入第二个数: ");
        int num2 = Input.getAnInputInt(Integer.MIN_VALUE, Integer.MAX_VALUE);


        Calclator calclator = new Calclator();

        int result = (int) calclator.ope(theWayOfOperation, num1, num2);
        System.out.println("***运算结果："+result);

    }

}
