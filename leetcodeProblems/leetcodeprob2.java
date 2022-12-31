package leetcodeProblems;

public class leetcodeprob2 {
    //number of chars in last part of the string
    public static void main(String[] args) {
    String str=" sougata  kar";
        int count=0;
        str=str.trim();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count =0;
            }
            else {
                count++;
            }
        }
        System.out.println(count);
    }
}
