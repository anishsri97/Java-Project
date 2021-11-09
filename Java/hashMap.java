import java.util.*;

class hashMap
{
    public static void main(String args[])
    {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Anish",1);
        map.put("rahul",2);
        map.put("rakesh",3);
        map.put("rakesh",5);
        map.put("Animesh",8);

        for(String key:map.keySet())
        {
            System.out.println(key+" -> "+map.get(key));
        }
    }
}