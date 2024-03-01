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
        if (rear<this.size)
        {
            this.array[rear]=v;
            this.rear=rear++;
        }
        else
        {
            int arr2[]=new int[size*2];
            for(int i=0;i<rear;i++)
            {
                array[i]=arr2[i];
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
        for(int i=0;i<=rear;i++)
        {
            array[i]=array[i+1];
            array[i+1]=0;
        }
        this.rear=this.rear-1; 
        return returne;
    }
    public int empty()
    {
        if(this.rear>=-1)
        {
            return 0;
        }
        return 0;
    }
    public int getSize()
    {
        return this.rear ;
    }
}