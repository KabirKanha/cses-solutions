import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int cnt = 1;
        int max = 1;
        char[] arr = str.toCharArray();
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i]==arr[i-1])
            {
                cnt++;
            }
            else
            {
                if (cnt>max)
                    max=cnt;
                cnt=1;
            }
        }
        if (cnt>max)
            max=cnt;
        System.out.println(max);
    }
}
