import java.util.ArrayList;
public class Node
{
    private ArrayList<Integer> myValue=new ArrayList<Integer>();
    private Node next;    
    /*** Constructor for objects of class Node */
    public Node()
    {
        // set default values
        next = null;
    }
    public Node(ArrayList x)
    {
        myValue = x;
        next = null;
    }    
    public void setNext(Node n)
    {
        next = n;
    }
    public Node getNext()
    {    
        return next;
    }
    public void fill(int n)
    {
        myValue.add(n);
    }
    public ArrayList<Integer> getList()
    {
        return myValue;
    }
    public void empty()
    {
        for(int i=0;i<myValue.size();i++)
        {
            myValue.remove(0);
        }
    }
}
