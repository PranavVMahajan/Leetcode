class CustomStack {
    int stack[];
    int operation[];
    int capacity;
    int size;
    int index;
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        operation = new int[maxSize];
        capacity = maxSize;
        size = 0;
        index = -1;
    }
    
    public void push(int x) {
        if(isFull()) {
            return ;
        }
        index++;
        size++;
        stack[index] = x;
    }
    
    public int pop() {
        if(isEmpty()) {
            return -1;
        }
        int val = stack[index];
        val += operation[index];
        if(index > 0) {
            operation[index-1] += operation[index]; 
        }
        operation[index] = 0;
        index--;
        size--;
        return val; 
    }
    
    public void increment(int k, int val) {
        if(isEmpty()) {
            return;
        }
        int num = Math.min(size,k);
        operation[num-1] += val;
        // for(int i=0;i<num;i++) {
        //     stack[i] += val;
        // } 
    }
    private boolean isFull() {
        return (size == capacity);
    }
    private boolean isEmpty() {
        return (size == 0);
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */