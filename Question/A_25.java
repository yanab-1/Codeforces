import java.util.Scanner;

public class A_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int evenCount = 0, oddCount = 0;
        int evenIndex = -1, oddIndex = -1;
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] % 2 == 0) {
                evenCount++;
                evenIndex = i + 1; 
            } else {
                oddCount++;
                oddIndex = i + 1; 
            }
        }
        if (evenCount == 1) {
            System.out.println(evenIndex);
        } else {
            System.out.println(oddIndex);
        }
    }
}
