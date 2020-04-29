
import java.util.Scanner;

public class StudentBiz {
    int num = 100;
    Scanner scanner = new Scanner(System.in);
    Integer[] stuId = new Integer[num];
    String[] stuName = new String[num];
    String[] stuSex = new String[num];
    int arrayMaxIndex = 0;

    public StudentBiz() {
        initData();

    }

    public void initData() {
        stuId[0] = 1;
        stuName[0] = "张三";
        stuSex[0] = "男";

        stuId[1] = 2;
        stuName[1] = "李四";
        stuSex[1] = "女";

        stuId[2] = 3;
        stuName[2] = "王五";
        stuSex[2] = "男";
        arrayMaxIndex = 2;


    }

    /**
     * 显示列表
     * 显示列表
     * 显示列表
     * 学生列表
     * 学生列表
     * 学生列表
     * 学生列表
     */
    public void list() {
        System.out.println("当前学生列表如下  ");
        System.out.println("--------------------");
        System.out.println("学号     姓名     性别 ");

        for (int i = 0; i < num; i++) {
            if (stuId[i] != null) {

                System.out.print(stuId[i] + "   ");
                System.out.print(stuName[i] + "   ");
                System.out.print(stuSex[i]);
                System.out.println();

            }
        }


    }

    /**
     * 获取id对应的下标
     * 获取id对应的下标
     * 获取id对应的下标
     * 获取id对应的下标
     */
    public Integer searchIdIndex(Integer id) {
        for (int i = 0; i < num; i++) {
            if (id.equals(stuId[i])) {
                return i;
            }
        }
        return -1;
    }


    /**
     * 修改学生
     * 修改学生
     * 修改学生
     */
    public void update() {
        list();
        System.out.println("输入学号");
        int tempId = Input.getAnInputInt(0, num);
        if (1 == exists(tempId)) {  //寻找是否有这个学号 的学生
            System.out.println("请输入 " + stuName[tempId] + " 的新名字");
            stuName[tempId] = scanner.next();
            System.out.println("请输入新的性别 ");
            stuSex[tempId] = scanner.next();
            System.out.println("修改成功 ");

            list();
            System.out.println();

        } else {
            System.out.println("id不存在,修改失败");
            System.out.println();
        }


    }


    /**
     * 删除对应下标的学生
     * 删除对应下标的学生
     * 删除对应下标的学生
     * 删除对应下标的学生
     */
    public void delete() {
        list();  //当前学生列表
        System.out.println("输入要删除的号数");
        Integer id = Input.getAnInputInt(0, num);  //输入一个号数

        if (1 == exists(id)) {   //判断学号是否存在
            System.out.println("真的要删除" + id + "号吗,不可逆操作哦,亲  1确认  0返回");
            if (1 == Input.getAnInputInt(0, 1)) {   //确认删除

                deleteId(id);

                list();
            }

        } else {
            System.out.println("找不到这个学号的人,请想好来 \n  按键不规范 新人两行水");
        }


    }

    /*
    删除下标为id 的数组位置
     */
    public void deleteId(Integer id) {
        int tempIndex = searchIdIndex(id);  //找到这个人的id下标
int lastIndex=-1;
        if (id >= 0 && id < stuId.length) {  //id合法

            for (int i = id+1; i <stuId.length ; i++) {
                if (stuId[i + 1] == null) {
                    lastIndex=i;
                    break;
                }
                 stuId[i]=stuId[i+1];
                stuName[i]=stuName[i+1];
                stuSex[i]=stuSex[i+1];

            }
            stuSex[lastIndex]=null;
            stuName[lastIndex]=null;
            stuId[lastIndex]=null;
            System.out.println("删除成功");


        }




    }


    /**
     * 是否存在这个号数
     * 是否存在这个号数
     * 有 1  无0
     * 有 1  无0
     */
    public Integer exists(Integer id) {
        for (int i = 0; i < getNewIndex(); i++) {

            //  if (stuId[i].equals(id)) {/////////整型  直接用==   equals 是string用的!!!!!!!!!!!!!!!
            if (stuId[i] == id) {/////////整型  直接用==   equals 是string用的!!!!!!!!!!!!!!!
                return 1;
            }
        }

        return 0;
    }

    /**
     * ///寻找第一个空下标
     *
     * @return
     */

    public int getNewIndex() {
        int index = 0;
        for (int i = 0; i < stuId.length; i++) {
            if (stuId[i] == null) {
                index = i;
                return index;

            }
        }
        return index;
    }

    /**
     * 插入学生
     * 插入学生
     * 插入学生
     * 插入学生
     * 插入学生
     * 插入学生
     */
    public void insert() {   //插入学生

        System.out.println("请输入学号:");
        Integer id = Input.getAnInputInt(1, num * 9);

        for (int i = 0; i < num; i++) {
            if (id == stuId[i]) {
                System.out.println(id + "号已经存在");
                return;
            }

        }

        System.out.println("请输入姓名:");
        String name1 = scanner.next();
        System.out.println("请选择性别:");
        String sexx = scanner.next();
        System.out.println("添加成功");
        int i = getNewIndex();

        stuId[i] = id;
        stuName[i] = name1;
        stuSex[i] = sexx;

    }


    /**
     * 按0返回
     * 按0返回
     * 按0返回
     */

    public void goBack() {


        System.out.println("按0返回");
        String str = scanner.next();
        for (; ; ) {
            if (!str.equals("0")) {
                str = scanner.next();
            } else {
                break;
            }
        }
    }


}



