import java.util.*;
public class solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        int[] b=new int[10];
        int a1=0,b1=0;
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            if(a[i]>b[i])
            a1++;
            else if(b[i]>a[i])
            b1++;
            else
            continue;
        }
        System.out.print(a1+" ");
        System.out.print(b1);
    }
}
