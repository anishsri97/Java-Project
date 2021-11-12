import java.util.*;
import java.io.*;
class move 
{
   public static void main(String args[]) throws Exception
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int a[] = new int[n];
      
      for(int i=0;i<n;i++)
      {
          a[i]=Integer.parseInt(br.readLine());
      }
      //-1 -3 -7 4 5 6 2 8 9
      int i=0,l=n-1;
      while(i<=l)
      {
          if(a[i]>=0 && a[l]<0)
          {
              int t = a[i];
              a[i]=a[l];
              a[l]=t;
              i++;
              l--;
          }
          else if(a[i]>=0 && a[l]>=0)
          {
              l--;
          }
          else if(a[i]<0 && a[l]>=0)
          {
              i++;
              l--;
          }
          else
          {
              i++;
          }
      }
      System.out.println("Modified Array");
      for(int x:a)
      {
          System.out.println(x);
      }

   }    
}
