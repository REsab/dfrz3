import java.util.Scanner;

/**
 *
 * 相当于数据库
 * 相当于数据库
 * 相当于数据库
 * 定义Student数组arrStu——30个元素，初始化如下数据： 1 张三 男
 * 2 李四 女
 * 3 王五 男
 *
 * 提示：
 * 在DataCenter中创建一个initData()方法初始化数据；
 * 为DataCenter创建无参构造函数，以便实例化时调用调用initData()。
 * 3) 访问层类StudentDao【相当于三层结构中的数据访问层】
 * 只完成对DataCenter类中的学生类数组的增删改查，注意，不能有输入输出；
 * 先实例化DataCenter类的一个对象，作为StudentDao的属性。
 *
 */

public class DataCenter {

    int num = 100;

  public   Student[] studentsArr = new Student[num];

    public DataCenter() {
        initData();

    }

    public void initData() {
        for (int i = 0; i < 3; i++) {
            studentsArr[i] = new Student();
        }
        studentsArr[0].id = 1;
        studentsArr[0].name = "张三";
        studentsArr[0].sex = "男";

        studentsArr[1].id = 2;
        studentsArr[1].name = "李四";
        studentsArr[1].sex = "女";

        studentsArr[2].id = 3;
        studentsArr[2].name = "王五";
        studentsArr[2].sex = "男";


    }

}
