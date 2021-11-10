import java.util.*;
import java.io.*;


class merge 
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int m=in.nextInt();
      int n=in.nextInt();
      int a[] = new int[m+n];
      int b[] = new int[n];
      System.out.println("first array input");
      for(int i=0;i<(m+n);i++)
      {
          a[i]=in.nextInt();
      }
      for(int i=0;i<n;i++)
      {
          b[i]=in.nextInt();
      }

      int i=0,j=0;
      while(i<(m+n) && j<n)
      {
          if(a[i]>=b[j])
          {
              int t=b[j];
              for(int x=i;x<(m+n);x++)
              {
                  int temp=a[x];
                  a[x]=t;
                  t=temp;
              }
              j++;
          }
          else if(a[i]==0)
          {
              a[i]=b[j];
              j++;
          }
          else
          {
              i++;
          }
      }
      System.out.println("New Array");
      for(int ans:a)
      {
          System.out.println(ans);
      }


   }    
}
