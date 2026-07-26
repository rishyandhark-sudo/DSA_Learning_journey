class myStack {
Node top;
int count;
    public myStack() {
        // Initialize your data members
        top=null;
        count=0;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return top==null;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node temp=new Node(x);
        temp.next=top;
        top=temp;
        count++;
    }

    public void pop() {
        // Removes the front element of the stack.
        if(top == null){
            return ;
        }
        top=top.next;
        count--;
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(top == null){
            return -1;
        }
        return top.data;
    }

    public int size() {
        // Returns the current size of the stack.
        return count;
    }
}
