package ch11.zy.q5;

public class StartComputer {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.CPUinfo = "Inter i7 4Ghz;";
		computer.motherBoard = "华硕主板;";
		computer.menory = "金士顿8G;";
		computer.disk = "西数 1TB;";
		computer.display = "Aoc i180";
		computer.showInfo();

	}

}
