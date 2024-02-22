# Test Case Creation

Conversation AI tools can help in creating test cases for a given application. They can analyze project requirements and offer recommendations for potential scenarios to test for each specific requirement.

- Prepare an excel template for testing a ne features by different QAs.

    ```
    Act as a Software Testing Engineer.

    I need to have a robust checklist for check-ups based on the specified parameters.

    Please generate a checklist to test NFC on Android mobile devices. The answer must be in a table format with columns: CheckList Item, Assignee, Result.
    ```

- Prepare a checklist matrix for testing a feature on different devices. With a known list of devices, you need to present ideas for feature-specific test scenarios. Additionally, you need to propose a "smoke testing" plan that considers the various devices.

     ```
     Act as a Software Testing Engineer and prepare a template for a checklist matrix for the feature “system supports different payment methods (Visa, Mastercard, PayPal, Google Pay).”

    The system will be delivered as a web application, Android mobile application, and iOS mobile application.

    Include positive ideas only. 
- Prepare a checklist plan for a newcomer to test a story.

    ```
    Act as a Software Testing Engineer.

    Prepare a checklist for testing the story below using EP and BVA techniques.

    Story: A new rule on the price discount on the Checkout step
    The total price is in the range of 0 to 999.99, the discount is 1%
    The total price is in the range of 1000 to 1999.99, the discount is 2%
    If the total price is more than 2000, then the discount is 3%.

    Provide the answer in textual form.
    ```

- Prepare test cases for testing a story using the corresponding project template for a test case.

    ```
    I want you to act as a Software Testing Engineer.
    Please write positive and negative test cases using the test case structure below and according to the business requirements.


    Business requirements:
    As a manager with RMs roles (direct and indirect), I want to have permission to edit Talk with my employees I’ve created.
    So, I will be able to work with Talk several times.

    Acceptance criteria:
    AC1. If a talk was created by the current RM (for direct or indirect employees), the button “Edit” must be active. After the user pushes the button, the chosen talk becomes editable.
    AC2. If another RM created a talk, the “Edit” button must be inactive.
    AC3. If the talk was modified, the modification date must be displayed.

    Preconditions:
    The user with RM role logins to the system.
    Navigate to the employee page of a subordinate.
    Locate the “Talk” section.

    Test Case Structure:
    - Preconditions – Copy the preconditions section.
    - Steps
    - Expected result – Please provide the final expected result only.
    - Priority.

    Use these checklist items and add 3-5 more test cases. Checklist items:
    - Edit own talk of direct employee
    - Edit own talk of indirect employee
    - Attempt to edit talk of direct employee created by another RM
    ```

- Rewrite test cases in a Gherkin format to help the automation team.

    ```
    Act as QA with expertise in BDD. Rewrite the test case below using Gherkin notation. Don’t add any new ideas.
    Test Case 1: Attempt to Edit Talk of Direct Employee Created by Another RM
    
    Preconditions:
    The user is logged in as a manager with the RM role.
    The manager has direct employees assigned to their account.
    Another RM has created a talk for one of the direct employees.

    Steps:
    Navigate to the employee page of the direct employee.
    Locate the "Talk" section.
    Verify that the "Edit" button is inactive.
    Attempt to click on the "Edit" button.
    Expected Result:
    The "Edit" button remains inactive and cannot be clicked as the talk was created by another RM.
    Priority: Medium
    ```

- Prepare test cases for testing a story in a format compatible with the QA Space Jira Test Management System (TMS) or  Zephyr Jira TMS or to import via Jira API.


    ```
    Act as a Manual QA.
    Please prepare test cases for the story below. Include positive, negative cases, and exploratory cases.

    Story:
    As a pet owner,
    I want to be able to schedule grooming appointments for my pet at the hotel, so that my pet can receive on-site grooming services during their stay.

    Acceptance Criteria:
    The application should display the available dates and times for scheduling appointments.
    Provide the answer in a JSON format according to the structure:

    { 
    "summary":<summary>, 
    "Test steps":<steps>, 
    "Expected result":<expected result>, 
    "Priority":<priority> 
    }
    Use a numbering for <steps> (example: "1. Login to the application", "2. Navigate to the grooming section") and <br> as a delimiter between steps.
    ```