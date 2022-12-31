package kunal;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
//        System.out.println("enter the ith no for which you want fibonacci :");
//        System.out.println(fibo(new Scanner(System.in).nextInt()));
//        calldec(0);
//        callassending(0);
        int arr[]={2,3,4,5,6};
        System.out.println(bs(arr,0, arr.length-1,6));
    }
     static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    static void calldec(int n){
        if(n>8){
            return;
        }
        calldec(n+1);
        System.out.println(n);

    }
    static void callassending(int n){
        if(n>9){
            return;
        }
        System.out.println(n);
        callassending(n+1);
    }
    static int bs(int arr[],int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if (arr[mid]<target){
            return bs( arr, start=mid+1, end, target);
        }
        return bs(arr,start,end=mid-1,target);
    }
}
