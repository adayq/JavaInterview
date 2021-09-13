package four;

/**
 * @author Lenovo
 */
public class Solution004 {

    public static void main(String[] args) {
        int[] height = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        System.out.println(trap_2(height));
    }

    public static int trap_2(int[] height) {
        if (height == null) {
            return 0;
        }
        int rst = 0, leftMax = 0, rightMax = 0, len = height.length;
        int i = 0, j = len - 1;
        while (i < len) {
            // 从左向右不断求最大值，向右平铺面积值
            leftMax = Math.max(leftMax, height[i]);
            // 从右向左不断求最大值，向左平铺面积值
            rightMax = Math.max(rightMax, height[j - i]);
            // 顺带减去原数组的面积值
            rst += leftMax + rightMax - height[i++];
        }
        // 最后减去平铺后最高点与数组长度组成的矩形面积就是雨水面积
        return rst - len * leftMax;
    }
}
