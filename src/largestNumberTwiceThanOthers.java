/*
*  Largest Number At Least Twice of Others
You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

 */
import java.util.*;
public class largestNumberTwiceThanOthers {

    public int dominantIndex(int[] nums) {
        int[] copyList = Arrays.copyOf(nums,nums.length);

        int maxNumber = Arrays.stream(nums).max().getAsInt();
        Arrays.sort(nums);
        // System.out.println("maxNumber "+maxNumber+" "+nums[nums.length-2]);
        if(maxNumber >= 2*nums[nums.length-2]){
            for (int i = 0; i < copyList.length; i++) {
                if(copyList[i] == maxNumber){
                    // System.out.println("Indice -> "+i);
                    return i;
                }
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int[] nums = {5,1,2,3,8,1};
        int[] copyList = Arrays.copyOf(nums,nums.length);

        int maxNumber = Arrays.stream(nums).max().getAsInt();
        Arrays.sort(nums);
        System.out.println("maxNumber "+maxNumber+" "+nums[nums.length-2]);
        if(maxNumber >= 2*nums[nums.length-2]){
            for (int i = 0; i < copyList.length; i++) {
                if(copyList[i] == maxNumber){
                    System.out.println("Indice -> "+i);
                }
            }
        }


//        Collections.sort(nums);

    }

}
