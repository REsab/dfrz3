package ch14.lx.q4;

public class CustomerBiz {
    Customer[] customers = new Customer[33];

    CustomerBiz() {  //构造方法
        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer();   //  new  对象
        }
}

    public void addCutomer(Customer cus) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].name == null) {
                 customers[i]=cus;
                 break;

            }

        }


    }
    public void showCutomer() {
        System.out.println("姓名       年龄     会员");

        for (int i = 0; i < customers.length; i++) {
            if (customers[i].name != null) {
                System.out.print(customers[i].name+"       ");
                System.out.print(customers[i].age+"       ");
                System.out.print(customers[i].isMember+"   ");
                System.out.println();
            }

        }


    }

}
