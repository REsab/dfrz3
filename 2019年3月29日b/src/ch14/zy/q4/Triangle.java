package ch14.zy.q4;

public class Triangle {
    public void printTriangle(int line,String character) {

        for (int i = 0; i < line; i++) {
            for (int j = 0; j <i+1 ; j++) {
                System.out.print(character);
            }
            System.out.println();

        }

    }
}
