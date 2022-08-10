# Tell, Don't Ask Principle

Relies on a basic object-oriented foundation: to delegatean action to an object instead of asking for data.

Data encapsulated by a class should be the responsability of its class instead of being passed to another class to process it.

There are **two major ways** you can identify potential violations of the Tell, Don’t Ask Principle: check if there is any data exposure or whether there are signs of the anemic domain model.


## Data exposure

* Exposing data from objects to other classes for alteration.
* Violates the SRP
* Causes Maintenance complexity
  


## Anemic Domian Model

Is an entity that is open to provide its state to callers instead of performing the operation on itself.



