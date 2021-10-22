import java.util.*;
import java.io.*;




public class treeMain 
{
 
  static  ArrayList<Integer> l = new ArrayList<>();
 
    public static void main(String args[])
  {
      Tnode t = new Tnode(1);
      Tnode t1 = new Tnode(3);
     // Tnode t2 = new Tnode(3);
     // Tnode t3 = new Tnode(4);
      t.left=t1;
      //t.right=t2;
      //t2.left=t3;
      inorder(t);
      levelorder(t);
      int s=0;
      System.out.println("Height of tree = "+height(t));
      sum(t,s,l);
      for(int a:l)
      {
        s+=a;   
      }
      System.out.println("Sum of tree = "+s);
      

      
  }   
  
  public static void inorder(Tnode t)
  {
      if(t!=null)
      {
      inorder(t.left);
      System.out.println("data - >"+t.x);
      inorder(t.right);
      }
  }

  public static void levelorder(Tnode t)
  {
      LinkedList<Tnode> ll = new LinkedList<>();
      ll.add(t);
      int level=0;
      while(!ll.isEmpty())
      {
          int n = ll.size();
          ++level;
          for(int i=0;i<n;i++)
          {
              Tnode temp = ll.pop();
              if(temp.left!=null)ll.add(temp.left);
              if(temp.right!=null)ll.add(temp.right);
              System.out.print(level+" ->"+temp.x);
          }
          System.out.println();
      }
  }

  public static int height(Tnode t)
  {
      if(t==null) return 0;
      return 1+Math.max(height(t.left),height(t.right));
  }

  public static void sum(Tnode t,int s,ArrayList<Integer> l)
  {
      if(t==null) return;
      s=(s*10)+t.x;
      sum(t.left,s,l);
      sum(t.right,s,l);
      if(t.left==null && t.right==null)
      {
        System.out.println("Nimber = "+s);
        l.add(s);
      }
  }
}
