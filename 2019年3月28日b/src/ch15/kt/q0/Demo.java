package ch15.kt.q0;


public class Demo {
    public static void main(String[] args) {
        Demo demo=new Demo();
        String str = "我爱你中国,我爱你故乡!";
        char find = '爱';
        int count = (int) countNum(str, find);
        System.out.println("一共有" + count + "个 " + find);

    }

    private static int countNum(String str, char c) {
        int count = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                count++;
            }
        }
        return count;
    }


}
