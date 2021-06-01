package udemymasterclass;

import java.util.Scanner;

public class MinimumElement {

    private static Scanner sc = new Scanner(System.in);

    private static int readInteger() {
        return sc.nextInt();
    }

    private static int[] readElements(int size) {
        int[] array = new int[size];
        for(int i = 0; i < size; i++) array[i] = sc.nextInt();
        return array;
    }

    private static int findMin(int[] array) {
        int minSoFar = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) minSoFar = Math.min(minSoFar, array[i]);
        return minSoFar;
    }

    public static void main(String[] args) {
        int size = MinimumElement.readInteger();
        int[] array = MinimumElement.readElements(size);
        System.out.println(MinimumElement.findMin(array));
    }

}
