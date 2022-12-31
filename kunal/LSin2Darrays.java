package kunal;

import java.util.Arrays;

public class LSin2Darrays {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        System.out.println(Arrays.toString(search(arr,6)));
    }
     static int [] search(int[][] arr, int x){
        int temp[]=new int[2];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]==x){
                    temp[0]=i;
                    temp[1]=j;
                }
            }

        }
        return temp;
    }
}
