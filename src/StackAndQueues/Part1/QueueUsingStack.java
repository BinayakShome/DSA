package StackAndQueues.Part1;

import java.util.Stack;

public class QueueUsingStack {
    public static void main(String []args)
    {
        queue q = new queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.size());
        System.out.println(q.peek());
        q.dequeue();
        System.out.println(q.peek());
    }

    static class queue
    {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();

        void enqueue(int x)
        {
            input.push(x);
        }

        int dequeue()
        {
            if (output.empty())
                while (input.empty() == false) {
                    output.push(input.peek());
                    input.pop();
                }

            int x = output.peek();
            output.pop();
            return x;
        }

        int size()
        {
            return input.size()+ output.size();
        }

        int peek()
        {
            if (output.empty())
                while (input.empty() == false) {
                    output.push(input.peek());
                    input.pop();
                }
            return output.peek();
        }
    }
}
