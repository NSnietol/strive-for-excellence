# Testing foundations: Test doubles
A test double is a general term for naming simplified equivalents of the actual objects in testing.

### Types of Test Doubles
Test doubles are divided into five types: mock, stub, spy, fake, and dummy. The type you use will depend on your goal.

- **Dummy** objects are passed around but never actually used. Usually they are just used to fill parameter lists.
- **Test stub** are objects that provide predefined answers to method calls. Usually, they are used to replace real objects that would make the test too complicated or slow.
- **Test spy** are objects that record what happens during a test. They can be used with stubs to record the parameters passed to stubbed methods. They are stubs that can store metadata about how they were called.
- **Mock** is an object that registers the requests it expects to receive. The tests will fail if the request and format do not match the expectations of a mock.

- **Fake** typically behaves the same way as the item it replaces, but in a limited context. For example, an in-memory implementation of a database.



### Mock

A mock is used when it's not easy to verify if the interactions between the dependency and the tested system worked as expected. You can use a mock to ensure a correct message is sent to the dependency.

### Stub 
A stub is a hardcoded object with a predefined and controlled behavior. The objective is to place the system under test in a particular state to observe how it reacts. For instance, if you are developing a test for a some code that interacts with a API, you want to use a stub of the Rest API that always provides a scripted response.


### Fake
Is an object with a complete working implementation, but it bypasses some behaviors of a faked application. Typically, a fake is used when it's too impractical to use the real thing in a test environment. For example, a fake database implementation that stores data in memory instead of a real database.