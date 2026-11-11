import java.util.Arrays;

public class ArrayBilangan29 {
    public static void main(String[] args) {
        int[] bil = { 5, 13, -7, 17 };

        for (int i = 0; i <= 4; i++) {
            System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));
    }
}