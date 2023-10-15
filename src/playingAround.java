import java.util.Scanner;

public class playingAround {


    public static void multiply(int number){
        for (int i = 1; i<=10; i++)
            System.out.println(i+" :"+i*number);

    }

    public static void fibb(int n){
        int i = 0;
        int a = 0,b = 1;

        while(i!=n){
            int aux = a;
            System.out.println(a);
            a = a+b;
            b=aux;

            i++;
        }
    }

    public static void whilePositive(){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        while(true){
            number = Integer.parseInt(sc.nextLine());
            if(number<0)
                break;
            sum+=number;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        multiply(8);
//        fibb(10);
//        whilePositive();


    }
}
