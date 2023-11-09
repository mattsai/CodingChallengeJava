import java.util.*;

// "static void main" must be defined in a public class.
public class ArraysDynamic {
    static void print(List<Integer> anArray ){
        for (int value  : anArray)
            System.out.println(value);
    }

    public static void main(String[] args) {

        //Vectores = arrays : estatica ; fixed
        int[] nums = new int[5];
        nums[0] =  1;
        nums[1] =  2;
        nums[2] =  3;
        nums[3] =  4;
        nums[4] =  5;

        for (int i = 0 ;  i< nums.length ; i++){
            System.out.println(nums[i]);
        }

        //0-4

        //Arraylist : dinamico
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        nums2.add(4);
        nums2.add(5);


        for (int i = 0 ;  i< nums2.size() ; i++){
            System.out.println("Arraylist indice: "+i+" = "+nums2.get(i));
        }

//        Arrays.stream()

















        // 1. initialize
//        List<Integer> v0 = new ArrayList<>();
//        List<Integer> v1;                           // v1 == null
//        // 2. cast an array to a vector
//        Integer[] a = {0, 1, 2, 3, 4};
//        int[] a2 = {0, 1, 2, 3, 4};
//        v1 = new ArrayList<>(Arrays.asList(a));
//
//        List<Integer> v2 = v1; //This is a reference to v1 so if u change v2 v1 will be affected :D
//
//        System.out.println(v1.getClass());
//
//        //Needs to be the same type of  int, Integer¿? lol
//        Integer[] b = Arrays.copyOf(a,a.length);
//        int[] b2 = Arrays.copyOf(a2,a2.length);
//
//        //Iterating v1 vector
//        //for(int value : v1) System.out.println(value);
//        //System.out.println(v1.getClass());
//        //for (int i = 0; i < v1.size(); i++)  System.out.println(v1.get(i));
//        print(v1);
//        //v2[0] = 99; this can't be done in vectors
//        v2.set(0,99); //this will change i0 to 99
//        System.out.println("V1 -> [0]"+v1.get(0));
//
//        System.out.println("Sorting... v2 affecting v1");
//        Collections.sort(v2);
//        print(v1);
//
//        System.out.println("Adding");
//        v1.add(2); //last
//        v1.add(v1.size()-1,3); //last
//        v1.add(0,123); //top
//        print(v1);


    }
}