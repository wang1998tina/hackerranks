import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*For the Algorithms/Maximizing XOR challenge. 
* I wrote a C version as well.
*/

public class Solution {

    static int maximizingXor(int l, int r) {
        int xor = l ^ r;
        int shift = 32 - Integer.numberOfLeadingZeros(xor);
        int num = (1 << shift) -1;
        
        return num;
        
  
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int result = maximizingXor(l, r);
        System.out.println(result);
        in.close();
    }

}