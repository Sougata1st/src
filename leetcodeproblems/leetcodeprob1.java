import java.util.Arrays;

public class leetcodeprob1 {
    //https://leetcode.com/problems/remove-element/submissions/
    public static void main(String[] args) {
        int arr[]={0,1,2,2,3,0,4,2};
        int val=2;
        System.out.println(removeElement(arr,val));
        System.out.println(Arrays.toString(arr));
    }
    public static int removeElement(int[] arr, int val) {
    int i=0,j=0;
    while(i< arr.length&&j<arr.length){
        arr[i]=arr[j];
        if(arr[i]!=val){
            i++;
        }
        j++;
    }
    return i;
    }
}
