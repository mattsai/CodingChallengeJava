package oop;

public class main extends U{
    public static void main(String[] args) {
        U user =  new U();
        user.age = 18;
        user.something = "something";
        user.doSomething();

        main mainUser = new main();
        mainUser.doSomething();
        mainUser.setSomethingPrivate("Something");

        EnumThing a = EnumThing.GOOD;
        System.out.println(a.name()); //returns the value as a string


    }

    @Override
    public  void doSomething(){
        System.out.println("Im Main");
    }
}
