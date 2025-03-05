
import java.util.Scanner;

public class B_339 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int not=sc.nextInt();
        int[] task=new int[not];
        for(int i=0;i<not;i++){
            task[i]=sc.nextInt();
        }
        long ans=0;
        int c=1;
        for(int i:task){
            if(i>=c){
                ans+=i-c;
            }
            else{
                ans+=n-c+i;
            }
            c=i;
        }
        System.out.println(ans);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    }
}
