# Law of Demeter (LoD)

The Principle of Least Knowledge, is a set of object-oriented programming rules that puts restrictioons on interactions between program modules.


The LoD helps you to avoid a major problem that can arise when you try to create a chaining method: a knot of dependecies. This can be avoid by:

    - Hidding information
    - Controlling access
    - Minimizing coupling

"Talk to friends only" as they say.

## Level of functions.


Function F of an object O may only call functions of the next objects:

O itself
F’s parameters
Any object instantiated within F
O’s direct components objects
Global variables accessible by O in the scope of F


Exceptions to the Law

- Data Structures : This law is only applicable to objects, data structures such as Dao's can't be judge using this principle.

- A chain of function call on the same object : _the creational pattern_ "builder" with chain methods invocations can be considered an exception.
- Extraction of Objects from data containers : extracing data from List,Set or any other container shouldn't be considered a violation.



## The Essence of the Law of Demeter

The Law of Demeter is not about eliminating chaining methods; it is about restricting the number of interactions between non-related units to implement low coupling.