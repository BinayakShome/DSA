package StackAndQueues.Part1;

public class Queue {
    static int front = -1;
    static int end = -1;
    static int capacity = 10;

    static void enqueue(int []queue, int value)
    {
        if (end == capacity - 1)
        {
            System.out.println("Queue overflow");
            return;
        }

        if (front == -1 && end == -1) {
            front = end = 0;
        } else {
            end++;
        }
        queue[end] = value;
    }

    static void dequeue(int []queue)
    {
        if (front == -1 || front > end) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Dequeued: " + queue[front]);
        front++;
    }
    static void display(int []queue)
    {
        if (front == -1 || front > end)
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements");
        for (int i = front; i <= end; i++)
        {
            System.out.println(queue[i]);
        }
    }
    public static void main(String []args)
    {
        int[] queue = new int[capacity];
        enqueue(queue, 10);
        enqueue(queue, 20);
        enqueue(queue, 30);
        display(queue);

        dequeue(queue);
        display(queue);

        enqueue(queue, 40);
        display(queue);
    }
}
