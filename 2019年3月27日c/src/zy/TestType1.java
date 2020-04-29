package zy;
/*
4
1)编写程序名为: TestType1.java;
2)测试如下程序
boolean a = false;
boolean b = true;
boolean c = (a && b) && (!b);
int result = c == false?1:2;
这段程序执行完成后 输出c与result的值;
 */
public class TestType1 {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        boolean c = (a && b) && (!b);
        int result = (c == false)?1:2;

        System.out.println("c: "+c);
        System.out.println("result    "+result);



    }
}
