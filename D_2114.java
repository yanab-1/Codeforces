
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class D_2114 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][2];
            Map<Integer, Integer> xCount = new HashMap<>();
            Map<Integer, Integer> yCount = new HashMap<>();
            List<Integer> xVals = new ArrayList<>();
            List<Integer> yVals = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                a[i][0] = x;
                a[i][1] = y;
                xVals.add(x);
                yVals.add(y);
                xCount.put(x, xCount.getOrDefault(x, 0) + 1);
                yCount.put(y, yCount.getOrDefault(y, 0) + 1);
            }
            if (n == 1) {
                System.out.println(1);
                continue;
            }
            Collections.sort(xVals);
            Collections.sort(yVals);
            long minX = xVals.get(0);
            long maxX = xVals.get(n - 1);
            long min2X = xVals.get(1);
            long max2X = xVals.get(n - 2);
            long minY = yVals.get(0);
            long maxY = yVals.get(n - 1);
            long min2Y = yVals.get(1);
            long max2Y = yVals.get(n - 2);
            long baseWidth = maxX - minX + 1;
            long baseHeight = maxY - minY + 1;
            long baseArea = baseWidth * baseHeight;
            long ans = baseArea;
            for (int[] coords : a) {
                long xi = coords[0];
                long yi = coords[1];
                long newMinX = (xi == minX && xCount.get((int) minX) == 1) ? min2X : minX;
                long newMaxX = (xi == maxX && xCount.get((int) maxX) == 1) ? max2X : maxX;
                long newMinY = (yi == minY && yCount.get((int) minY) == 1) ? min2Y : minY;
                long newMaxY = (yi == maxY && yCount.get((int) maxY) == 1) ? max2Y : maxY;
                long width = newMaxX - newMinX + 1;
                long height = newMaxY - newMinY + 1;
                long area = width * height;
                if (area == n - 1) {
                    area += Math.min(width, height);
                }
                ans = Math.min(ans, area);
            }

            System.out.println(ans);
        }
    }
}
