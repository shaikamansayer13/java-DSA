import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Queue queue = new Queue(5);
    queue.insert(4);
    queue.insert(5);
    queue.insert(6);
    queue.insert(7);
    queue.insert(8);

    queue.display();
System.out.println();
    queue.remove();

    queue.display();
  }
}

  // Let's create the queue
   class Queue {
    public int[] data;
    private final int default_size = 5;
    int index = 0;

    public Queue(int size) {
      this.data = new int[size];
    }

    public boolean insert(int item) throws Exception {
      if (isFull()) {
        throw new Exception("Queue is Full");
      }
      data[index] = item;
      index++;
      return true;
    }

    public int remove() throws Exception {
      if (isEmpty()) {
        throw new Exception("Queue is Empty");
      }
      int removed = data[0];
      // but we should also shift the elements in the Queue
      for (int i = 1; i < index; i++) {
        data[i - 1] = data[i];
      }
      index--;
      return removed;
    }

    public void display() throws Exception {
      if (isEmpty()) {
        throw new Exception("Queue is Empty");
      }
      for (int i = 0; i < index; i++) {
        System.out.print(data[i] + " <-- ");
      }
      System.out.print("END");
    }

    public boolean isEmpty() {
      return index == 0;
    }

    public boolean isFull() {
      return index == data.length;
    }
  }
