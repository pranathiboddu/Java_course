// package DataStructures;

import java.util.Stack;

public class StackImpl {

    public static void main(String[] args) {
        // Stack stack = new Stack<>();
        // stack.push(12);

        StackEx nums = new StackEx();
        nums.push(15);
        nums.push(8);
        System.out.println(nums.peek());
        nums.push(10);
        nums.pop();
        nums.push(12);
        nums.push(121);
        nums.push(122);
        nums.push(123);

        System.out.println("size is :" +nums.size());
        nums.show();

    }

}

class StackEx {

    int stack[] = new int[5];
    int top = 0;

    public void push(int data) 
    {
        if(top == 5)
        {
            System.out.println("Stack is full");
        }
        else{
        stack[top] = data;
        top++;
        }

    }

    public int pop()
    {
        int data = 0 ;
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            top--;
            data = stack[top];
            stack[top] =0;
        }
        return data;

    }

    public int peek()
    {
        int data ;
        data =stack[top-1];
        return data;

    }

    public int size()
    {
        return top;
    }
    public boolean isEmpty()
    {
        return top<=0;
    }

    public void show() 
    {
        for (int n : stack) {
            System.out.print(n + " ");
        }
    }

}
