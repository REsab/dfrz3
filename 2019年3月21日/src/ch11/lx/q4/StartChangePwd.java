package ch11.lx.q4;

public class StartChangePwd {
     String  name="admin";
     String pwd="123";
    public  void showName(){
        System.out.println(name);
    }
    public  void shoPwd(){
        System.out.println(pwd);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }
}
