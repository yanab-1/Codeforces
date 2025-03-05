import java.util.Scanner;

public class D_2050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            char[] arr = s.toCharArray();
            int swapcount = 1;
            int ans = 0;
            while (swapcount != 0) {
                int sw = 0;
                for (int i = 1; i < arr.length; i++) {
                    char a = (char) (arr[i] - 1);
                    char b = arr[i - 1];
                    if ((arr[i] != '1' || arr[i] != '0') && a - b > 0) {
                        if (arr[i] > arr[i - 1]) {
                            swap(i - 1, i, arr);
                            sw++;
                        }
                    }
                }

                if (sw == 0) {
                    break;
                }
            }
            System.out.println(new String(arr));
        }
    }
    public static void swap(int i, int j, char[] arr) {
        arr[j] = (char) (arr[j] - 1);
        char t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}