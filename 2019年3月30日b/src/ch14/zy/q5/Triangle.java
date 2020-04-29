package ch14.zy.q5;

import java.net.SocketTimeoutException;
import java.util.Arrays;

public class Triangle {

    public boolean isTrinangle(int a, int b, int c) {
        boolean isOk = false;
        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            isOk = true;
        }
        return isOk;

    }

    public String Shape(int a, int b, int c) {
        String result = "";
        if (a == b && b == c) {
            result = "等边三角形";
            return result;  //直接返回
        }

        if ((a == b) || (a == c) || (c == b)) {
            result = "等腰";
        }

        int arr[] = {a, b, c};
        Arrays.sort(arr);  //从小到大

        // System.out.println(arr[0]+""+arr[1]+""+arr[2]);
        if (arr[2] * arr[2] == arr[1] * arr[1] + arr[0] * arr[0]) {
            result += "直角";
        }
        //最大的平方大于 其他两 者的平方

        if (arr[2] * arr[2] > arr[1] * arr[1] + arr[0] * arr[0]) {
            result += "钝角";
        }

        //两个小的平方,
        if (arr[2] * arr[2] < arr[1] * arr[1] + arr[0] * arr[0]) {
            result += "锐角";
        }

        return result + "三角形";
    }


}
