
import java.io.*;




public class weird 
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a%2!=0) System.out.println("weird");
        else
        {
           if((a>=2 && a<=5) || (a>=20)) System.out.println("not weird");
           else System.out.println("weird");
        }
    }    
}
