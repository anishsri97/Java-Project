 class minmax 
 {
    public static void main(String args[])
    {
        int arr[]={10,23,34,56,47,89,100};
        int max=Integer.MIN_VALUE;
        for(int x:arr)
        {
            if(x>max)
            {
                max=x;
            }
        }
        System.out.println("Maximum value = "+max);
    }   
}
