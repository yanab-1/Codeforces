
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class B_1859 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            int min=Integer.MAX_VALUE;
            while(n-->0){
                int m=sc.nextInt();
                int[] a=new int[m];
                for(int i=0;i<m;i++){
                    a[i]=sc.nextInt();
                }
                Arrays.sort(a);
                min=Math.min(min,a[0]);
                if(m>1){
                    list.add(a[1]);
                }
            }
            int min2=Integer.MAX_VALUE;
            long sum=0;
            for(int i=0;i<list.size();i++){
                sum+=list.get(i);
                min2=Math.min(min2,list.get(i));
            }
            System.out.println(min+(sum-min2));
        }
    }
}
