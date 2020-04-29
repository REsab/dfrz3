package ch14.zy.q6;

public class InsetArray {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 56;
        arr[2] = 34;
        arr[3] = 67;
        arr[4] = 89;
        System.out.println("插入前");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        InsetArray insetArray = new InsetArray();
        insetArray.insertArray(arr, 3, 100);

        System.out.println("\n插入后");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public void insertArray(int[] arr, int index, int value) {


        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];

        }

        arr[index] = value;


    }

}
