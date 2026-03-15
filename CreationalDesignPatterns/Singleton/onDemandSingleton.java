package oopsfundamentals.CreationalDesignPatterns.Singleton;

public class onDemandSingleton {

    private onDemandSingleton() {

    }

    private static class SingletonHolder {

        private static final onDemandSingleton instance = new onDemandSingleton();
    }

    public static onDemandSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
