package 다트게임;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodingTest {
    public static void main(String[] args) {
//        1 1S2D*3T	    37	11 * 2 + 22 * 2 + 33
//        2	1D2S#10S	9	12 + 21 * (-1) + 101
//        3	1D2S0T	    3	12 + 21 + 03
//        4	1S*2T*3S	23	11 * 2 * 2 + 23 * 2 + 31
//        5	1D#2S*3S	5	12 * (-1) * 2 + 21 * 2 + 31
//        6	1T2D3D#	    -4	13 + 22 + 32 * (-1)
//        7	1D2S3T*	    59	12 + 21 * 2 + 33 * 2
        String dartResult = "1S2D*3T";
//        String dartResult = "1D2S#10S";

        Solution sol = new Solution();
        int result = sol.solution(dartResult);
        System.out.println(result);
    }
}

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] dartResultArray = dartResult.split("");
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        StringBuilder third = new StringBuilder();
        return answer;
    }
}
