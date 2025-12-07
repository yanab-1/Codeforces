import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    static class State {
        long happiness;
        int index;

        public State(long happiness, int index) {
            this.happiness = happiness;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int val = sc.nextInt();
            if (val > k) {
                a[i] = k;
            } else {
                a[i] = val;
            }
        }

        int[][] nextPos = new int[n + 2][k + 1];
        
        Arrays.fill(nextPos[n + 1], n + 1);

        for (int i = n; i >= 1; i--) {
            for (int v = 0; v <= k; v++) {
                if (a[i] >= v) {
                    nextPos[i][v] = i;
                } else {
                    nextPos[i][v] = nextPos[i + 1][v];
                }
            }
        }

        ArrayList<State>[][] dp = new ArrayList[k + 1][k + 1];
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = new ArrayList<>();
            }
        }

        dp[0][0].add(new State(0, 0));

        long maxAns = 0;

        for (int w = 1; w <= k; w++) {
            for (int v = 1; v <= w; v++) {
                for (int prevV = 0; prevV < v; prevV++) {
                    int prevW = w - v;

                    if (prevW >= 0 && !dp[prevW][prevV].isEmpty()) {
                        
                        for (State s : dp[prevW][prevV]) {
                            int nextIdx = nextPos[s.index + 1][v];

                            if (nextIdx <= n) {
                                long gain = (long) (v - prevV) * (n + 1 - nextIdx);
                                long nextH = s.happiness + gain;

                                if (nextH > maxAns) {
                                    maxAns = nextH;
                                }

                                ArrayList<State> currentList = dp[w][v];
                                boolean isDominated = false;

                                for (State existing : currentList) {
                                    if (existing.happiness >= nextH && existing.index <= nextIdx) {
                                        isDominated = true;
                                        break;
                                    }
                                }

                                if (!isDominated) {
                                    Iterator<State> it = currentList.iterator();
                                    while (it.hasNext()) {
                                        State existing = it.next();
                                        if (nextH >= existing.happiness && nextIdx <= existing.index) {
                                            it.remove();
                                        }
                                    }
                                    currentList.add(new State(nextH, nextIdx));
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(maxAns);
    }
}