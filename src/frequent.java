import java.lang.reflect.Array;
import java.util.*;
import java.util.HashMap;

public class frequent {
//    Get the element appears most frequently in one array.[1,2,1,3,55, 4, 1, 2, 3, 4, 1, 2, 3]
    public static int frequent(int [] elements){
        int ans = -1;
        HashMap<Integer,Integer> counter = new HashMap<>();

        //counting
        for(int element : elements){
            if(counter.containsKey((element))){
                counter.put(element,counter.get(element)+1);
            }else{
                counter.put(element,1);
            }
        }

        //check values
        for(Map.Entry<Integer,Integer> entry : counter.entrySet()){
            int value = entry.getValue();
            int key = entry.getKey();
            if(value > ans) ans = key;
        }

        return ans;
    }

//    Write a method to find the longest common prefix string amongst an array of strings.
//    If there is no common prefix, return an empty string "".
//
//    Example 1:
//    Input: strs = {"oracle","oral","orange"}
//    Output: "ora"

    public static String commonPrefix(String[] strs){
        String ans = "";
        int length = 999999 ;
        //oracle
        //oral
        //orange

        for(String word : strs){
            if(word.length()<length) length = word.length();
        }

        for (int i = 0; i < length; i++) {
            char letter = strs[0].charAt(i);
            for(String word : strs){
                if(word.charAt(i)!=letter) return ans;
                ans += String.valueOf(letter);
            }
        }

        return ans;
    }


    // view - table
    //Table A, Table B and Table C

    // view  <data>  A,B,C
    //


//    Can you write a SQL to get the employee with the 5th high salaries.
//    employee table has the following columns:
//    employee_id
//    employee_name
//    salaries

//    Select employee_name from employee
//    order_by salaries
//    limit 5;

    // Thing A -> Trigger - Thing B
    public static void main(String[] args) {


    }

}
