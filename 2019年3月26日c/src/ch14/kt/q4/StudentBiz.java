package ch14.kt.q4;


public class StudentBiz {
    Student[] students = new Student[30];


    StudentBiz(){
students[0]=new Student();
        students[0].score=33;
    }
    public void addStudent(Student stu) {
        System.out.println("本班学生信息");
        for (int i = 0; i < students.length; i++) {
            if (students[i]== null) {
                students[i] = stu;
                break;

            }
        }

    }

    public void showStudents() {
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null) {
                System.out.print(students[i].id + "   ");
                System.out.print(students[i].name + "   ");
                System.out.print(students[i].age + "   ");
                System.out.print(students[i].score + "   ");
                System.out.println();

            }

        }

    }


}
