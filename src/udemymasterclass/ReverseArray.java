package udemymasterclass;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array) {
        System.out.print("Array = " + Arrays.toString(array));
        int first = 0, last = array.length - 1;
        while (first < last) {
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }
        System.out.print("\nReversed array = " + Arrays.toString(array));
        return;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ReverseArray.reverse(array);
    }

}
