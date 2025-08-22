
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class B_1665 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                map.put(a[i],map.getOrDefault(a[i],0)+1);
            }
            int ele=Collections.max(map.values());
            int op=0;
            while(ele<n){
                int swp=Math.min(ele,n-ele);
                op+=1+swp;
                ele+=swp;
            }
            System.out.println(op);
        }
    }
}
