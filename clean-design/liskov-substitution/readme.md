# Liskov Substitution Principle
“Subtypes must be substitutable for their base types.”

Even if a new object can fulfill the IS-A relationship with an old object, it does not always mean that the new object's class should be derived from the old object’s class.

The LSP focuses on “IS SUBSTITUTABLE FOR A” rather than “IS A.”



## Child classes must not:

- remove behavior of the parent class.
- violate invariants of the parent class.
- require verification of them being different from their base type.

# Rules

- The subtype method can throw fewer or narrower (but not any additional or broader) exceptions than the supertype method.
- all subtype methods (inherited and new) must maintain or strengthen the supertype's class invariants.
- subclass methods (inherited or new) shouldn't allow state changes that the base class didn't allow.
-  A subtype can weaken (but not strengthen) the precondition for a method it overrides
-  The subtype can strengthen (but not weaken) the postcondition for a method it overrides.


# Fixing LSP Violations
To deal with LSP violations, follow these tips.

- Avoid objects interrogating their internals. Instead, move that behavior into the object—or possibly extract the object—that has the state and the behavior collected together.
-  Tell the object what you want it to do

When you have two classes that share a lot of behavior but are not substitutable( for instance one subtype not being able to fullfil one public method):

- Create a third base class that both existing classes can derive from
Ensure substitutability between each of the existing class and the new base class