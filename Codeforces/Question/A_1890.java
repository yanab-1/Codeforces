
import java.util.HashMap;
import java.util.Scanner;

public class A_1890 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            HashMap<Integer,Integer> freq=new HashMap<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                freq.put(a[i],freq.getOrDefault(a[i],0)+1);
            }
            if(freq.size()==1){
                System.out.println("yes");
            }
            else if(freq.size()==2){
                int c1=0;
                int c2=0;
                for(int i:freq.values()){
                    if(c1==0){
                        c1=i;
                    }
                    else{
                        c2=i;
                    }
                }
                int f=n/2;
                int c=(n+1)/2;
                if((c1==f && c2==c) || (c1==c && c2==f)){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
            else{
                System.out.println("no");
            }
        }
    }
}
