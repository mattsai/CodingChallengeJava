import java.util.HashMap;
import java.util.HashSet;

public class unique {
    public static int unique(int lista[]){
        int ans = 0 ;
        HashMap<Integer,Integer> x =  new HashMap<>();

        for(int value  : lista){
            int val =  x.getOrDefault(value,0)+1;
            x.put(value,val);
            if(val==1) ans = value;
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] lista = {4, 3, 2, 4, 3,2,9};
        int ans = unique(lista);
        System.out.println(ans);
    }
}
