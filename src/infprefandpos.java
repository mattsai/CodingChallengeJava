import java.awt.List;
import java.lang.reflect.Array;
import java.util.*;

public class infprefandpos {

    static HashMap<String, Integer>  precedence = new HashMap<String, Integer>();
    static Stack<String> stackPrecedence = new Stack<String>();

    public static void loadMap(HashMap<String,Integer> map){
        map.put("*",2);
        map.put("/",2);
        map.put("+",1);
        map.put("-",1);
    }


    public static ArrayList<String> converter(ArrayList<String> expression){
        ArrayList<String> output =  new ArrayList<>();
        for(String chrStr : expression){
            if(!precedence.containsKey(chrStr)){
                output.add(chrStr);
            }else{
                if(!stackPrecedence.empty() && precedence.get(stackPrecedence.peek()) >= precedence.get(chrStr)){
                    output.add(stackPrecedence.pop());
                }
                stackPrecedence.add(chrStr);
            }
        }

        while(!stackPrecedence.isEmpty()){
            output.add(stackPrecedence.pop());
        }

        return output;
    }

    public static String converterPostPref(ArrayList<String> expression, String choice ){
        String output ="";
        Stack<String> tracker = new Stack<>();
        for (String chrStr : expression) {
//            String chrStr = String.valueOf(character);
            if (!precedence.containsKey(chrStr)) {
                tracker.add(chrStr);

            } else {
                //pref
                String first = tracker.pop();
                String second  =tracker.pop();
                String left  = choice == "Pre" ?  first : second;
                String right  = choice == "Pre" ?  second : first;
                output = '(' +left + chrStr + right + ')';
                tracker.add(output);
            }
        }

        return tracker.pop();
    }

    public static String toString(ArrayList<String> expression){
        StringBuilder output = new StringBuilder();
        for(String val : expression){
            output.append(val).append(" ");
        }
        return output.toString();

    }

    public static void main(String[] args) {
        loadMap(precedence);

        String expression = "7 - 5 * 4 / 2";
//        expression = "+ * -100 20 / 4 2";

        ArrayList<String>  expressionArray = new ArrayList<>(Arrays.asList(expression.split(" "))) ;

        ArrayList<String> expressionReversed  = new ArrayList<>();

        for (int left = 0 , i = expressionArray.size() - 1; i >= 0; i--,left++) {
            expressionReversed.add(expressionArray.get(left));
        }

        ArrayList<String> post = converter(expressionArray);
        ArrayList<String> pref = converter(expressionReversed);


        System.out.println("Expression : " + expression);
        System.out.println("Infija to");

        System.out.println("Posfija: " + toString(post));
        System.out.println("Prefija: " + toString(pref));


        String pref2 = converterPostPref(pref,"Pre");
        String post2 = converterPostPref(post,"Post");
        System.out.println("Pref to inf -> "+pref2);
        System.out.println("Post to inf -> "+post2);

    }
}
