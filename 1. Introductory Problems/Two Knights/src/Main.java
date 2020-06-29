import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; ++i) {
            long square = i * i;
            long possibilities = ((square) * (square - 1)) / 2;
            sum += getSum((int) i);
            System.out.println(possibilities - sum);
        }
    }

    static long getSum(int index) {
        int i, j;
        long sum = 0;

        j = index - 1;
        for (i = 0; i < index; ++i) {
            sum += countClashes(i, j);
        }

        i = index - 1;
        for (j = 0; j < index - 1; ++j) {
            sum += countClashes(i, j);
        }

        if (index >= 3)
            sum += 2;
        return sum;
    }

    static long countClashes(int i, int j) {
        long sum = 0;
        if (i - 2 >= 0 && j - 1 >= 0)
            ++sum;
        if (j - 2 >= 0 && i - 1 >= 0)
            ++sum;
        if (i - 2 >= 0 && j + 1 < i)
            ++sum;
        if (j - 2 >= 0 && i + 1 < j)
            ++sum;
        if (i - 1 >= 0 && j + 2 < i)
            ++sum;
        if (j - 1 >= 0 && i + 2 < j)
            ++sum;
        return sum;
    }
}
