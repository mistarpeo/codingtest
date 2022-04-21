import java.util.HashMap;

public class CodingTest {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "one4seveneight";
        int r = sol.solution(s);
        System.out.println(r);
    }
}
class Solution {
    public int solution(String s) {
        int answer = 0;
        HashMap<String, String> numberAlphabet = new HashMap<>();
        numberAlphabet.put("zero", "0");
        numberAlphabet.put("one", "1");
        numberAlphabet.put("two", "2");
        numberAlphabet.put("three","3");
        numberAlphabet.put("four", "4");
        numberAlphabet.put("five", "5");
        numberAlphabet.put("six", "6");
        numberAlphabet.put("seven", "7");
        numberAlphabet.put("eight", "8");
        numberAlphabet.put("nine", "9");

        for(String key : numberAlphabet.keySet()) {
          s = s.replace(key, numberAlphabet.get(key));
        }
        return Integer.parseInt(s);
    }
}
