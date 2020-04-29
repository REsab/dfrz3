package ch08.zy.q6;

import java.util.Scanner;


public class Insert {
    public static void main(String[] args) {
        //定义两个数组
        String [] songArray={"Island","Ocean","Pretty","Sun"  };  //旧数组
        String [] newSongArray=new String[songArray.length+1]; //其实就是[5]   定义新数组
        for (int i = 0; i < songArray.length; i++) {
            System.out.print(songArray[i]+"  ");  //打印出旧数组
             newSongArray[i]=songArray[i];  //轮流赋值新数组            
        }
         //输入一个新歌名
        System.out.println("来个新歌的名字:");
        Scanner scanner=new Scanner(System.in);
        newSongArray[newSongArray.length-1]=scanner.next();
         //排序  从小到大  按 a-z  不区分大小写
        for (int i = 0; i < newSongArray.length-1; i++) {
            for (int j = i; j < newSongArray.length; j++) {
                if (newSongArray[i].compareToIgnoreCase(newSongArray[j])>=0){
                String temp=newSongArray[i];
                newSongArray[i]=newSongArray[j];
                newSongArray[j]=temp;
                }else{
                    continue;
                }
            }
        }

         //打印出排序好的
        for (String str :
                newSongArray) {
            System.out.print(str+"  ");
        }
//   如果上面的看不懂  用下面的三行 ,效果一样
//        for (int i=0;i<newSongArray.length;i++){
//            System.out.print(newSongArray[i]);
//        }
         

    }

}
