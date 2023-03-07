import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int swap = 0;
        // code for bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swap++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Array is sorted in " + swap + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[size - 1]);
    }
}
