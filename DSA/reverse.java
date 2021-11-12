class reverse 
{
   public static void main(String args[])
   {
    String name = "Anish";   
    StringBuffer br = new StringBuffer(name);
    System.out.println(br.charAt(1));
   // br.setCharAt(0, 'k');
    for(int i=0;i<br.length()/2;i++)
    {
        char x = br.charAt(i);
        br.setCharAt(i,br.charAt(br.length()-1-i));
        br.setCharAt(br.length()-1-i,x);
    }
    System.out.println(br.toString());
   }    
}
