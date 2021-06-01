package udemymasterclass;

import java.util.Scanner;

public class SortedArray {

    private static Scanner sc = new Scanner(System.in);

    public static int[] getIntegers(int size) {
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            int x = sc.nextInt();
            array[i] = x;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) System.out.println("Element " + i + " contents " + array[i]);
    }

    public static int[] sortIntegers(int[] array){
        int[] newArray = new int[array.length];
        for(int i = 0; i < array.length; i++) newArray[i] = array[i];

        boolean flag = true;
        while(flag) {
            flag = false;
            for(int i = 0; i < newArray.length - 1; i++) {
                if(newArray[i] < newArray[i+1]){
                    flag = true;
                    int temp = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = temp;
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args){
        int[] array = SortedArray.getIntegers(5);
        int[] newArray = SortedArray.sortIntegers(array);
        SortedArray.printArray(newArray);
    }

}
