import java.util.ArrayList;

public class Queue
{
    ArrayList<Integer> arr;
    public int maxSize;
    public int cnt;


    public Queue(int m)
    {
        arr = new ArrayList<>();
        maxSize = m;
        cnt = 0;
    }


    public Queue()
    {
        arr = new ArrayList<>();
        cnt = 0;
        maxSize = 0;
    }


    public void push(int n)
    {
        if (this.maxSize > this.cnt || this.maxSize == 0) {
            arr.add(n);
            cnt += 1;
        } else {
            System.out.println("The queue is full!");
        }
    }


    public void pop()
    {
        if (this.cnt == 0) {
            System.out.println("Underflow!");
        } else {
            arr.remove(0);
            cnt -= 1 ;
        }
    }


    public void isEmpty()
    {
        if (cnt == 0)
        {
            System.out.println("The queue is empty!");
        }
    }


    public void isFull()
    {
        if ( maxSize==0 )
        {
            System.out.println("can never be full!");
        }

        else if ( cnt==maxSize )
        {
            System.out.println("FULL QUEUE!");
        }

        else
            {
            System.out.println("Available Space: " + (maxSize - cnt));
        }
    }

    public ArrayList<Integer> showQueue()
    {
        return arr;
    }
}