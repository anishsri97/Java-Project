import java.io.*;
import java.util.*;




public class formatting 
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        
        String str = in.next();
        int a = in.nextInt();
        System.out.printf("%-15s",str);
        System.out.printf("%03d",a);
     }   


}
