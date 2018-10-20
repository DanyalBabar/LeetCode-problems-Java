/*
LeetCode Problem #905

Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

Runtime: 11ms, 99.50th percentile
*/
class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int[] result = new int[A.length];
        
        int countLeft = 0;
        int countRight = A.length-1;
        
        for(int i = 0; i < A.length; i++){
            
            
            if(A[i] % 2 == 0){
                result[countLeft] = A[i];
                countLeft++;
            }
                
            else{
                result[countRight] = A[i];
                countRight--;
            }
        }   
        
        return result;
    }
}