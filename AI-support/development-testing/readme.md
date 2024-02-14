# New Test Creation
## Best practices

- Use a code coverage tool to identify untested code paths.
- Inspect and refine the tests to ensure they are testing the correct behavior.

## Creating Unit Tests
    
Include a request to create test cases and unit tests based on these cases in your prompt. This allows you to validate the test cases and decide which are required based on the application's business logic.


    ```markdown
    Create a set of test cases to ensure the code below is thoroughly tested, considering that the code implements {{brief description of the code}}. Then, generate unit tests for these cases in {{programming language}} and {{testing framework}}. To this code snippet:
    {{the code snippet}}
    ```

## When using AI inline tools to generate unit tests, keep in mind the following:

- it's best to combine different approaches to solve the problem.
- Provide context, without knowledge of what is being tested, Copilot will produce tests that may not be relevant to the code.
- Code logic, the AI inline tries to comprehend the the logic
- AI inline tools does not understand the business logic, so it's important to provide context to the code.

## Test maintenance

    ```markdown
    I have updated my function code to include new functionality. Please update the test cases and unit tests to cover the changes in the function. Ensure that the updated test cases and unit tests follow the provided code style and conventions.
    The update function code and previous test cases are as follow. Explain what was updated and why
    Function code:
    {{the updated code snippet}}
    Previous test cases:
    {{the previous test cases}}
    ```



## New Test Data Generation

- Control the randomness by explicitly set constrains and boundaries for the data generation.
- Use domain-specific terminology to generate the data.

    ```markdown
    Generate {{data format}} to create an array of {{array length}} objects in the following model:
    {{the model}}

    ```


## Updating existing test data

    ```markdown
    I have updated my data model to a new version. Please update my existing test data according to the new model. The updated data model and exiting test data are as follow: Explain what was updated and why
    Updated data model:
    {{the updated data model}}
    Existing test data:
    {{the existing test data}}

    
    ```

    