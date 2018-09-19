/*
LeetCode Problem #412

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
For numbers which are multiples of both three and five output “FizzBuzz”.

Runtime: 2ms, 99.77th percentile
*/
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> outputList = new ArrayList<String>();

        for (int i = 1; i<=n; i++){
            if((i%3 == 0) && (i%5 ==     0))
                outputList.add("FizzBuzz");
            else if (i%3 == 0)
                outputList.add("Fizz");
            else if (i%5 == 0)
                outputList.add("Buzz");
            else
                outputList.add("" + i);
        }

        return outputList;
    }
}