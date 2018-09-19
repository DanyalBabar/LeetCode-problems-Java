/*
LeetCode Problem #258

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Runtime: 1ms, 100th percentile
*/
public class Solution {
    public int addDigits(int num) {
        if (num == 0){
            return 0;
        }
        if (num % 9 == 0){
            return 9;
        }
        else {
            return num % 9;
        }
    }
}