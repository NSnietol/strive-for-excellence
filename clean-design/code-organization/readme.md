# Organization of classes and modules


There may be different reasons for you to group classes together.

- Classes are part of one feature and serve the same idea.
- Classes do something specific in a similar way, so it is logical to group them together.
- Classes are intended to work with the same third-party code.


## Effective code organization.

- Readability : Easy to read for many but no for just ones.
- Modularity : is a key characteristic of organized code, and it is also connected to dependencies between modules.
- Reusability : leads to increased productivity and better code quality.


Ask questions that help you design classes and modules effectively, including questions about grouping, splitting, and placement.


## Package by Layer vs. Package by Feature
 
 ##  Package by Layer 
 Group classes in modules by layers. You can think about your application from an architectural standpoint. For example, you can have a UI layer, the Network layer, the Database layer, the Services layer, and the Model layer.

* advantages 

It is simple and easy to understand.
It enables you to change the data access mechanism because everything is in one place.
It is simpler to test each layer in isolation from other layers.

* Downsides

 The cohesion inside each module is usually low, while the coupling between items is high. As a result, the strategy seems to be the opposite of what you want to achieve through effective code organization.


 ### Package by Feature

 which reflects a feature set. According to this strategy, you place all items related to a single feature in a single module.


 * Upsides

    Higher Modularity—The package by feature strategy results in modules with high cohesion, high modularity, and low coupling.

    Code Navigation—With this strategy, you place everything related to a change request or bug fix in the same directory. As a result, software engineers spend less time searching for items.

    Growth Potential—If a component grows too large, you can refactor and split it into two separate modules naturally.

 * Downsides

   Unspecified Feature Size is a critical disadvantage, and separation of features might not be as apparent in practice as you expect it to be