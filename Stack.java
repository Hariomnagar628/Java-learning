public class Stack{
    public static void main(String[] args) {
         
        stack s = new stack();
        s.push(1);
        s.push(3);
        s.push(6);
        s.push(4);
        System.out.println("top of the stak"+s.size());
        System.out.println("size of the stack before deleting "+s.top());
        System.out.println("the elemnt is deleting" +s.pop() );
        System.out.println("top of the stakc"+s.size());
        System.out.println("size of the stack before deleting "+s.top());


    }
}

class stack{
      
    int size = 1000;
    int[] arr = new int[size];

    int top=-1;

    void push(int x)
    {
        top++;
        arr[top] = x;
    }

    int pop()
    {
        int x = arr[top];
        top--;
        return x; 
    }

    int top()
    {
        return arr[top];

    }
    int size()
    {
        return top+1;
    }
}