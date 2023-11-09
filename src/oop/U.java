package oop;

public class U {

    public enum EnumThing{
        TODAY,
        IS,
        A,
        GOOD,
        DAY
    }

    //same instance class or by inherit
    protected String something;

    //by getters an setters
    private String somethingPrivate;

    //default same package
    String name ;
    public int publicInt = 0 ;
    int age;
    //Overload

    public  void doSomething(){
        System.out.println("Im U class");
    }

    public static int add(int a , int b){
        System.out.println("The sum "+a+" "+b+ " : "+a+b);
        return a+b;
    }

    public static double add(double a, double b){
        System.out.println("The sum of double "+a +" "+b + " : "+a+b);
        return a+b;
    }

    public static void main(String[] args) {
        add(3,4);
        add(3.4,5.5);

    }

    public String getSomethingPrivate() {
        return somethingPrivate;
    }

    public void setSomethingPrivate(String somethingPrivate) {
        this.somethingPrivate = somethingPrivate;
    }
}
