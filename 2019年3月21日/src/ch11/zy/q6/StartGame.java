package ch11.zy.q6;

public class StartGame {

    public static void main(String[] args) {
        //实例一个英雄
        Hero Arthur = new Hero();
        Arthur.heroName = "亚瑟";
        Arthur.liveBlood = 6549;
        Arthur.showInfo();
//实例一个武器
        Weapon myFortyMeterBigKnife = new Weapon();
        myFortyMeterBigKnife.attckPower = 999;
        myFortyMeterBigKnife.name = "40米大刀";
        myFortyMeterBigKnife.showInfo();
//实例一个怪兽
        Monster 猫咪 = new Monster();
        猫咪.mosterName = "小黑妞";
        猫咪.monsterType = "猫科怪兽";
        猫咪.liveBlood = 590;
        猫咪.showInfo();

    }

}
