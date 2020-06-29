import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int prod = (n * (n + 1)) / 2;
        if (prod % 2 != 0)
            System.out.println("NO");
        else {
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            int i;
            int j = n;
            if (n % 2 == 0) {
                i = 1;
            } else {
                set1.add(1);
                set1.add(2);
                set2.add(3);
                i = 4;
            }
            while (i <= j) {
                set1.add(i);
                ++i;
                set2.add(i);
                ++i;
                set1.add(j);
                --j;
                set2.add(j);
                --j;
            }
            System.out.println("YES");
            System.out.println(set1.size());
            StringBuilder str1 = new StringBuilder();
            for (int x : set1)
                str1.append(x).append(" ");
            System.out.println(str1.toString());
            System.out.println(set2.size());
            StringBuilder str2 = new StringBuilder();
            for (int x : set2)
                str2.append(x).append(" ");
            System.out.println(str2.toString());
        }
    }
}
