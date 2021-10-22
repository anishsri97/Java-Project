import java.util.*;
import java.io.*;



public class llmain 
{
  public static void main(String args[])
  {
     node n = new node(1);
     node n1= new node(2);
     node n2 = new node(3);
     node n3 = new node(4);
     n.next=n1;
     n1.next=n2;
     n2.next=n3;
     node t = n;
     while(t!=null)
     {
         System.out.println(" ->"+t.x+".");
         t=t.next;
     }
  }    
}
