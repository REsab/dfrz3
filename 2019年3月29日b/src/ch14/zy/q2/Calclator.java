package ch14.zy.q2;

public class Calclator {
    public int add(int num1, int num2) {
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }

    public int divide(int num1, int num2) {
        int result = 0;
        result = num1 / num2;
        return result;
    }

    public int minus(int num1, int num2) {
        int result = 0;
        result = num1 - num2;
        return result;
    }

    public int multiple(int num1, int num2) {
        int result = 0;
        result = num1 * num2;
        return result;
    }

    public int ope(int theWayOfOperation, int num1, int num2) {
        int result = 0;
        switch (theWayOfOperation) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = minus(num1, num2);
                break;
            case 3:
                result = multiple(num1, num2);
                break;
            case 4:
            default:
                if (num2 != 0) {
                    result = divide(num1, num2);

                } else {
                    System.out.println("除数不能为零");
                }

                break;

        }


        return result;
    }

}
