package 크레인인형뽑기;

import java.util.ArrayList;
import java.util.Arrays;

public class Codingtest {
    public static void main(String[] args) {
        /*
        * {0,0,0,0,0}
        , {0,0,1,0,3},
          {0,2,5,0,1},
          {4,2,4,4,2}
          {3,5,1,3,1}
        * */
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        Solution sol = new Solution();
        int x = sol.solution(board, moves);
    }
}

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i < moves.length; i++){
            int z = moves[i];
            for (int j=0; j < board.length; j++) {
                int val = board[j][z-1];
                if(val != 0) {
                    int idx = list.size();
                    if(idx != 0 && list.get(idx-1) == val) {
                        answer += 2;
                        list.remove(idx-1);
                        board[j][z - 1] = 0;
                        break;
                    } else {
                        list.add(val);
                        board[j][z - 1] = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(list);
        System.out.println(answer);

        return answer;
    }
}
