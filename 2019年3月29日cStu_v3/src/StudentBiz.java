import java.util.Scanner;

public class StudentBiz {
    int num = 100;
    Scanner scanner = new Scanner(System.in);

    Student[] arr = new Student[num];

    int arrayMaxIndex = 0;

    public StudentBiz() {
        initData();

    }

    public void initData() {
        for (int i = 0; i < 3; i++) {
            arr[i] = new Student();
        }
        arr[0].id = 1;
        arr[0].name = "张三";
        arr[0].sex = "男";

        arr[1].id = 2;
        arr[1].name = "李四";
        arr[1].sex = "女";

        arr[2].id = 3;
        arr[2].name = "王五";
        arr[2].sex = "男";
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
            if (arr[i] != null) {
                if (arr[i] != null) {

                    System.out.print(arr[i].id + "   ");
                    System.out.print(arr[i].name + "   ");
                    System.out.print(arr[i].sex);
                    System.out.println();

                }
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

            if (arr[i] != null) {

                if (id.equals(arr[i].id)) {


                    return i;
                }
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
        Integer tempNum = Input.getAnInputInt(0, num);


        if (1 == exists(tempNum)) {  //寻找是否有这个学号 的学生
            Integer index = searchIdIndex(tempNum);  //有这个学生再找他的下标位置
            System.out.println("请输入 " + arr[index].name + " 的新名字");
            arr[index].name = scanner.next();
            System.out.println("请输入新的性别 ");
            arr[index].sex = scanner.next();
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
                deleteid(id);

                System.out.println("删除成功");



                list();
            }

        } else {
            System.out.println("找不到这个学号的人,请想好来 \n  按键不规范 新人两行水");
        }


    }

    /* w
  删除id
     */
public void deleteid(int id){

    if (id>=0&&id<arr.length){
        int last=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] == null) {

                last=i;
                break;
            }

            arr[i]=arr[i+1];


        }
        if (last != -1) {

            arr[last]=null;
        }

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

            if (arr[i] != null) {

                if (arr[i].id.equals(id)) {

                    return 1;
                }
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
        for (int i = 0; i < num; i++) {

            if (arr[i] == null) {
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
            if (arr[i] != null) {
                if (id == arr[i].id) {
                    System.out.println(id + "号已经存在");
                    return;
                }
            }
        }

        System.out.println("请输入姓名:");
        String name1 = scanner.next();
        System.out.println("请选择性别:");
        String sexx = scanner.next();
        System.out.println("添加成功");
        int i = getNewIndex();
        arr[i] = new Student();
        arr[i].id = id;
        arr[i].name = name1;
        arr[i].sex = sexx;

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


