/*
LeetCode Problem #476

Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:
1. The given integer is guaranteed to fit within the range of a 32-bit signed integer.
2. You could assume no leading zero bit in the integer’s binary representation.

Runtime: 9ms, 29.13th percentile
*/

class Solution {
    public int findComplement(int num) {
        int newNum = 0;
        boolean firstRec = false;

        for(int i = 32; i >= 0; i--){
            if((num- (Math.pow(2,i))) >= 0){
                num -= Math.pow(2,i);
                firstRec = true;
            }
            else if(firstRec)
                newNum+= Math.pow(2,i);
        }

        return newNum;
    }
}
