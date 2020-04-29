package ch08.lx.q3;

public class CharsSort {
    public static void main(String[] args) {
            //定义一个数组
        String[] strArr = {"a", "c", "u", "b", "e", "p", "f", "z"};
         //遍历
        System.out.println("原字符列:");
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i] + "  ");
        }

//        String s1 = "a";
//        String s2 = "c";
//          来自百度 链接在最后
//        System.out.println( s1.compareTo(s2) ); // -2 (前面减后面的差 )

        //排序
        System.out.println("\n升序排列: ");
        for (int i = 0; i < strArr.length; i++) {  //从i个 开始比较
            for (int j = i + 1; j < strArr.length - 1; j++) {  //  比较第i 个以后的大小
                if (strArr[i].compareTo(strArr[j]) > 0) {
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;

                }
            }
        }
        for (int j = 0; j < strArr.length; j++) {
            System.out.print(strArr[j] + "  ");
        }
        System.out.println("\n逆序输出为:");
        for (int j = strArr.length - 1; j >= 0; j--) {
            System.out.print(strArr[j] + "  ");
        }
    }


}


//
//         String s1 = "abc";
//        String s2 = "abcd";
//        String s3 = "abcdfg";
//        String s4 = "1bcdfg";
//        String s5 = "cdfg";
//        System.out.println( s1.compareTo(s2) ); // -1 (前面相等,s1长度小1)
//        System.out.println( s1.compareTo(s3) ); // -3 (前面相等,s1长度小3)
//        ---------------------
//        作者：justDoItfl
//        来源：CSDN
//        原文：https://blog.csdn.net/justdoitfl/article/details/79421414
//        版权声明：本文为博主原创文章，转载请附上博文链接！
