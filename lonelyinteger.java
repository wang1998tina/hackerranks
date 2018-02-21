import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /* Java implementation of Lonely Integer exercise in
    * Hackerrank.
    * When you take the XOR of two identical numbers it
    * zeroes out, so Xor-ing all the numbers leaves only
    * the lonely integer.
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.print(findUnique(a));
    }
    
    static int findUnique(int [] a){
        int unique = 0;
        for(int i = 0; i<a.length; i++){
            unique ^= a[i];
        }
        return unique;
    }
}