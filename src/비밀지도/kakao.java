package 비밀지도;

import java.util.Arrays;

public class kakao {

    public static void main(String[] args) {
//       int n = 5;
//       int[] arr1 = {9, 20, 28, 18, 11};
//       int[] arr2 =	{30, 1, 21, 17, 28};

       int n = 6;
       int[] arr1 = {46, 33, 33 ,22, 31, 50};
       int[] arr2 =	{27 ,56, 19, 14, 14, 10};

       Solution sol = new Solution();
       String[] result = sol.solution(n, arr1, arr2);
       System.out.println(Arrays.toString(result));
    }
}
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i =0 ; i < n ; i++) {
            int i1 = arr1[i] | arr2[i];
            System.out.println(Integer.toBinaryString(i1));
            String x = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(i1)));
            System.out.println(x.length());
            answer[i] = x.replaceAll("1", "#").replaceAll("0", " ");
        }
        return answer;
    }
}
