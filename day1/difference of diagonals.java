import java.util.*;
public class solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int a1=0,b1=0;
        int j=n-1;
         for(int i=0;i<n;i++)
        { 
             a1=a1+a[i][j];
           j--;
           
        }
         for(int i=0;i<n;i++)
        {
            b1=b1+a[i][i];
        }
        
        int sum;
        if(a1>b1){
           sum=a1-b1;}
        else
          {sum=b1-a1;}
        System.out.print(sum);
    }
}