package ch06.zy.q5;

public class PersonCout {
    public static void main(String[] args) {
        int allPerson = 30;

        for (int men = 1; men <= allPerson; men++) {   //遍历男人个数
            for (int women = 1; women <= allPerson - men; women++) {  //遍历女人个数
                for (int child = 1; child <= allPerson - men - women; child++) {
                    if ((men + women + child) == 30) {
                        if (((men * 3) + (women * 2) + (child * 1)) == 50) {
                            //      System.out.println(  "(men * 3) + (women * 2) + (child * 1)) =="+((men * 3) + (women * 2) + (child * 1) ));
                            System.out.println("男人  " + men + "人    女人" + women + "    小孩" + child + "人");
                        }
                    }
                }
            }
        }
    }
}
