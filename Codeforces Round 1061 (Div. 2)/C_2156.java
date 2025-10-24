import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C_2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int tc = 0;
        if (t > 0) {
            do {
                sb.append(processTestCase(sc)).append('\n');
                tc++;
            } while (tc < t);
        }
        System.out.print(sb.toString());
    }

    static int processTestCase(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> a = readArray(sc, n);
        Map<Integer, Integer> freq = buildFrequencyMap(a);
        int[] pref = buildPrefixArray(freq, n);
        return findMaxGCD(n, k, freq, pref);
    }

    static List<Integer> readArray(Scanner sc, int n) {
        List<Integer> a = new ArrayList<>();
        int i = 0;
        do {
            a.add(sc.nextInt());
            i++;
        } while (i < n);
        return a;
    }

    static Map<Integer, Integer> buildFrequencyMap(List<Integer> a) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : a) freq.put(x, freq.getOrDefault(x, 0) + 1);
        return freq;
    }

    static int[] buildPrefixArray(Map<Integer, Integer> freq, int n) {
        int[] pref = new int[n + 1];
        int i = 1;
        do {
            pref[i] = pref[i - 1] + freq.getOrDefault(i, 0);
            i++;
        } while (i <= n);
        return pref;
    }

    static int findMaxGCD(int n, int k, Map<Integer, Integer> freq, int[] pref) {
        int ans = 1;
        int g = n;
        if (g >= 1) {
            do {
                if (canAchieveGCD(g, k, n, freq, pref)) {
                    ans = g;
                    break;
                }
                g--;
            } while (g >= 1);
        }
        return ans;
    }

    static boolean canAchieveGCD(int g, int k, int n, Map<Integer, Integer> freq, int[] pref) {
        int up = Math.min(n, 4 * g - 1);
        int s1 = pref[up];
        int s2 = calculateValidCount(g, n, freq);
        int bad = s1 - s2;
        return bad <= k;
    }

    static int calculateValidCount(int g, int n, Map<Integer, Integer> freq) {
        int s2 = 0;
        List<Integer> multiples = getMultiples(g, n);
        for (int val : multiples) s2 += freq.getOrDefault(val, 0);
        return s2;
    }

    static List<Integer> getMultiples(int g, int n) {
        List<Integer> list = new ArrayList<>();
        int mult = g;
        while (mult <= n && mult <= 3 * g) {
            list.add(mult);
            mult += g;
        }
        return list;
    }
}
