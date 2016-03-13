#Java Design Patterns

This is a repository created for recording some useful Java design pattern implementation for references.
Major work and references are due to the book **Java Design Patterns: A Programmer's Approach** by **Pankaj Kumar**.

1. Singleton Pattern
    *Eager Initialization
        This approach is used when the singleton class is not using a lot of resources. However, in practice, singleton
        classes are created for resources such as File Systems and Database connections. In this case, instantiation of
        singleton instances should be delayed until the first time getInstance() is called.
    *Static Block Singleton
        Compared to Eager initialization, static block singleton enables exception handling, which is essential considering
        that singleton classes are usually created for resources like File Systems.
    *Lazy Instantiation
        This implementation delays the instantiation of the singleton instance until the first time getInstance() is called.
        It works fine in single-threaded environment. However, when it comes to a multi-threaded environment, it could
        happen that there are two threads both executing the instantiation line at the same time, thus creating two
        different instances and destroying the singleton pattern.
    *Thread Safe Singleton
        Adding a synchronized keyword can bring thread safety. The problem is where to add it.
        If we add it to the method signature, it works but it's inefficient. The reason is that
        such check is only necessary for the first time. Therefore, we use the **Double Checked Locking**
        principle to give the following implementation.