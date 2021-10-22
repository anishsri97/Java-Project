public class Solution {
	public ListNode getIntersectionNode(ListNode a, ListNode b) 
    {
	    int l1 = length(a);
        int l2 = length(b);
        if(l1>l2)
        {
            for(int i=1;i<=(l1-l2);i++)
            {
                a=a.next;
            }
        }
        if(l2>l1)
        {
            for(int i=1;i<=(l2-l1);i++)
            {
                b=b.next;
            }
        }
        while(a!=b)
        {
            a=a.next;
            b=b.next;
        }
        return a;
    }

    public int length(ListNode a)
    {
        int x=0;
        while(a!=null)
        {
            a=a.next;
            x+=1;
        }
        return x;
    } 
}