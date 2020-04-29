package ch11.zy.q4;

import ch11.zy.q3.CurrentTime;

public class StartCurrentTime {
	public static void main(String[] args) {
		CurrentTime time = new CurrentTime();
		System.out.print("当前时间是:");
		time.curTime = "2019年3月21日16点46分56秒";
		time.showTime();
		time.curTime = "2019年3月21日16:51:34";
		System.out.print("\n修改后的时间是:");
		time.showTime();

	}

}
