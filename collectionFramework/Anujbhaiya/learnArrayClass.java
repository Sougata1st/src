package collectionFramework.Anujbhaiya;

import java.util.Arrays;
import java.util.Collections;

public class learnArrayClass {
    public static void main(String[] args) {
        Integer[]arr={14,1,28,90,36};
        Arrays.sort(arr,1,3);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        //        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        int index = Arrays.binarySearch(numbers, 4);
//
//        System.out.println("The index of element 4 in the array is " + index);

        Integer[] numbers = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
        Arrays.sort(numbers);

        Arrays.parallelSort(numbers);
        // 8192

        Arrays.fill(numbers, 12);

        for (int i : numbers) {
            System.out.print(i + " ");
        }

    }
}
