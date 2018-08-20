## Explanation
**Facade** is a structural design pattern provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

Facade discusses encapsulating a complex subsystem within a single interface object. This reduces the learning curve necessary to successfully leverage the subsystem. It also promotes decoupling the subsystem from its potentially many clients. On the other hand, if the Facade is the only access point for the subsystem, it will limit the features and flexibility that "power users" may need.

The facade pattern is typically used when

* a simple interface is required to access a complex system,
* a system is very complex or difficult to understand,
* an entry point is needed to each level of layered software, or
* the abstractions and implementations of a subsystem are tightly coupled.