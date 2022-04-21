package 신규아이디추천;

public class CodingTest {
    public static void main(String[] args) {
//        String test = "...!@BaT#*..y.abcdefghijklm";
        String test = 		"=.=";
        System.out.println("input :: "+test);
        Solution sol = new Solution();
        String answer = sol.solution(test);
        System.out.println(answer);
    }
}

class Solution {
    public String solution(String new_id) {
        String answer = new_id;

        //1 대문자 -> 소문자 치환
        System.out.println("1");
        answer = answer.toLowerCase();
        //2 알파벳 소문자, 숫자, 빼기(-), 밑줄(_ ), 마침표(.)를 제외한 모든 문자를 제거
        System.out.println("2");
        String pattern = "[^a-z\\d\\-_.]";
        answer = answer.replaceAll(pattern, "");
        //3 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        System.out.println("3");
        answer = answer.replaceAll("\\.{2,}", ".");
        //4 마침표(.)가 처음이나 끝에 위치한다면 제거
        System.out.println("4");
        answer = answer.replaceAll("^[.]|[.]$", "");
        //5 빈 문자열이라면, new_id에 "a"를 대입
        System.out.println("5");
        answer = answer.length() == 0 ? "a" : answer;
        //6 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        System.out.println("6");
        answer = answer.length() >= 16 ? answer.substring(0, 15) : answer;
        // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        System.out.println("7");
        answer = answer.replaceAll("[.]$", "");
        //7 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입\
        System.out.println("8");
        int idx = answer.length();
        if(idx <= 2) {
            do {
                String add = answer.substring(answer.length()-1);
                answer += add;
            } while (answer.length() < 3);
        }

        return answer;
    }
}

