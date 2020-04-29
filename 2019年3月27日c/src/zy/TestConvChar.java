package zy;

/*
9
有一个小写的字母’f’，
把它转换成自身的后4个字母的大写形式，
并且把结果输出。
如：a字母结果输出E(应用所学过的知识，
不能用没学过的条件处理)
 */
public class TestConvChar {
    public static void main(String[] args) {

        char letter = 'f';
        letter += 4;
        letter -= 32;
        System.out.println(letter);


    }
}
