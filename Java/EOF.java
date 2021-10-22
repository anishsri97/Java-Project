import java.util.*;
import java.io.*;
import java.text.DecimalFormat;






public class EOF 
{
   public static void main(String args[])
   {
       int arr[]={2,5,1,3,4,7};
       int ans[] = new int[arr.length];
       int mid=arr.length/2;
       int i=0,j=mid;
       int x=0;
       while(i<mid && j<arr.length)
       {
           ans[x++]=arr[i++];
           ans[x++]=arr[j++];
       }       
       System.out.println("new Array");
       for(int k:ans)
       {
          
        System.out.println(k);
        System.out.println(k);
        System.out.println(k);//hellow
       }
   }    
}
