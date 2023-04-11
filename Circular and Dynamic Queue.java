
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    CircularQueue queue = new CircularQueue(5);
   
    DynamicQueue queue = new DynamicQueue(4);
    
    queue.insert(4);
    queue.insert(5);
    queue.insert(6);
    queue.insert(7);
    queue.insert(8);

    queue.display();

    System.out.println(queue.remove());
    queue.insert(133);
    queue.display();
  }
}

class CircularQueue {
  public int[] data;
  private final int default_size = 5;
  int front = 0;
  int end = 0;
  int size = 0;

  public CircularQueue(int sizee) {
    this.data = new int[sizee];
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return size == data.length;
  }

  public boolean insert(int item) throws Exception {
    if (isFull()) {
      throw new Exception("Queue is Full");
    }
    data[end++] = item;
    end = end % data.length;
    size++;
    return true;
  }

  public int remove() throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is Empty");
    }
    int removed = data[front++];
    front = front % data.length;
    size--;
    return removed;
  }

  public int front() throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is Empty");
    }
    return data[front];
  }

  public void display() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return;
    }
    int i = front;
    do {
      System.out.print(data[i] + "<--");
      i++;
      i = i % data.length;
    } while (i != end);
    System.out.print("END");
    System.out.println();
  }
}

class DynamicQueue extends CircularQueue {
  public DynamicQueue(int sizee) {
    super(sizee);
  }

  @Override
  public boolean insert(int item) throws Exception {
    if (isFull()) {
      int[] temp = new int[data.length * 2];
      // copy the elements in the ARRAY
      for (int i = 0; i < data.length; i++) {
        temp[i] = data[(front + i) % data.length];
      }
      front = 0;
      end = data.length;
      data = temp;
    }
    return super.insert(item);
  }
}
