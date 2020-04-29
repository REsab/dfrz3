

public class SwapParam {
    int a3;
    int b3;

    public void swap01(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public void swap02(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    public void swap03(SwapParam a, SwapParam b) {
        SwapParam temp;
        temp = a;
        a = b;
        b = temp;
    }

}
