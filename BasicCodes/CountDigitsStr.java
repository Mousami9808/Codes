// Q1 You are given a string S. Count the number of occurrences of all the digits in the string S.

[Reference ] (https://www.geeksforgeeks.org/convert-string-to-integer-without-using-any-in-built-functions/)


import java.util.*;

class TestClass {

    public static void main(String args[] ) throws Exception {
          
        Scanner o = new Scanner(System.in);
        String s = o.nextLine();
        char[] res = s.toCharArray();                 
        Map<Character,Integer> hm = new TreeMap<>();
        int[] array = new int[10];
        for(int i=0;i<s.length();i++){
            array[(int)(s.charAt(i)-48)]++;
          
        }

        for(int j=0;j<10;j++){
             System.out.println(j+" "+array[j]);
        }
    
    }

    public void tests2(){
    	System.out.println("Hi");
    }
}
