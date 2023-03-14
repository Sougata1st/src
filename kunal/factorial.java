package kunal;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int fact =1;
        while(a!=0){
            fact=fact*a;
            a--;
        }
        System.out.println(fact);
    }
}
