import java.util.*;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;

public class PlusOne {
//    ou are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//
//    Increment the large integer by one and return the resulting array of digits.

    public static  int[] plusOne(int[] nums){
        int carry = 1;
        for (int i = nums.length-1; i >=0 ; i--) {
            int sum = nums[i]+=carry;
            int module = sum%10;
            carry = sum/10;
            nums[i] = module;
            if(carry==0) return nums;
        }
        if(carry == 1 ){
            int[] result = new int[nums.length + 1];
            result[0] = carry;
            System.arraycopy(nums, 0, result, 1, nums.length);
            return result;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        int[] res = plusOne(nums);
        System.out.println(Arrays.toString(res));

    }
//        int[] nums1 = {1,2,3,4,5};
////        int[] nums = {1,2,3,4,5};
//        int[] xd = {1,2,3,4,5};
//        int[] nums = {9,8,7,6,5,4,3,2,1,0};
//        System.out.println(nums.toString());
////        String numsString  =  Arrays.toString(nums); //Nope it gives the full "[1,2,3,4,5]"
//        String numsString2 = "";
////        for (int a: nums){
////            numsString+=a;
////        }
//
//        for (int a : nums) {
//            numsString2  += a;
//        }
//
////        System.out.printf("aaa %s %s",numsString,numsString.charAt(0));
//        System.out.println(numsString2);
//        String strin3 = "";
//        String a = Arrays.stream(nums)
//                .mapToObj(value -> {
////                    System.out.println("x" + value);
//                    return String.valueOf(value );
//                })
//                .collect(Collectors.joining());
//
//        String b = Arrays.stream(nums)
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining());
//
//        System.out.println("a " + a);
//        System.out.println("b " + b);
//        int intParset = Integer.parseInt(a)+1; //error here
//        System.out.printf("Integer : %d ",intParset);
//
////        System.out.println(Arrays.asList(intParset));
////        System.out.printf("Integer : %d ",intParset);
//        Integer.toString(intParset).chars().map(x->x-'0').toArray();
//        System.out.println("111 "+Arrays.toString(toArray(intParset)));
//        System.out.println("222 "+toArray2(intParset));
//
//    }
//
//    public static int[] toArray(int  number){
//        return Integer.toString(number).chars().map(Character::getNumericValue).toArray();
////        return Integer.toString(number).chars().map(Character::valueOf).toArray();
////        return Integer.toString(number).chars().map(x->x-'0').toArray();
//
//    }
//    public static List<Integer> toArray2(int  number){
//        return Integer.toString(number).chars().mapToObj(Character::getNumericValue).collect(Collectors.toList());
//    }
}
