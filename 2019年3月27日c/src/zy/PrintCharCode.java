package zy;
/*
1
1)编写程序名为: PrintCharCode.java;
2)在入口方法中定义三个变量并赋值: char c1=’你’, c2=’a’; char 是=’ぁ’;
输出这三个变量中字符对应的unicode码;
 */
public class PrintCharCode {
    public static void main(String[] args) {
        char c1 = '你', c2 = 'a';
        char 是 = 'ぁ';

        System.out.println(c1 + "   " + (int) c1);
        System.out.println(c2 + "   " + (int) c2);
        System.out.println(是 + "   " + (int) 是);


    }

}
