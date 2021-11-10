class square {
    
    public static void main(String args[])
    {
        int arr[]={-7,-3,2,3,11};
        sq(arr);
        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            boolean f=false;
            for(int j=0;j<n-1;j++)
            {
                if(Math.abs(arr[j])>Math.abs(arr[j+1]))
                {
                   f=true;
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
            if(!f)
            {
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=(arr[i]*arr[i]);
        }

        System.out.println("Squared Array");
        for(int x:arr)
        {
            System.out.println(x);
        }



    }


    public static void sq(int arr[])
    {
        int result[] = new int[arr.length];
        int left=0;
        int right = arr.length-1;
        int ind = arr.length-1;
        while(left<=right)
        {
            if(Math.abs(arr[left])>Math.abs(arr[right]))
            {
                result[ind] = arr[left]*arr[left];
                left++; 
            }
            else{
                result[ind]=arr[right]*arr[right];
                right--;
            }
            ind--;
        }

        System.out.println("Linear order approach");
        for(int x:result)
        {
            System.out.println(x);
        }


    }


}
