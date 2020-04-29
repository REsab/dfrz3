package ch14.lx.q4;

public class TestAdd {
    public static void main(String[] args) {

         Customer maYun=new Customer();
         Customer maHuaTeng =new Customer();
         CustomerBiz AliBaBa=new CustomerBiz();

         maYun.name="马云";
         maYun.age=44;
         maYun.isMember=true;

         maHuaTeng.name="马化疼";
         maHuaTeng.age=55;
         maHuaTeng.isMember=false;
        AliBaBa.addCutomer(maYun);
         AliBaBa.addCutomer(maHuaTeng);


          AliBaBa.showCutomer();

    }

}
