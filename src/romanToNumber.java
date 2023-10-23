import java.util.HashMap;

public class romanToNumber {

    public static void main(String[] args) {
        String roman  = "MCMXCV";
        HashMap<Character,Integer> romanHash = new HashMap<>();

        romanHash.put('I',1);
        romanHash.put('V',5);
        romanHash.put('X',10);
        romanHash.put('L',50);
        romanHash.put('C',100);
        romanHash.put('D',500);
        romanHash.put('M',1000);
        int acum = 0 ;
        for(int i = 0; i<roman.length() ; i++){
            if (i<roman.length()-1 && romanHash.get(roman.charAt(i))<romanHash.get(roman.charAt(i+1))){
                acum-=romanHash.get(roman.charAt(i));
            }else{
                acum+=romanHash.get(roman.charAt(i));
            }
        }
        System.out.println("acum "+acum);



//        romanHash.put("I",1);
//        romanHash.put("IV",4);
//        romanHash.put("V",5);
//        romanHash.put("X",10);
//        romanHash.put("IX",9);
//        romanHash.put("XL",40);
//        romanHash.put("L",50);
//        romanHash.put("XC",90);
//        romanHash.put("C",100);
//        romanHash.put("CD",400);
//        romanHash.put("D",500);
//        romanHash.put("CM",900);
//        romanHash.put("M",1000);
//        int acum = 0;
//        roman = "MCMXCVII";
//        int l = roman.length();
//
//        int i = 0;
//        while(i<l){
//            String llave = String.valueOf(roman.charAt(i));
//            if(i <= l -2){
//                String twoLetters = String.valueOf(llave+roman.charAt(i+1));
//                if(romanHash.containsKey(twoLetters)){
//                    acum += romanHash.get(twoLetters);
//                    i+=1;
//                }else{
//                   acum += romanHash.get(llave);
//                }
//            }else{
//                acum += romanHash.get(llave);
//            }
//            i+=1;
//        }
//
//        for (int i = 0; i  < l ; i++) {
//            String llave = String.valueOf(roman.charAt(i));
//
//            if(i <= l -2){
//                String twoLetters = String.valueOf(llave+roman.charAt(i+1));
//                if(romanHash.containsKey(twoLetters)){
//                    acum += romanHash.get(twoLetters);
//                    i+=1;
//                }else{
//                   acum += romanHash.get(llave);
//                }
//            }else{
//                acum += romanHash.get(llave);
//            }
//
//        }

        System.out.println("El valor es "+acum);
    }
}
