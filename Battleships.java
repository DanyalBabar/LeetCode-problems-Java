/*
LeetCode Problem #419
Given an 2D board, count how many battleships are in it. The battleships are represented with 'X's, empty slots are
represented with '.'s. You may assume the following rules:
• You receive a valid board, made of only battleships or empty slots.
• Battleships can only be placed horizontally or vertically. In other words, they can only be made of the shape 1xN
 (1 row, N columns) or Nx1 (N rows, 1 column), where N can be of any size.
• At least one horizontal or vertical cell separates between two battleships - there are no adjacent battleships.

Runtime: 4ms, 15.12th percentile
*/
class Solution {

    public int i = 0;
    public int j = 0;

    public void findShip(char[][] board){
        boolean done = false;
        if(j < board[0].length-1){
            if(board[i][j+1] == 'X'){
                done = true;
                for (int o = j+1; o < board[0].length; o++){
                    if(board[i][o] == ('X'))
                        board[i][o] = '0';
                    else{
                        j = o;
                        break;
                    }
                }
            }
        }
        if((i < board.length-1) && (done == false)){
            if(board[i+1][j] == 'X'){
                for (int o = i+1; o < board.length; o++){
                    if(board[o][j] == ('X'))
                        board[o][j] = '0';
                    else{
                        //if(j < board.length)
                        j += 1;
                        break;
                    }
                }
            }
        }
    }

    public int countBattleships(char[][] board) {
        int ships = 0;

        for(i = 0; i < board.length; i++){
            for(j = 0; j < board[0].length; j++){
                if(board[i][j] == 'X'){
                    board[i][j] = '0';
                    ships++;
                    findShip(board);

                   /* System.out.println("\ni: " + i + " j: " + j);
                    for(int x = 0; x<board.length; x++){
                        System.out.println();
                        for(int y = 0; y<board[0].length; y++){
                            System.out.print(board[x][y]);
                        }
                    }*/
                }
            }
        }
        return ships;
    }
}
