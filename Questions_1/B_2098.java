import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B_2098 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(Math.abs(i-(n-i-1))<=k+1){
                ll.add(a[i]);
            }
        }
        Collections.sort(ll);
        System.out.println(ll.get(ll.size()-1)-ll.get(0)+1);
    }
}
