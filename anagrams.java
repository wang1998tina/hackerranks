import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* Calculates total number of character deletions in a string
* in order for the modified strings to become anagrams
* (same letters but order does not matter). 
* I use two frequency arrays, and delete extra characters.
*/

public class Solution {
    public static int numberNeeded(String first, String second) {
        char [] firstC = new char[26];
        char [] secondC = new char[26];
        int deleteF = 0;
        int deleteS = 0;

        //count freq of chars in first string
        for(int i = 0; i<first.length();i++){
            char c = first.charAt(i);
            firstC[c-97] += 1;
        }
        //count freq of chars in second
        for(int i = 0; i<second.length();i++){
            char c = second.charAt(i);
            secondC[c-97] += 1;
        }

        //compare frequencies
        for(int i = 0; i<26; i++){
            if(firstC[i] > secondC[i]){
                deleteF += (firstC[i]-secondC[i]);
            } else if (secondC[i]>firstC[i]){
                deleteS += (secondC[i]-firstC[i]);
            }       
        }

        return deleteS + deleteF;
        
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}