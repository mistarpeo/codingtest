import java.util.ArrayList;
import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] arr =  {5, 9, 7, 10};
        int divisor = 5;
        int[] answer = sol.solution(arr, divisor);
        System.out.println(Arrays.toString(answer));
    }
}
class Solution2 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i=0; i < arr.length ; i++) {
            if(arr[i] % divisor == 0) {
                arrayList.add(arr[i]);
            }
        }
        if(arrayList.size() == 0) {
            arrayList.add(-1);
        }
        return arrayList.stream().sorted().mapToInt(i -> i).toArray();
    }
}
