
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class E_2123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a= new int[n];
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            print(a,n);
        }
    }

    private static void print(int[] a, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        ArrayList<Integer> key = new ArrayList<>(map.keySet());
        Collections.sort(key);
        HashMap<Integer, Integer> freq = new HashMap<>();
        int mex=0;
        for(int i:key){
            if(i==mex){
                mex++;
                freq.put(map.get(i), freq.getOrDefault(map.get(i), 0) + 1);
            }
        }
        int[] ans=new int[n+1];
        ans[n]=1;
        for(int i=n-1;i>n-mex;i--){
            ans[i]=ans[i+1]+1;
        }
        ans[0]=1;
        for(int i=1;i<n;i++){
            if(ans[i]!=0){
                break;
            }
            ans[i]=ans[i-1]+freq.getOrDefault(i, 0);
        }
        for(int i=0;i<=n;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
