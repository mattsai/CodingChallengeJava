import java.util.Arrays;

public class isAnagram {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1,t1);
        // if(s1.length > t1.length || s1.length < t1.length) return false;
        // int i  = 0 ;
        // for(char x : s1){
        //     if(x!=t1[i])return false;
        //     i+=1;
        // }
        // return true;




        // HashMap<Character,Integer> counter= new HashMap<>();
        // for(char x :  s.toCharArray() ){
        //     if(counter.containsKey(x)){
        //         counter.put(x,counter.get(x)+1);
        //     }else{
        //         counter.put(x,1);
        //     }
        // }
        // for(char x : t.toCharArray()){
        //     if(!counter.containsKey(x)) return false;
        //     counter.put(x,counter.get(x)-1);
        // }

        // for(Map.Entry<Character,Integer> entry : counter.entrySet()){
        //     char key = entry.getKey();
        //     int  value = entry.getValue();
        //     if(value >0 ) return false;
        // }
        // return true;
    }
}
