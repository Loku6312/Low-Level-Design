package oopsfundamentals.CreationalDesignPatterns.Singleton;

public class Client {

    public static void main(String[] args) {
        EagerSingleton e1 = EagerSingleton.getInstance();
        EagerSingleton e2 = EagerSingleton.getInstance();
        onDemandSingleton o1 = onDemandSingleton.getInstance();
        onDemandSingleton o2 = onDemandSingleton.getInstance();
        DoubleCheckedSingleton d1 = DoubleCheckedSingleton.getInstance();
        DoubleCheckedSingleton d2 = DoubleCheckedSingleton.getInstance();
        CacheManager c1 = CacheManager.INSTANCE;
        CacheManager c2 = CacheManager.INSTANCE;
        System.out.println("Cache Manager Instances:" + (c1 == c2));
        c1.put("user:42", "{name:'Lokesh'}", 5);
        c2.put("config:theme", "dark");
        System.out.println("User 42: " + c1.get("user:42"));
        System.out.println("Theme: " + c2.get("config:theme"));
        System.out.println("Cache Size: " + c1.size());
        System.out.println("Eager Singleton Instances:" + (e1 == e2));
        System.out.println("On-Demand Singleton Instances:" + (o1 == o2));
        System.out.println("Double-Checked Singleton Instances:" + (d1 == d2));
    }

}
