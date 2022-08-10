
# Open closed principle

Software entities should be open for extension and closed for modification.

Open for extension *means* that the behavior of the module can be extended. As the requiremients changes.

Close for modification *means* extending the behavior of a module does not result in changes to the source ofnthe mdule.

## Anti patterns

* Shotgun Surgery Anti-pattern : A single change to functionality that requires widespread changes in an application.
  
* 
  

“What [the OCP] means is that you should strive to get your code into a position such that, when behavior changes in expected ways, you don't have to make sweeping changes to all the modules of the system. Ideally, you will be able to add the new behavior by adding new code and changing little or no old code.”

— Robert C. Martin, The Clean Code Blog, 2013.



Use an **abstraction** to compose functionality out of existings objects and avoid reworking existing code. Differents ways to create abstractions.

* Extension points, e.g : Virtual methods, Abstract methods, Interface inheritance, Parameter to function, Setter of another class, Higher-order function(Receive or return a another function).
  

* Design patterns.

    - plugin architecture pattern. 
    - Strategy pattern.
    - Template method.


  The main difference between the two patterns is that strategy uses delegation, while template method uses inheritance.
