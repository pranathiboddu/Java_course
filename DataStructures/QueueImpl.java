// package DataStructures;

public class QueueImpl 
{
    public static void main(String[] args) 
    {
        QueueEx  values = new QueueEx();

        values.enQueue(12);
        values.enQueue(13);
        values.enQueue(14);
        values.enQueue(15);
        values.enQueue(16);
        values.deQueue();
        values.enQueue(17);

        values.enQueue(18);
        values.enQueue(19);

        System.out.println(values.getSize());

        values.show();

    }
}

class QueueEx
{
    int queue[] = new int[5];
    int front;
    int rear;
    int size;

    public void enQueue(int data)
    {
        if(!isFull())
        {
            queue[rear] = data;
            rear = (rear +1)%5;;
            size = size +1;
        }
        else
        {
            System.out.println("Queue is full");
        }
    }

    public int deQueue()
    {
        int data = queue[front];
        if(!isEmpty())
        {
            front = (front +1)%5;
            size = size-1;
        }
        else{
            System.out.println("Queue is empty");
        }

        return data;
    }
    public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {
       return getSize() ==0; 
    }
    public boolean isFull()
    {
        return  getSize() ==5;
    }
 
    public void show()
    { 
        for(int i=0;i<size;i++)
        {
            System.out.print(queue[(front+i)%5] +" ");
        }
    }
}
