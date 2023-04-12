import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args){
        int test_array[] = {2,3,3,4,5,1,3,7,8,3};

        System.out.println(Arrays.toString(RemoveEl(test_array, 3)));
    }

    public static int[] RemoveEl(int[] nums, int val){
        int offset = 0;
        for (int i =0;i< nums.length;i++){
            if (nums[i]==val){
                offset++;
            }else {
                nums[i-offset] = nums[i];
            }
        }
        return Arrays.copyOf(nums, nums.length-offset);
    }
}
