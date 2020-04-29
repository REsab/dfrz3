package ch11.lx.q3;

public class StartAdmin {
    public static void main(String[] args) {
        Admin admin1=new Admin();
        Admin admin2=new Admin();
        admin1.name="admin1";
         admin1.pwd=111111;
         admin1.showName();
          admin1.showPwd();
        admin2.name="admin2";
        admin2.pwd=222222;
        admin2.showName();
        admin2.showPwd();
    }

}
