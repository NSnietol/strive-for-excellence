# Contract testing 
focuses on how different microservices communicate with one another and ensures they adhere to the contract, it means checking if inter-application messages adhere to a mutual understanding stated in a contract.

## Benefits of contract testing
- **Early detection of issues**: Contract testing helps in detecting issues early in the development cycle.
- Easy maintenance and a clear test writing process.
- Simple debugging and bug-fixing process.
- More opportunities to identify many integration issues at once when providers test fails.


## Contract testing vs Integration testing
Contract testing focuses on integrating two microservices simultaneously. Instead of testing all possible interactions, it tests various component pairs consisting of:

* a consumer application (UI or microservice)
* a provider application or service

While traditional integration testing tries to integrate all microservices at once, which requires a lot of effort as it presents a high load of data.


## Contract testing types
- **Consumer-driven contract testing**: The consumer defines the contract(outlining customer's requirements) and the provider must adhere to it.
- **Provider-driven contract testing**: The provider defines the contract( what is capable of) and the consumer must adhere to it.
- **Bilateral contract testing**: Both the consumer and the provider define the contract and must adhere to it.

## Consumer-Driven Contract Testing
ensures that a provider is compatible with the consumer's expectations.

* For an HTTP API, this includes verifying that the provider accepts the expected requests and that it returns the anticipated responses
* For message queues-using systems, this involves ensuring that the provider produces the expected message

## Bi-directional contract testing
is a type of static contract testing where two contracts—one representing the consumer expectations and another representing the provider capability—are compared to ensure they are compatible. 