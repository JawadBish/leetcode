package Easy;

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisorStrings {

    public static String gcdOfStrings(String str1, String str2) {
         if(!(str1+str2).equals(str2+str1)) return "";
         int gcdval=gcd(str1.length(),str2.length());
         return str2.substring(0,gcdval);
     }

    public static int gcd(int x,int y){
        if(y==0) return x;
        else return gcd(y,x%y);
    }


    public static void main(String[] args) {
        String str1 = "ABCABCD";
        String str2 = "ABCD";
        System.out.print(gcdOfStrings(str1,str2));
    }
}
