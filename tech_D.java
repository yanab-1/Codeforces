import java.util.*;

public class tech_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = n - m;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            Set<Integer> candidates = new HashSet<>();
            for (int num : a) {
                int current = num;
                while (true) {
                    for (int delta = -1; delta <= 1; delta++) {
                        int candidate = current + delta;
                        if (candidate >= 1) {
                            candidates.add(candidate);
                        }
                    }
                    if (current == 1) {
                        break;
                    }
                    current = current / 2;
                    if (current < 1) {
                        break;
                    }
                }
            }

            long minTotal = Long.MAX_VALUE;
            for (int h : candidates) {
                List<Integer> stepsList = new ArrayList<>();
                for (int num : a) {
                    stepsList.add(calculateSteps(num, h));
                }
                Collections.sort(stepsList);
                if (stepsList.size() >= k) {
                    long sum = 0;
                    for (int i = 0; i < k; i++) {
                        sum += stepsList.get(i);
                    }
                    if (sum < minTotal) {
                        minTotal = sum;
                    }
                }
            }

            System.out.println(minTotal);
        }
    }

    private static int calculateSteps(int num, int h) {
        int minimalSteps = Integer.MAX_VALUE;
        int current = num;
        int d = 0;
        while (current >= 1) {
            int steps = d + Math.abs(current - h);
            if (steps < minimalSteps) {
                minimalSteps = steps;
            }
            int nextCurrent = current / 2;
            if (nextCurrent < 1) {
                break;
            }
            current = nextCurrent;
            d++;
        }
        return minimalSteps;
    }
}