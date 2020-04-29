package zy;

/*
8
1)编写程序名为: Secret.java;
将字符  ‘爱','生','活',',‘ ‘爱','j','a','v','a’
加密后打印输出密文;然后再将密文解密后打印输出;
 */
public class Secret {
    public static void main(String[] args) {

        char[] arr = new char[]{'爱', '生', '活', '爱', 'j', 'a', 'v', 'a'};
        char code = '9';
        System.out.println("加密");
        for (int i = 0; i < arr.length; i++) {
            arr[i] ^= code;
            System.out.print(arr[i]);

        }
        System.out.println("解密");
        for (int i = 0; i < arr.length; i++) {
            arr[i] ^= code;
            System.out.print(arr[i]);

        }


    }
}
