package ch14.kt.q4;

public class TestAdd {
    public static void main(String[] args) {
        Student WeiLiu = new Student();
        Student WeiLiuPlus=new Student();
        StudentBiz studentBiz =new StudentBiz();



        WeiLiu.id = 1;
        WeiLiu.name = "张三";
        WeiLiu.age = 110;
        WeiLiu.score = 99;

        WeiLiuPlus.id = 2;
        WeiLiuPlus.name = "张2三";
        WeiLiuPlus.age = 16;
        WeiLiuPlus.score = 26;

        studentBiz.addStudent(WeiLiu);
        studentBiz.addStudent(WeiLiuPlus);

         studentBiz.showStudents();


    }

}
