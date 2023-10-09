import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
 public class solution{
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
       int i,j;
       for( i=n;i>=1;i--)
       {
           for( j=1;j<i;j++){
               System.out.print(" ");
           }
           for( j=0;j<=n-i;j++){
               System.out.print("#");
           }
           System.out.println("");
       }
    }
}
