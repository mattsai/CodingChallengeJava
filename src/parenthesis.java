import java.util.HashMap;
import java.util.Stack;

public class parenthesis {
    public static boolean isValid(String s) {
        HashMap<Character,Character> par = new HashMap<>();
        par.put(')','(');
        par.put('}','{');
        par.put(']','[');

        Stack<Character> myStack = new Stack<>();
        for(char c : s.toCharArray()){
            if(par.containsKey(c)  && !myStack.isEmpty() ){
                if(par.get(c) != myStack.pop()) return false;
            }else{
                myStack.add(c);
            }
        }

        if(!myStack.isEmpty())return false;

        return true;
    }

    public static void main(String[] args) {
        String case1 = "()()";
        Boolean tf = isValid(case1);
        System.out.println(tf);
    }

}
