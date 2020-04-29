package ch14.zy.q3;

/**
 * 计算月供
 * loan 贷款金额
 */
public class Loan {
    public double loan(double loan, int yearChoice) {

        double result = 0;
        switch (yearChoice) {
            case 1:
                result = (loan + loan * 6.03 / 100) / 36;
                break;
            case 2:
                result = (loan + loan * 6.12/ 100) / 60;

                break;
            case 3:
                result = (loan + loan * 6.39 / 100) / 240;

                break;
            default:
                result = (loan + loan * 6.52 / 100) / 360;


                break;

        }


        return result;
    }
}
