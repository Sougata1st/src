package kunal;

public class Time_and_Space_Complexity {
    public static void main(String[] args) {
        printfibo(50);
    }
    static void printfibo(int n){
        for (int i=0; i<=n; i++){
            System.out.println(fiboFormula(i));
        }
    }
    static long fiboFormula(int n){
        return (long) (Math.pow(((1 + Math.sqrt(5))/2), n) / Math.sqrt(5));
    }
}
