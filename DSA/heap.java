import java.util.ArrayList;

class heap 
{
    public static void main(String args[])
    {
        int arr[]={7 ,10 ,4 ,20 ,15};
        ArrayList<Integer> list = new ArrayList<Integer>();
       //list.add(10);
       //list.set(0,40);
        for(int x:arr)
        {
            min(list,x);
        }
        int k=4;
        for(int i=1;i<k;i++)
        {
            Delete(list);
        }
        System.out.println(list.get(0));

        /*delete(list);
        System.out.println(list);
        delete(list);
        System.out.println(list);*/
    }    
   

   public static void delete(ArrayList<Integer> list)
   {
     if(list.size()==0)return;  
     list.set(0,list.get(list.size()-1));
       list.remove(list.size()-1);
       int i=0;
       if(list.size()==0)return;
       while(i<list.size()-1)
       {
          int larg=0; 
          if((2*i)+1<list.size() && (2*i)+2<list.size())
           {
               larg = list.get((2*i)+1)>list.get((2*i)+2)?(2*i)+1:(2*i)+2;
           }
           else if((2*i)+1<list.size() || (2*i)+2<list.size())
           {
                 if((2*i)+1<list.size())
                 {
                     larg=(2*i)+1;
                 }
                 if((2*i)+2<list.size())
                 {
                     larg=(2*i)+2;
                 }
           }
           else
           {
               return;
           }
           if(list.get(i)<list.get(larg))
           {
               int t = list.get(i);
               list.set(i,list.get(larg));
               list.set(larg,t);
               i=larg;
           }
           else return;
       }
   }
   public static void Delete(ArrayList<Integer> list)
   {
     if(list.size()==0)return;  
     list.set(0,list.get(list.size()-1));
       list.remove(list.size()-1);
       int i=0;
       if(list.size()==0)return;
       while(i<list.size()-1)
       {
          int larg=0; 
          if((2*i)+1<list.size() && (2*i)+2<list.size())
           {
               larg = list.get((2*i)+1)>list.get((2*i)+2)?(2*i)+2:(2*i)+1;
           }
           else if((2*i)+1<list.size() || (2*i)+2<list.size())
           {
                 if((2*i)+1<list.size())
                 {
                     larg=(2*i)+1;
                 }
                 if((2*i)+2<list.size())
                 {
                     larg=(2*i)+2;
                 }
           }
           else
           {
               return;
           }
           if(list.get(i)>list.get(larg))
           {
               int t = list.get(i);
               list.set(i,list.get(larg));
               list.set(larg,t);
               i=larg;
           }
           else return;
       }
   }
   public static void min(ArrayList<Integer> list,int value)
   {
       list.add(value);
       int i=list.size()-1;
       while(i>0)
       {
           if(list.get(i)<list.get((i-1)/2))
           {
               int t = list.get(i);
               list.set(i,list.get((i-1)/2));
               list.set((i-1)/2,t);
               i=(i-1)/2;
           }
           else 
           {
               return;
           }
       }
   }
    public static void max(ArrayList<Integer> list,int value)
    {
        list.add(value);
        int i=list.size()-1;
        while(i>0)
        {
            if(list.get(i)>list.get((i-1)/2))
            {
                int t = list.get(i);
                list.set(i,list.get((i-1)/2));
                list.set((i-1)/2,t);
                i=(i-1)/2;
            }
            else 
            {
                return;
            }
        }
    }
}
