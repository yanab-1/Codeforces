import java.util.Scanner;

public class A_2096 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            String s=sc.next();
            int [] arr = new int[n];

            int presmall =1;
            int pregre=n;
            for(int i=s.length()-1;i>=0;i--) {
                if(s.charAt(i)=='<'){
                    arr[i+1]=presmall++;
                }
                else{
                    arr[i+1]=pregre--;
                }
            }
            arr[0]=pregre;
            for(int i:arr){
                System.out.print(i+" ");
            }            
            System.out.println();  
        }
    }
}
