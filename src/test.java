import java.util.ArrayList;
import java.util.Arrays;

public class test {

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);
        int idx = phone_book.length;
        for (int i=0; i < idx; i++) {
            if(i < idx-1) {
                if( phone_book[i].startsWith(phone_book[i+1])) {
                    return false;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] list = {"12", "123", "1235", "567", "88"};
        test t = new test();
        System.out.println(t.solution(list));

    }
}
