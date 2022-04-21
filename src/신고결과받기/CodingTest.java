package 신고결과받기;

import java.util.*;

public class CodingTest {
    public static void main(String[] args) {
        String[] id_list = new String[]{"muzi", "frodo", "apeach", "neo"};
//        String[] report = new String[]{"muzi frodo", "apeach frodo","muzi neo",  "frodo neo", "muzi apeach", "apeach muzi"};
        String[] report = new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};

        int k = 2;
        Solution solution = new Solution();
        int[] dk = solution.solution(id_list, report, k);
        System.out.println(Arrays.toString(dk));

    }
}
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        //1 중복제거
        HashSet<String> reportSet = new HashSet<>();
        for (String x : report) reportSet.add(x);

        //2
        HashMap<String, ArrayList<String>> notifyList = new HashMap<>();
        for (String x : reportSet) {
            String reportee = x.split(" ")[1];
            String reporter = x.split(" ")[0];
            ArrayList<String> reportList = notifyList.getOrDefault(reportee, null);
            if(reportList == null) reportList = new ArrayList<>();

            reportList.add(reporter);
            notifyList.put(reportee, reportList);
        }

        //3
        HashMap<String, Integer> reporterList = new HashMap<>();
        for(ArrayList<String> reporters : notifyList.values()) {
            if( reporters.size() >= k) {
                for (String reporter: reporters) {
                    reporterList.put(reporter , reporterList.getOrDefault(reporter, 0) + 1);
                }
            }
        }
        //4
        int idx = id_list.length;
        for(int i=0; i < idx ; i++) {
            answer[i] = reporterList.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}
