package kunal;

import java.util.Arrays;

public class BSin2dArrays {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        int target=5;
        System.out.println(Arrays.toString(binarysearch(arr,target)));
    }

    private static int[] binarysearch(int[][] arr, int target) {
        int start=0,end=arr.length-1;
        while (start<arr.length&&end>=0) {
            if (arr[start][end] == target) {
                return new int[]{start, end};
            } else if (target > arr[start][end]) {
                start++;
            } else {
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
