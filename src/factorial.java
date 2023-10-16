import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        // 5*4*3**2*1
        Scanner sc = new Scanner(System.in);

        int opcion = 1;
        while(opcion!=0){
            System.out.println("Numero para factorial");
            int numero = sc.nextInt();
            int factorial = 1 ;
            while(numero!=1){
                factorial *= numero;
                numero--;
            }
            System.out.println(factorial);
            System.out.println("0 para salir 1 para continuar");
            opcion = sc.nextInt();
        }
        System.out.println("Gracias por nada ");
    }
}
