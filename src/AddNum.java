import java.util.*;

public class AddNum {

    public int[] twoSum(int[] nums, int target) {
        ArrayList<String> sd = new ArrayList<>();
        int idx = nums.length;
        int[] li = new int[2];
        for(int i=0; i < idx ;i++) {
            int x = i;
            for(int j=0; j< idx-1; j++) {
                int y = j+1;
                System.out.println(x+"/"+y);
                if(x != y){
                    if((nums[x] + nums[y]) == target) {
                        li[0] = x;
                        li[1] = y;
                        return li;
                    }
                }

            }

        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int target = 10;
        AddNum addNum = new AddNum();
        int[] x = addNum.twoSum(nums, target);
        System.out.println(Arrays.toString(x));

    }



}
