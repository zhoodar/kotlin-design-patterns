## Explanation
**Factory Method** is a creational design pattern that provides an interface for creating objects in superclass, but allow subclasses to alter the type of objects that will be created.

```
    class CarFactory {
        fun createACar(brand: Car.Brand) = when (brand) {
            Car.Brand.BMW -> Bmw()
            Car.Brand.MERCEDES -> Mercedes()
        }
    } 
```

`In plain words`

It provides a way to delegate the instantiation logic to child classes.