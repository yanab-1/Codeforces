
import java.util.HashMap;
import java.util.Scanner;

public class C_1722 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            HashMap<String,Integer> map=new HashMap<>();
            String[] arr1=new String[n];
            String[] arr2=new String[n];
            String[] arr3=new String[n];
            for(int i=0;i<n;i++){
                arr1[i]=sc.next();
                map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
            }
            for(int i=0;i<n;i++){
                arr2[i]=sc.next();
                map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
            }
            for(int i=0;i<n;i++){
                arr3[i]=sc.next();
                map.put(arr3[i],map.getOrDefault(arr3[i],0)+1);
            }
            int a=0,b=0,c=0;
            for(int i=0;i<n;i++){
                int x=map.get(arr1[i]);
                if(x==1){
                    a+=3;
                }
                else if(x==2){
                    a+=1;
                }
                int y=map.get(arr2[i]);
                if(y==1){
                    b+=3;
                }
                else if(y==2){
                    b+=1;
                }
                int z=map.get(arr3[i]);
                if(z==1){
                    c+=3;
                }
                else if(z==2){
                    c+=1;
                }
            }
            System.out.println(a+" "+b+" "+c);
        }
    }
}
