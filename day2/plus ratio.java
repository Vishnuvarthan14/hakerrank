import java.util.*;
public class solution{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        float a1=0,b1=0,c1=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0){
                a1++;
            }
            else if(arr[i]<0){
                b1++;
            }
            else{
                c1++;
            }
            
        }
            double a=a1/n;
            double b=b1/n;
            double c=c1/n;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
    }
}
