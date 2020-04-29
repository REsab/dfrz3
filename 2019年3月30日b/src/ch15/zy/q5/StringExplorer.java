package ch15.zy.q5;

import java.util.Scanner;

public class StringExplorer {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        String full = "几个IDEA的NB插件，还带动态图的。\n" +
                "这里只是推荐一下好用的插件，具体的使用方法不一一详细介绍。\n" +
                "JRebel for IntelliJ\n" +
                "一款热部署插件，只要不是修改了好用的插件项目的配置文件，用它都可以实现热部署。" +
                "收费好用的插件的，破解比较麻烦。不过好用的插件功能确实很强大。算是开发必备神器了。" +
                "热部署快捷键好用的插件是control+F9/command+F9。";

        System.out.println(full);
        System.out.println("以上是一堆字:");
        System.out.println("请输入要查询的字符串:");
        String search = scanner.next();
        StringExplorer stringExplorer = new StringExplorer();
        stringExplorer.locateString(full, search);



    }



    public void locateString(String full, String s) {


        int[] arr = new int[full.length()];  //存位置
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        int index = 0;   //存位置的下标
        int len = s.length();  //要找的长度
        for (int i = 0; i < full.length() - len; i++) {   //不断提取
            String str = full.substring(i, i + len);   //截取
            if (s.equals(str)) {   //比较
                arr[index] = i;   //存下标
                index++;   //下一次放的位置
            }
        }


        if (arr[0] >= 0) {  //如果有找到一个

            System.out.println(s + "出现的位置是:");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 0) {
                    System.out.print("   " + arr[i]);
                }
            }

        } else {
            System.out.println("没有包含这个字");
        }


    }


}
