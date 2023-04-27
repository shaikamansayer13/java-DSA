import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20};
        subseq(arr, new ArrayList<>());
    }

    public static void subseq(int[] arr, ArrayList<Integer> brr) {
        if (arr.length == 0) {
            System.out.println(brr); // print the ArrayList directly
            return;
        }
        int num = arr[0];
        subseq(Arrays.copyOfRange(arr, 1, arr.length), brr);
        ArrayList<Integer> newBrr = new ArrayList<>(brr);
        newBrr.add(num);
        subseq(Arrays.copyOfRange(arr, 1, arr.length), newBrr);
    }
}


