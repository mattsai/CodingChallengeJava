import java.util.ArrayList;
import java.util.Arrays;

public class lengthlastword {
    public int lengthOfLastWord(String s) {

        return  0;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";

        s  =s.trim();

        int c = 0;
        for(int i = s.length()-1; i>=0 ; i--){
            if(s.charAt(i) != ' '){
                c+=1;
            }else{
                break;
            }
        }
//        return c
//        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList(word.split(" ")));
//        return stringArray.get(stringArray.size()-1).length();

//        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList(word.split(" ")));
//        for (int i = stringArray.size() -1 ; i>=0 ; i--){
//            String element = stringArray.get(i);
//            if(!element.isEmpty()) {
//                System.out.println(element.length());
//                break;
//            }
//        }

    }
}
