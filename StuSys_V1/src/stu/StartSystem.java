package stu;


public class StartSystem {
    public static void main(String[] args) {

        Login_Ctrl ctrlor = new Login_Ctrl();
        SystemMainMenu menu=new SystemMainMenu();

        if (ctrlor.login()) {
            while (true) {
                menu.showStudent();
                switch (Input.getAnInputInt(1, 5)) {

                    case 1:

                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;

                }
            }

        }


    }
}
