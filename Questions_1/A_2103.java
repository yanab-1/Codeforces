import java.util.*;
public class A_2103{       
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                set.add(a);
            }
            System.out.println(set.size());
        }
    }
}