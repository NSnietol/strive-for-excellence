## Testing Pyramid

The testing pyramid is a concept that helps you balance the different types of automated tests you should have in your test suite. It also helps you to decide where to focus your efforts when writing new tests.


- **Unit testing** is at the base of the Testing Pyramid. Tests that run against units of code using synthetic data mitigate code-level risks. The tests should identify:

1. Coding logic issues
2. Calculation errors
3. Loop errors
4. Datatype errors

- **Component testing** checks that functional pieces of your application work in isolation. Each component is deployed into a test environment, and then inputs and outputs are mocked.

1. Functionality issues
2. Precision and rounding errors
3. Missing or wrong default values.

- Whereas component testing focuses on how parts of a particular system function in isolation, contract testing focuses on how different parts of the system communicate with one another. These tests identify:

1. Integration communication errors
2. Control flow errors
3. Data mismatches


- **End-to-end testing** takes the perspective of users. These tests represent how actual users would use the product "in real life." These tests search for:

Use case and business scenario errors
End-to-end errors
Missing functionality
Race conditions

## Adapting the Testing Pyramid

* Testing Pyramid Anti-Patterns: 
Misapplication of the Testing Pyramid is common—so common, in fact, that a couple of Testing Pyramid anti-patterns have emerged: the Testing Ice Cream Cone and the Testing Hourglass.


- Ice cream cone : When devising a testing process, many organizations focus first on manual testing. As their process matures, they may move into some automation for those manual tests. When most of those manual tests are focused at the UI level, you get this anti-pattern. The problem with this approach is that UI tests are the most expensive to write and maintain. If you have too many UI tests, you will spend a lot of time and money on them. You will also have a lot of tests that are brittle and fail often. This will lead to a loss of confidence in your tests and a loss of confidence in your process.
- Testing Hourglass : Some organizations concentrate their testing at the top and bottom levels while neglecting the middle levels. This split can be a result of test automation silos, where developers are responsible for writing unit and component tests, while the QA team focuses on API and UI E2E testing. The problem with this approach is that you are missing out on the benefits of component and contract testing. You are also missing out on the opportunity to catch bugs earlier in the development process.


## Considerations for adapting the Testing Pyramid

- System topology and architecture: you want to consider your system topology and architecture when deciding how to adapt it. For example, if you have a microservices architecture, you will need to focus more on contract testing. A monolithic architecture reduces the number of component and contract interactions, so it follows that architecture will require fewer (or no) component and contract tests.

- Existing commitments and partnership
- Risk
- Talent and skills
- Industry and regulatory requirements
- Organizational culture and goals