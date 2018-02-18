#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

/* For Algorithms/Maximising XOR challenge.
* I wrote a solution in Java as well. C was more time intensive as there's
* no easy function to find leading zeroes.
*/
int findLeadingZeros(int xor);

int maximizingXor(int l, int r) {
    
    int xor = l ^ r;
    int shift = findLeadingZeros(xor);
    int num = (1<< shift) -1;
    
    return num;
    
    
}

int findLeadingZeros(int xor){

    if(xor<0){ xor = 0;}  //for signed nums
    
    int shifts = 0;
    while(xor!=0){
        xor = xor >> 1; 
        shifts++;
    }
    return shifts;
}

int main() {
    int l; 
    scanf("%i", &l);
    int r; 
    scanf("%i", &r);
    int result = maximizingXor(l, r);
    printf("%d\n", result);
    return 0;
}