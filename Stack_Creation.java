import java.util.*;

 class CustomStack {
    public int[] data;
    private static final int default_size = 5;
    int ptr = -1;

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public CustomStack() {
        this(default_size);
    }

    public boolean push(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is Full");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        int popped = data[ptr];
        ptr--;
        return popped;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}

// dynamic stack where we are doubling the size of the stack //
//ek methods ya properties dusri jaga use karra toh extends keyword use kartey apan 
 class Dynamic extends CustomStack {
    public Dynamic() {
        super();
    }

    public Dynamic(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) throws Exception {
        if (isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}

 public class Main {
    public static void main(String[] args) throws Exception {
      //  CustomStack stack = new CustomStack(5);
         //nichey ka size double karra wo isfull ku ovverride karliye apan.
         Dynamic stack = new Dynamic(5);

        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(23);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
