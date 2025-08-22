
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A_1859 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            ArrayList<Integer> b=new ArrayList<>();
            b.add(a[0]);
            ArrayList<Integer> c=new ArrayList<>();
            for(int i=1;i<n;i++){
                if(a[i]==b.get(b.size()-1)){
                    b.add(a[i]);
                }
                else{
                    c.add(a[i]);
                }
            }
            if(b.isEmpty() || c.isEmpty()){
                System.out.println(-1);
                continue;
            }
            System.out.println(b.size()+" "+c.size());
            for(int i=0;i<b.size();i++){
                System.out.print(b.get(i)+" ");
            }
            System.out.println();
            for(int i=0;i<c.size();i++){
                System.out.print(c.get(i)+" ");
            }
            System.out.println();
        }
    }
}
