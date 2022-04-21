public class test3 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();

    }
}
class Solution3 {
    public long solution(long n) {
        long answer = 0;
        long x = (long) Math.sqrt(n);
        if (Math.pow(x, 2) == n) {
            return (long)Math.pow(x + 1, 2);
        } else {
            return -1;
        }
    }
}
