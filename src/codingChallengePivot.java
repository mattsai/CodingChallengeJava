import java.util.Arrays;

/*
Python :
class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        for i,value in enumerate(nums):
            left_sum = sum(nums[:i+1]) - value
            right_sum = sum(nums[i:])  - value
            if left_sum == right_sum : return i
        else:
            return -1

 */
public class codingChallengePivot {
    public static int pivotIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int left_sum = Arrays.stream(Arrays.copyOfRange(nums,0,i+1)).sum() - nums[i];
            int right_sum = Arrays.stream(Arrays.copyOfRange(nums,i,nums.length)).sum() - nums[i] ;
            if (left_sum == right_sum) return i;
        }


        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        nums = new int[] {1,2,3};
        nums = new int[] {2,1,-1};
        int r = pivotIndex(nums);
        System.out.printf("r "+r);
    }


}
