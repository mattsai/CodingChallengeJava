import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class infprefandpos {

    static HashMap<String, Integer>  precedence = new HashMap<String, Integer>();
    static Stack<String> stackPrecedence = new Stack<String>();

    public static void loadMap(HashMap<String,Integer> map){
        map.put("*",2);
        map.put("/",2);
        map.put("+",1);
        map.put("-",1);
    }


    public static String converter(String expression){
        String output = "";
        for(char character : expression.toCharArray()){
            String chrStr = String.valueOf(character);
            if(!precedence.containsKey(chrStr)){
                output+=chrStr;
            }else{
                if(!stackPrecedence.empty() && precedence.get(stackPrecedence.peek()) >= precedence.get(chrStr)){
                    output+=stackPrecedence.pop();
                }
                stackPrecedence.add(chrStr);
            }
        }

        while(!stackPrecedence.isEmpty()){
            output+=stackPrecedence.pop();
        }

        return output;
    }

    public static String converterPostPref(String expression, String choice ){
        String output ="";
        Stack<String> tracker = new Stack<>();
        for (char character : expression.toCharArray()) {
            String chrStr = String.valueOf(character);
            if (!precedence.containsKey(chrStr)) {
                tracker.add(chrStr);

            } else {
                //pref
                String first = tracker.pop();
                String second  =tracker.pop();
                String left  = choice == "Pre" ?  first : second;
                String right  = choice == "Pre" ?  second : first;
                output = left + chrStr + right;
                tracker.add(output);
            }
        }

        return tracker.pop();
    }
    public static void main(String[] args) {
        loadMap(precedence);

        String expression = "7-5*4/2";

        StringBuilder expressionReversed = new StringBuilder();
        for (int i = expression.length() - 1; i >= 0; i--) {
            expressionReversed.append(String.valueOf(expression.charAt(i)));
        }

        String post = converter(expression);
        String pref = converter(expressionReversed.toString());

        System.out.println("Expression : " + expression);
        System.out.println("Infija to");
        System.out.println("Posfija: " + post);
        System.out.println("Prefija: " + pref);


        String pref2 = converterPostPref(pref,"Pre");
        String post2 = converterPostPref(post,"Post");
        System.out.println("Pref to inf -> "+pref2);
        System.out.println("Post to inf -> "+post2);

    }
}
