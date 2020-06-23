import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long sum = 0;
        long i;
        for (i = 1; i * i <= n; ++i) {
            sum += ((n / i) * i);
            sum %= 1000000007;
        }
        long marker = i;
        for (long occurrences = 1; occurrences * occurrences <= n; ++occurrences) {
            sum += (occurrences * (sum_ap(Math.max(n / (occurrences + 1) + 1, marker), n / occurrences))) % 1000000007;
            sum %= 1000000007;
        }
        System.out.println(sum % 1000000007);
    }

    static long sum_ap(long start, long end) {
        long num = end - start + 1;
        if (num % 2 == 0)
            return (((num / 2) % 1000000007) * ((start + end) % 1000000007)) % 1000000007;
        else
            return ((num % 1000000007) * (((start + end) / 2) % 1000000007)) % 1000000007;
    }
}
