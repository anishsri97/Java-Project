import java.util.*;

class treeStructure
{
    String name;
    treeStructure left,right;

    treeStructure(String name,treeStructure tleft,treeStructure tright)
    {
        this.name=name;
        this.left=tleft;
        this.right=tright;
    }

    @Override
    public String toString()
    {
        return "name = " +name+" left = "+left+" right = "+right+"."; 
    }
}