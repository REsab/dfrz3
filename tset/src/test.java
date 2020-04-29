import java.net.SocketTimeoutException;

public class test {
    public static void main(String[] args) {
        int x = 1, a = 0, b = 0;
        switch (x) {
            case 0:
                b++;
            case 1:
                a++;
            case 2:
                a++;
                b++;
        }
        System.out.println("a=" + a + ",b=" + b);


    }

}
