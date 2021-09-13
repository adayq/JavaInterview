package four;

/**
 * @author Lenovo
 */
public class Solution003 {

    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7,8};
        System.out.println(rotate(ints,3));
        //System.out.println(rotate1(ints,3));
        System.out.println(8%7);
    }

    static int[] rotate(int[] nums, int k) {
        int lengthOld = nums.length;
        for (;;){
            if (k > lengthOld){
                k = k-lengthOld;
            }else {
                break;
            }
        }
        int tempArray[] = new int[lengthOld];
        for(int a = 0 ;a <lengthOld ; a ++){
            int temp = lengthOld - k + a;
            tempArray[a] = nums[temp%lengthOld];
        }
        for(int a = 0 ;a <lengthOld ; a ++){
            nums[a] = tempArray[a];
        }

        return nums;
    }
    static int[] rotate1(int nums[], int k) {
        int length = nums.length;
        int temp[] = new int[length];
        //把原数组值放到一个临时数组中，
        for (int i = 0; i < length; i++) {
            temp[i] = nums[i];
        }
        //然后在把临时数组的值重新放到原数组，并且往右移动k位
        for (int i = 1; i <= length; i++) {
            nums[(i + k) % length] = temp[i];
        }
        return nums;
    }

}
