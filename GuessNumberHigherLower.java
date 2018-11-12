/*
LeetCode Problem #374

We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

Runtime: 0ms, 100th percentile
*/


/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); 
*/

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        if (n == 1)
            return n;
        
        int mid = n/2;
        int left = 1;
        int right = n;
        int curr;
        
        boolean done = false;
        
        while(!done){
            
            curr = (guess(mid));
            
            if(curr == 1)
                left = mid + 1;
            else if (curr == -1)
                right = mid - 1;
            else
                return mid;
            
            mid = left + (right - left) / 2;
            
        }
    
        return n;
    }   
}