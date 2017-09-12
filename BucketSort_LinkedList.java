import java.util.ArrayList;
public class BucketSort_LinkedList
{
    // GLOBAL declaration
    static Node buckets[] = new Node[10];

    public static void main()
    {
    
        for (int i=0; i<buckets.length; i++)
        {
            buckets[i] = new Node();
        }
        for(int i=0;i<buckets.length-1;i++)
        {
            buckets[i].setNext(buckets[i+1]);
        }
        int exp=0;
        int place;
        int [] a ={105,87142,95,12987120,7194,9};
        int max=a[0];
        int r=0;
        ArrayList<Integer>reader=new ArrayList<Integer>();
        Node current=buckets[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
        
        while((int)Math.pow(10,exp)<max)
        {
            exp++;
        }
        
        for(int i=0;i<=exp;i++)//goes through exp
        {
            for(int j=0;j<a.length;j++)
            {
                if(i!=0)
                {
                    place=a[j]%(int)Math.pow(10,i+1)/(int)Math.pow(10,i);
                    buckets[place].fill(a[j]);
                }
                else
                {
                    place=a[j]%10;
                    buckets[place].fill(a[j]);
                }
            }
            for(r = 0; r<a.length;)//copies things back into array
            {                
                reader=current.getList();
                for(int s=0;s<reader.size();s++)
                {
                    a[r]=reader.get(s);
                    r++;
                }
                if(current.getNext()!=null)
                current=current.getNext();
                
            }
            current=buckets[0];;
            for(int e=0;i<buckets.length;i++)
            {
                buckets[e].empty();
            }
        }
        for(int tr=a.length-1;tr>=0;tr--)
        {
            System.out.println(a[tr]);
        }

    }


} 
