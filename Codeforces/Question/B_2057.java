import java.util.*;
import java.util.Scanner;

public class B_2057{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            count(a,n,k);
        }
    }
    public static void count(int[] a,int n,int k){
        List<Integer> freq=new ArrayList<>();
        freq.add(1);
        for(int i=1;i<n;i++){
            if(a[i]==a[i-1]){
                freq.set(freq.size()-1,freq.get(freq.size()-1)+1);
            }
            else{
                freq.add(1);
            }
        }
        Collections.sort(freq);
        int ans=freq.size();
        for(int i=0;i<ans-1;i++){
            if(freq.get(i)>k){
                System.out.println(ans-i);
                return;
            }
            k-=freq.get(i);
        }
        System.out.println(1);
    }
}