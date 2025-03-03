package four;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 */
public class Solution001 {

    static int removeDuplicates(int[] nums) {
        int left = nums[0];
        int right = nums[0];
        int temp = 1;
        for (int a = 0; a < nums.length; a++) {
            right = nums[a];
            if (left < right) {
                left = right;
                nums[temp] = left;
                temp ++;
            }

        }
        return temp;
    }

    public static void main(String[] args) {
        int[] temp =  {1,1,2};
        System.out.println(removeDuplicates(temp));
    }
}
