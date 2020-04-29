package ch11.zy.q6;

public class Monster {
    String mosterName;
    int liveBlood;
    String monsterType;


    public  void showInfo(){
        System.out.println("我是怪物,我的基本信息如下");
        System.out.println("怪物名:"+mosterName+",生命值:"+liveBlood+",类型:"+monsterType);


    }
}
