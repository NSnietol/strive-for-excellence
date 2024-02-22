# Test Case Review
Conversational AI tools like ChatGPT can assist quality engineers in analyzing test cases and identifying potential gaps or inconsistencies that require further revision. Also, they can provide actionable suggestions for improvements to ensure that test cases are well-defined and aligned with the testing objectives.

## Onboarding legacy test cases

- Revise a complex and lengthy test case. Break it down into several test cases and format them accordingly.

    ```
    Hi there.
    Please act as a QA with good decomposition skills.
    Please look at the test case below and suggest how to split this test case and which related ideas might be added.

    Title: Verify Successful Registration and User Account Settings Update on E-commerce Website.
    {{test case body}}
    ```

    After finalizing the strategy, ask the tool to restructure the test case in the specific format (Step 2). Note that the adjustment __"Don't add any new ideas, and don't combine initial steps"__ helps adhere to the chosen structure and achieve the desired output.


- Conduct peer review for a test case.

    ```
    Act as a QA who is doing a test case review.

    Please review the following test case and pinpoint any potential gaps or inconsistencies that need to be improved. Additionally, offer practical recommendations to enhance the clarity and alignment of the test case with the testing objectives.


    Don’t include any ideas on negative scenarios
    ```

- Review the automation code before creating a pull request.
    ```
    Let's now run the code review session. Act as Lead AQA in Java and review the code below:
    {{code snippet}}
    What can be fixed? Take into account Java convention, testing across different environments, etc.

    ```

    Adding the Character element of the CREATE framework to the prompt ("Act as Lead AQA in Java") helps define the level of expertise needed during the code review. Meanwhile, the adjustment "Take into account Java convention, testing across different environments, etc." directly indicates the specific criteria to be reviewed