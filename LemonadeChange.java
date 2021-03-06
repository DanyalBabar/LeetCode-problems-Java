/*
LeetCode Problem #860

At a lemonade stand, each lemonade costs $5. 

Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).

Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.  You must provide the correct 
change to each customer, so that the net transaction is that the customer pays $5.

Note that you don't have any change in hand at first.

Return true if and only if you can provide every customer with correct change.


Runtime: 4ms, 100.00th percentile
*/
class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int fives = 0;
        int tens = 0;
        
        for(int i = 0; i < bills.length; i++){
            
            if(bills[i] == 5)
                fives++;
            
            else if(bills[i] == 10){
                if(fives - 1  >= 0){
                    fives--;
                    tens++;
                }
                
                else{
                    
                    return false;
                }
            }
            
            else{
                if((fives - 1 >= 0) && (tens - 1 >= 0)){
                    fives--;
                    tens--;
                }
                
                else if (fives - 3 >= 0){
                    fives -= 3;
                }
                else{
                    return false;
                }
            }
            
        }
        
        return true;
    }
}