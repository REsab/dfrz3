package ch08.zy.q2;

import java.util.Scanner;

public class InvertOutput {
    public static void main(String[] args) {
        String [] arr =new String[5];
        System.out.println("输入5句话");
        Scanner scanner =new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("第"+(i+1)+"句话:");
             arr[i]=scanner.next();
        }
        for (int i = arr.length-1; i>0; i--) {
            System.out.println(arr[i]);





        }


    }
}
