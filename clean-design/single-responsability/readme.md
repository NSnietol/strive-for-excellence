## What is the Single Responsibility Principle?

1) A class should be small, and it should have only one reason to change.
2) The source of any axis of change is a user or an actor.
3) High cohesion is a helpful additonal method to identify violations of the SRP.
4) Mixing responsabilities leads to a fragile and highly coupled system.


Criterias to analyze :

* Can the class be described in one sentence?
* Is it fewer than 25 words?
* Does it have zero instances of “if,“ “or,” and “but”?
* Does it have one responsibility?



Responsability is a family of functions that servers one particular actor, an actor for a responsability is the single source of change for that responsability.