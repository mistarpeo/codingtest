package 옹알이;

import java.util.Arrays;
import java.util.List;

public class 옹알이 {
    public static int solution(String[] babbling) {
        int answer = 0;
        List<String> def = Arrays.asList("aya", "ye", "woo", "ma");
        Arrays.stream(babbling).map(x -> x.replaceAll("aya|ye|woo|ma", "")).filter(z -> z.isEmpty()).count()
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        String[] babbling = {"ayaye","uuuma", "ye", "yemawoo", "ayaa"};

        long solution = solution(babbling);
        System.out.println(solution);

    }


}
