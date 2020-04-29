package ch15.zy.q6;

import java.time.chrono.IsoChronology;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputBerify {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

          String bir="5";
          String pwd="";

           inputBirthdy:
           do {
               System.out.println("请输入会员生日<月/日: 00/00>:");
               bir =scanner.next();
               if (bir.length() ==5 && bir.indexOf("/") == 2) {
                   System.out.println("该会员的生日是:"+bir);
                break inputBirthdy;

               }else {
                   System.out.println("生日形式输入错误!");
               }
           }while (true);


        inputpwd:
        do {
            System.out.print("请输入会员密码<6~10位>:");
            pwd =scanner.next();
            if (pwd.length()> 5&&pwd.length()<11) {
                System.out.println("该会员的密码是:"+pwd);
                break inputpwd;

            }else {
                System.out.println("生日形式输入错误!");
            }
        }while (true);





    }




}
