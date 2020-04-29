package zy;
/*2
1)编写程序名为: TestTypeCode.java;
2)测试如下程序
int num = 20320;
short sh = 32767;
sh = num;
char ch = ‘你’;
ch = 20320;
ch = num;
short sh2 = 20, sh3 = 30;
sh = sh2 + sh3;
sh2 = sh2 + 10;
sh2 += 10;
 */
public class TestTypeCode {
    public static void main(String[] args) {

        int num = 20320;
        short sh = 32767;
        sh = (short) num;   //sh = num;
        char ch = '你';   //char ch = ‘你’;
        ch = 20320;
        ch = (char) num;   //ch = num;
        short sh2 = 20, sh3 = 30;

        sh = (short) (sh2 + sh3);  //强转
        sh2 = (short) (sh2 + 10);  //强转
        sh2 += 10;

    }
}
