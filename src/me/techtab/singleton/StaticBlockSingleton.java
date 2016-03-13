package me.techtab.singleton;

/**
 * Created by Wang, Kunzhen on 13/3/16.
 *
 * Both static block initialization and eager initialization creates the instance even before the
 * first time getInstance() is called. However, static block instantiation enables exception handling,
 * which is necessary since in most cases singleton instances are created for resources like File Systems.
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instances.");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
