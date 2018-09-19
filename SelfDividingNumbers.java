/*
LeetCode Problem #728

A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Runtime: 5ms, 64.50th percentile
*/

class Solution {
    public int reduceSize(int num){
        return((num - (num%10))/10);
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();


        for(int i = left; i <= right; i++){

            boolean selfDiv = true;
            int currNum = i;

            while(currNum > 0){
                if(currNum % 10 == 0){
                    selfDiv = false;
                    break;
                }

                if(i % (currNum%10) == 0){
                    currNum = (currNum - (currNum%10))/10;
                }

                else{
                    selfDiv = false;
                    break;
                }

            }

            if(selfDiv)
                result.add(i);
        }
        return result;
    }
}