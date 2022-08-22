# Boundary


Is a layer that separates two code parts and know about both of them while the code parts become agnostic to each other. Usually plays a role of and adapter between two layers or code parts.



## Undesirable Dependencies.


- Code depends on Configuration or Environment: Configuration—or configuration code—is highly volatile, so stable logic should not depend on it.

-  Code depends on Unclean, unchangeable or legacy code : These called elements can violate Clean Code principles, propagating the violation to the code.

- Code depends on Data Structure : When using an API, you become dependent on a data structure, which is usually more volatile than the business logic.