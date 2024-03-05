class Queue{
    int array[];
    int size;
    int rear;

    public Queue()
    {
        this.array=new int[8];
        this.size=8;
    }
    public void enqueue(int v)
    {
        if (rear<this.size-1)
        {
            this.array[rear]=v;
            this.rear++;
        }
        else
        {
            int arr2[]=new int[size*2];
            for(int i=0;i<rear;i++)
            {
                arr2[i]=this.array[i];
            }
            this.array=arr2;
            this.size=size*2;
            array[rear]=v;
            this.rear++;
        }
    }
    public int dequeue()
    {
        int returne=array[0];
        for(int i=0;i<rear;i++)
        {
            array[i]=array[i+1];
            array[i+1]=0;
        }
        this.rear=this.rear-1; 
        return returne;
    }
    public int empty()
    {
        if(this.rear<=-1)
        {
            return 0;
        }
        return 1;
    }
    public int getSize()
    {
        return this.rear ;
    }
}
    public class ex_5_6{
        public static void main(String[]args)
        {
            Queue q =new Queue();
            for(int i=1;i<20;i++)
            {
                q.enqueue(i);
            }
            System.out.println("The Size of the queue is : "+q.getSize());
            System.out.println("\nelements :");
            for(int i=1;i<20;i++)
            {
                System.out.print(q.dequeue()+" ");
            }
            System.out.println(" ");
            System.out.println("The Size of the queue is : "+q.getSize());
            System.out.println("\nAfter deletion:\n"); 
            for(int i=1;i<20;i++)
            {
                System.out.print(q.dequeue()+" ");
            }
        }
    }