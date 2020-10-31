/*
Written by Kabir Kanha Arora
@kabirkanha
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int maxDiff = scanner.nextInt();
        PriorityQueue<Integer> applicants = new PriorityQueue<>();
        PriorityQueue<Integer> apartments = new PriorityQueue<>();
        for (int i = 0; i < n; ++i) {
            applicants.add(scanner.nextInt());
        }
        for (int i = 0; i < m; ++i) {
            apartments.add(scanner.nextInt());
        }

        int ans = 0;
        while (!apartments.isEmpty() && !applicants.isEmpty()) {
            int nextApplicant = applicants.peek();
            int nextApartment = apartments.peek();
            if (Math.abs(nextApartment - nextApplicant) <= maxDiff) {
                ans++;
                apartments.poll();
                applicants.poll();
            } else if (nextApartment < nextApplicant)
                apartments.poll();
            else
                applicants.poll();
        }
        System.out.println(ans);
    }
}
