package ch15.lx;

public class q3 {
    public static void main(String[] args) {
        q3 q3 = new q3();

        String str = "132164646987987dfaf" +
                "dlafa fjasflafajrjagj仍夺 ;礚 工;明百男" +
                "ldfjerfjladfLskjf a;welkjlka" +
                "kdvjbalkjf; /falsjf ljaeflj";

        int space = q3.counter(str, " ");
        System.out.println("空格有: " + space + "个");

        int numOne = q3.counter(str, "1");
        System.out.println("数字1有: " + numOne + "个");

        int overHao = q3.counter(str, ";");
        System.out.println("分号有: " + overHao + "个");

    }

    public int counter(String pStr, String pChar) {
        int count = 0;   //计数器啊
        String[] array = new String[pStr.length()];  //数组存放每一个字
        for (int i = 0; i < pStr.length(); i++) {  //遍历形参的长度 次数
            array[i] = pStr.substring(i, i + 1);  //截取一个字  存到arr
            if (array[i].equals(pChar)) {   //判断 是不是要计数
                count++;
            }
        }
        return count;  //返回结果
    }

}
