import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] arr = new boolean[n];
        for (int i = 0; i < n - 1; ++i) {
            int temp = scanner.nextInt();
            arr[temp - 1] = true;
        }
        for (int i = 0; i < n; ++i) {
            if (!arr[i]) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
