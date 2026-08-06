class myStack {
private int capacity;
private int top;
private int[] arr;
    public myStack(int n) {
        // Define Data Structures
         capacity=n;
         top=-1;
         arr=new int[capacity];
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return top==-1;
    }

    public boolean isFull() {
        // check if the stack is full
        return top==capacity-1;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(top==capacity-1){
            System.out.println("Overflow");
            return;
        }
        arr[++top]=x;
          //  System.out.println(arr[top]);
        
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(top==-1){
           // System.out.println("Since stack is empty, nothing is popped");
           return;
        }
       int v= arr[top--];
        peek();
      // System.out.println(arr[top--]);
    }

    public int peek() {
        // Returns the top element of the stack
        if(top==-1){
            return -1;
        }
        return arr[top];
    }
}
