import java.util.*;


public class driverClass 
{
  public static void main(String args[])
  {
      treeStructure ts = new treeStructure("Anish",null,null);
      ts.left=new treeStructure("Anish'sleft",null,null);
      ts.right=new treeStructure("Anish's right",null,null);
      
      System.out.println(ts.name);
      System.out.println(ts);

      System.out.println("Preorder traversal");
      preorder(ts);
      System.out.println("inorder traversal");
      inorder(ts);
      System.out.println("Postorder traversal");
      postorder(ts);
      System.out.println("BFS traversal");
      bfs(ts);

  }    

   
  /* root->left->right*/
  public static void preorder(treeStructure root)
   {
       if(root!=null)
       {
           System.out.println(root.name);
           preorder(root.left);
           preorder(root.right);
       }
   }

   /*left-root-right*/
   public static void inorder(treeStructure root)
   {
       if(root!=null)
       {
           inorder(root.left);
           System.out.println(root.name);
           inorder(root.right);
       }
   }


  /*left-right-root*/
   public static void postorder(treeStructure root)
   {
       if(root!=null)
       {
           
           preorder(root.left);
           preorder(root.right);
           System.out.println(root.name);
       }
   }

   /*bfs*/

   public static void bfs(treeStructure root)
   {
       LinkedList<treeStructure> ll =new LinkedList<>();
       ll.add(root);
       int c=-1;
       while(!ll.isEmpty())
       {
          int n =ll.size(); 
          System.out.println("level = "+ (++c));
          for(int i=0;i<n;i++)
          {
              treeStructure temp = ll.pop();
              if(temp.left!=null)ll.add(temp.left);
              if(temp.right!=null)ll.add(temp.right);
              System.out.println(temp.name);
          }
       }
   }
}


