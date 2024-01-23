public class Stack {
    private static final int MAX_VALUE = 100;
    public static int top;
    public static int[] arr;
    Stack(){
        top = -1;
        arr = new int[MAX_VALUE];
    }

    void push(int value){
        if(top >= MAX_VALUE-1){
            System.out.println("Stack Overflow...");
        }
        else{
            arr[++top] = value;
        }
    }

    void pop(){
        if(top<0){
            System.out.println("Stack Underflow...");
        }
        else{
            int pop = arr[top--];
            System.out.println("Poped Element: " + pop);
        }
    }

    void printStack() {
        if (top < 0) {
            System.out.println("The stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(0);
        stack.push(2);
        stack.push(3);
        stack.push(30);

        stack.printStack();

        stack.pop();
        stack.pop();
    }
}
