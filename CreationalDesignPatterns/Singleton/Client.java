package oopsfundamentals.CreationalDesignPatterns.Singleton;

public class Client {

    public static void main(String[] args) {
        EagerSingleton e1 = EagerSingleton.getInstance();
        EagerSingleton e2 = EagerSingleton.getInstance();
        onDemandSingleton o1 = onDemandSingleton.getInstance();
        onDemandSingleton o2 = onDemandSingleton.getInstance();
        DoubleCheckedSingleton d1 = DoubleCheckedSingleton.getInstance();
        DoubleCheckedSingleton d2 = DoubleCheckedSingleton.getInstance();
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(d1);
        System.out.println(d2);
    }

}
