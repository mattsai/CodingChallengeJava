import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class intersection {
//    public static List<Integer> encontrarInterseccion(int[] l1 , int[] l2){
//        List<Integer> ans  =  new ArrayList<>();
//        HashSet<Integer> setA = new HashSet<>();
//        Arrays.sort(l1);
//        Arrays.sort(l2);
//
//        int li = 0, lj= 0 ;
//
//        while(li < l1.length && lj < l2.length){
//            int firstValue = l1[li];
//            int secondValue = l2[lj];
//            if( firstValue == secondValue){
//                setA.add(firstValue);
//                li+=1;
//                lj+=1;
//            }else if(firstValue < secondValue){
//                li+=1;
//
//            }else{
//                lj+=1;
//            }
//        }
//        return List.copyOf(setA);
//
//    }
    public static List<Integer> encontrarInterseccion(int[] l1 , int[] l2){
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        ArrayList<Integer> lr =  new ArrayList<>();
        for(int x : l1)
            s1.add(x);

        for(int x : l2)
            if(s1.contains(x))
                lr.add(x);


        return lr;
    }
    public static void main(String[] args) {

        // Entrada
        int[] lista1 = {1, 2, 2, 1,};
        int[] lista2 = {2, 2};
        lista1 = new int[]{1, 2, 3, 4, 5, 8, 9};
        lista2  = new int[]{1,19,4};

// Salida
        List<Integer> interseccion = encontrarInterseccion(lista1, lista2);
        System.out.println(interseccion);
//        for(int v : interseccion){
//            System.out.println(v);
//        }
// interseccion = [2]

    }
}
