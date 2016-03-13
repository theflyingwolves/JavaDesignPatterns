package me.techtab.singleton;

/**
 * Created by Wang, Kunzhen on 13/3/16.
 *
 * Adding a synchronized keyword can bring thread safety. The problem is where to add it.
 * If we add it to the method signature, it works but it's inefficient. The reason is that
 * such check is only necessary for the first time. Therefore, we use the Double Checked locking
 * principle to give the following implementation.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getInstance(){
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }
}