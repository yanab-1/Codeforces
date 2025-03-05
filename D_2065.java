import java.util.*;

public class D_2065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt(); // Number of arrays
            int m = sc.nextInt(); // Length of each array
            
            int[][] arrays = new int[n][m];
            long[] prefixSums = new long[n];
            
            // Read the arrays and calculate their prefix sums
            for (int i = 0; i < n; i++) {
                long sum = 0;
                for (int j = 0; j < m; j++) {
                    arrays[i][j] = sc.nextInt();
                    sum += arrays[i][j];
                }
                prefixSums[i] = sum;
            }
            
            // Sort the arrays based on their prefix sums in descending order
            Integer[] indices = new Integer[n];
            for (int i = 0; i < n; i++) {
                indices[i] = i;
            }
            
            Arrays.sort(indices, (a, b) -> Long.compare(prefixSums[b], prefixSums[a]));
            
            // Concatenate the arrays in the sorted order
            int[] concatenatedArray = new int[n * m];
            int idx = 0;
            for (int i : indices) {
                for (int j = 0; j < m; j++) {
                    concatenatedArray[idx++] = arrays[i][j];
                }
            }
            
            // Calculate the score of the concatenated array
            long score = 0;
            long currentSum = 0;
            for (int num : concatenatedArray) {
                currentSum += num;
                score += currentSum;
            }
            
            System.out.println(score);
        }
        
        sc.close();
    }
}