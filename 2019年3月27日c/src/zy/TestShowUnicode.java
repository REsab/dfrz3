package zy;
/*
三、编写程序名为: TestShowUnicode.java;
四、如下程序
  for(int i = ‘a’; i<=’z’; i++){
    System.out.print(i+ “\t”);
  }
 */
public class TestShowUnicode {
    public static void main(String[] args) {
        System.out.println("a-z");
        for(int i = 'a'; i<='z'; i++){
            System.out.print(i+ "\t");
        }
        System.out.println();
        System.out.println("A-Z");
        for(int i = 'A'; i<='Z'; i++){
            System.out.print(i+ "\t");
        }
        System.out.println();
        System.out.println("0-9");
        for(int i = '0'; i<='9'; i++){
            System.out.print(i+ "\t");
        }



    }
}
