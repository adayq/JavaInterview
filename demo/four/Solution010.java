package four;

public class Solution010 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3};
        System.out.println(singleNumber(nums));
    }

        static int singleNumber(int[] nums) {
            int reduce = 0;
            for (int num : nums) {
                reduce =  reduce ^ num;
            }
            return reduce;
        }

}
