package me.techtab.singleton;

/**
 * Created by Wang, Kunzhen on 13/3/16.
 *
 * This implementation delays the instantiation of the singleton instance until the first time
 * getInstance() is called.
 *
 * It works fine in single-threaded environment. However, when it comes to a multi-threaded environment,
 * it could happen that there are two threads both executing the instantiation line at the same time,
 * thus creating two different instances and destroying the singleton pattern. Please refer to ThreadSafeSingleton
 * for how to tackle this.
 */
public class LazyInstantiationSingleton {
    private static LazyInstantiationSingleton instance;

    private LazyInstantiationSingleton(){}

    public static LazyInstantiationSingleton getInstance(){
        if (instance == null) {
            instance = new LazyInstantiationSingleton();
        }

        return instance;
    }
}
