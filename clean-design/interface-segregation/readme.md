# Interface segregation

Client should not be forced to depend on method tht they do not use. It means that interfaces should be designed with a client's needs in mind.


The goal of the ISP is to reduce the effects and regularity of changes, which you accomplish by developing thin interfaces and splitting sofware into independent parts.



## Ensure the principle

- Ensure a Class implements all methods of an interface :  Any classes that implement the interface should implement all properties or methods without any NotImplementedExceptions or other workarounds.
  

- Make interfaces Cohesive : Means they contain groups of operations that logically belong together.
  
- Divide and combine fat interfaces.