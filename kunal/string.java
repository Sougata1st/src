package kunal;

import java.util.ArrayList;

public class string {
    public static void main(String[] args) {
        String str1="sougata";//inside heap inside stringpool
        String str2="sougata";//inside heap inside stringpool
        System.out.println(str1==str2);//two ref variables pointing towards same obj in the stringpool, so true
        String temp1=new String("raj");//inside heap outside stringpool
        String temp2=new String("raj");//inside heap outside stringpool
        System.out.println(temp1==temp2);//two ref variables pointing towards diff obj which are out of the stringpool, so false
        System.out.println(temp1.equals(temp2));//comparing only values so true
        System.out.println("a"+1);
        System.out.println('a'+1);
        System.out.println((char) ('a'+1));
        System.out.println("sougata"+new ArrayList<>());
        //System.out.println(56+new ArrayList<>());will not work any of them should be string
        System.out.println(45+""+new ArrayList<>()+"");//in java + will work only for premetives and when any value will be string, it will work for complex datatypes also but condition
                                                       // is any of them should be string output will be string
//while addition if one data type is string ans will be string
    }
}
