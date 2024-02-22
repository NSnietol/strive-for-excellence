# Automation Script Development

These AI-driven assistants can provide guidance on writing automation scripts, as well as offer best practices and valid examples for the selected automation tools and frameworks.

- Prepare a high-level outline for automated test scripts to test a web app feature based on the given requirements. Write a Java code for one of the scenarios using this outline. (Optional) Analyze the code based on SOLID principles.

    ```
    Act as an Automation Testing Engineer.

    Please design a high-level outline of automated test scenarios for the "user authentication" feature of a web application and indicate which technology/tools/frameworks will be used for automation.

    Include the following:

    Successful user login: Verify a user can log in with a valid email and password using Selenium WebDriver.
    Failed login attempts: Test that user accounts are temporarily locked after multiple incorrect logins using TestNG annotations.
    Consider a web application with the following user authentication requirements:

    User sign-up: Unique email address and password with a minimum length of 8 characters, including at least one uppercase letter, one lowercase letter, and one digit.
    User login: Successful login with a registered email and password and account lockout after three failed login attempts.
    Password reset: Users should receive a time-limited, unique password reset email.
    Format your answer as a bulleted list outlining the main scenarios and sub-scenarios for user sign-up, login, and password reset functionality, and include brief descriptions of the automation tools and frameworks to be used.

    Ensure the outline covers all major scenarios and requirements mentioned before; additionally, consider using the Page Object Model (POM) design pattern to better organize your test scripts.
    ```
    When using ChatGPT to create automated test scenarios, apply the same approach as for general test case development but include a specific Character element from the CREATE framework ("Act as an Automation Testing Engineer" in the given example)
- Prepare API tests to add a new record using Postman and automatically verify the specified criteria.
  

    ```
    Act as a Manual QA with experience in API testing.

    Prepare a script in Postman to test if a new item was added. JSON to add a new record:

    {
    "category": {
        "id": 0,
        "name": "string"
    },
    "name": "doggie",
    "photoUrls": [
        "string"
    ],
    "tags": [
        {
        "id": 0,
        "name": "string"
        }
    ],
    "status": "available"
    }.
    To be checked:

    Request response is 200
    The “id” attribute is present in the response.
    “category”.”name” is equal to ‘lizard’.
    ```
    When writing prompts for requesting a test script, always define the body (JSON or XML from the contract) to be used in the API requests, ensuring it is well-formatted and easy to understand.

- Prepare a Plain Old Java Object (POJO) structure to represent the data used in a new API test.

    ```
    Act as an AQA with experience in API testing in Java. Create POJO from JSON code:

    {
    "category": {
        "id": 0,
        "name": "string"
    },
    "name": "doggie",
    "photoUrls": [
        "string"
    ],
    "tags": [
        {
        "id": 0,
        "name": "string"
        }
    ],
    "status": "available"
    }.
    Use Lombok annotation; additionally, add constructor and builder.
    ```