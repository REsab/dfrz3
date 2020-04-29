package lx2;

public class CustomerBiz {

    String[] name = new String[33];

    public void showNames() {
        System.out.println("***********************************");
        System.out.println("\t\t客户姓名列表");
        System.out.println("***********************************");

        for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {
                System.out.println(name[i]);
            }
        }
    }

    public String addName(String tmp) {

        for (int i = 0; i < name.length; i++) {
            if (name[i] == null) {
                name[i] = tmp;
            }


        }

        return "a";
    }

    public boolean editName(String oldName, String newName) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(oldName)) {
                name[i] = newName;
                return true;
            }
        }
        return false;
    }


}
