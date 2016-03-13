package me.techtab.singleton;

/**
 * Created by Wang, Kunzhen on 13/3/16.
 *
 * This approach is used when the singleton class is not using a lot of resources.
 *
 * However, in practice, me.techtab.singleton classes are created for resources such as File Systems
 * and Database connections. In this case, instantiation of me.techtab.singleton instances should
 * be delayed until the first time getInstance is called.
 */
public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization(){

    }

    public static EagerInitialization getInstance(){
        return instance;
    }
}
