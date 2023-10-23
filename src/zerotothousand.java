public class zerotothousand {

    static String [] UNIDAD = {"","UNO","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE"};

    static  String [] SPECIAL = {"DIEZ","ONCE","DOCE","TRECE","CATORCE","QUINCE","DIECISEIS","DIECISIETE","DIECIOCHO","DIECINUEVE","VEINTE"};
    static  String [] DECENA = {"","","VEINTI","TREINTA","CUARENTA","CINCUENTA","SESENTA","SETENTA","OCHENTA","NOVENTA"};
    static String [] CENTENA = {"","CIEN","DOSCIENTOS","TRESCIENTOS","CUATROSCIENTOS","QUINIENTOS","SEISCIENTOS","SETESCIENTOS","OCHOSCIENTOS","NOVECIENTOS"};

    public static String NumberToString(int n){
        if(n >=1 && n<=9) return UNIDAD[n-1];

        if(n >= 10 && n <= 20){
            return SPECIAL[n-10];
        }else{
            if(n == 1000) return "MIL";
            int unidad = n%10;
            n /=10;
            int decena = n%10;
            n /=10;
            int centena = n%10;

            return CENTENA[centena]+" "+ DECENA[decena]+ ((decena>2 && unidad !=0)  ? " Y " : "") + (unidad == 0 ? "" : UNIDAD[unidad]);
        }
    }
    public static void main(String[] args) {
//        for (int i = 1; i <= 1000;  i ++){
//            String result = NumberToString(i);
//            System.out.println(result);
//        }
        System.out.println(NumberToString(1997));
    }
}