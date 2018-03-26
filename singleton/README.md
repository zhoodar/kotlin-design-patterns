
## Explanation
Singleton - ensure a class only has one instance, and provide a global point of
access to it.

In Kotlin, the singleton pattern is used as a replacement for static members and fields 
that don’t exist in that programming language. 
A singleton is created by simply declaring an object.

``` 
object AppInstance {
    var value: String = "APP STATE"
}

********************************
val appState = AppInstance.value

```

Contrary to a **class**, an **object** can’t have any constructor,
but init blocks are allowed if some initialization code is needed.
```
object AppInstance {
    init {
        println("init complete")
    }
}

```

The object will be instantiated and its init blocks will be executed 
lazily upon first access, in a thread-safe way. 
To achieve this, a Kotlin object actually relies on a Java static initialization block.