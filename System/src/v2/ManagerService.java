package v2;
public class ManagerService {

    Manager[] arrManager = new Manager[103];

    ManagerService() {
        initData();
    }

    public void initData() {
        /*************
         * why    新建对象后  要初始化对象
         * **********/
        for (int i = 0; i < arrManager.length; i++) {
            arrManager[i] = new Manager();

        }

        arrManager[0].userName = "admin";
        arrManager[1].userName = "user";
        arrManager[2].userName = "guest";
        for (int i = 3; i < 44; i++) {
            arrManager[i].password = "222";

        }

        for (int i = 0; i < 3; i++) {
            arrManager[i].password = "123";
        }

    }


    public boolean login(String name, String pwd) {
        for (int i = 0; i < 3; i++) {
            if (name.equals(arrManager[i].userName) && arrManager[i].password.equals(pwd)) {
                return true;
            }
        }

        return false;

    }


}
