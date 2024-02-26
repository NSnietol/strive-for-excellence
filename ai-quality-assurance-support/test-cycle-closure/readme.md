# Leveraging Generative AI Tools for Efficient Test Cycle Closure


Generative AI can support software testing engineers in test cycle closure by assisting in the following processes:

Evaluating cycle completion criteria
Test metrics preparation
Documenting learnings
Test closure report preparation
Test result analysis
Deliverable preparation


## Evaluating Cycle Completion Criteria
- Analyze all the necessary factors to determine if the test cycle is complete.

    ```
    Act as a QA Lead. I need to determine if our test cycle is complete. Which factors, such as time, test coverage, cost, software quality, critical business objectives, and overall product quality, should we analyze to do it?
    ```
    Example 2 with data:

    ```
    Act as a QA Lead. Let's analyze the factors to determine if our test cycle is complete using the following data from the project:

    Time:
    Planned testing duration: 4 weeks
    Actual testing duration: 6 weeks and 2 days
    Test Coverage:
    Total number of functionalities: 50
    Number of functionalities covered by test cases: 45
    Software Quality:
    Total number of defects found: 120
    Number of high-priority defects: 10
    Number of medium-priority defects: 60
    Number of low-priority defects: 50
    Critical Business Objectives:
    Total number of critical business objectives: 10
    Number of critical business objectives met: 9
    Overall Product Quality:
    Test case pass rate: 92%
    Test case fail rate: 8%
    Defect resolution time (average): 3 days
    Please determine if our test cycle is complete by analyzing factors such as time, test coverage (project SLA is > 95%), software quality, critical business objectives, and overall product quality based on the provided data.

    Do not repeat initial data (like "Planned testing duration: 4 weeks") in the response; provide only analysis and recommendations.
    ```

## Test Metrics Preparation
- ### Identify the most relevant test metrics for your project.
    ```
    As a QA Lead, I need to identify the most relevant test metrics for our project. Please provide a list of key test metrics that we should consider based on factors such as test coverage, defect density, and test execution efficiency.

    Don't include subjective metrics (like Customer Satisfaction)
    ```

## Documenting Learnings
- ### Identify and document the lessons learned in the testing process.

    ```
    Can you help me identify and document the lessons learned throughout our testing process and suggest recommendations for future improvements to refine our testing strategy as a QA Lead?

    ```

## Test Closure Report Preparation
- ### Prepare a test closure report for the current test cycle.

    ```
    As a QA Lead, I need to prepare a test closure report for the current test cycle. Please provide a detailed test closure report template that includes sections such as objectives, scope, test summary, defect summary, and recommendations for future testing cycles.

    ```
    Example 2 with data:

    ```
    Please act as a lead QA and prepare the Test Result Report section about bugs found in the release. Report sections:

    Summary. Prepare 2-5 sentences with overall results.
    Metrics. Include only these metrics as separate subsections:
    bug density by priority,
    bug density by severity,
    open vs. resolved,
    found by team vs. found by business users,
    bug density per requirement.
    Use a table format for the metrics above (for example, bug density by priority: priority, number of bugs, percentage, BugIDs).

    Conclusion. Suggest if the release is ready for production or should be delayed. Add explanation.

    Prepare the report in the Word format. Add the table with all the bugs in Appendix A.

    Please provide results by section/subsection. If I type "continue," provide the next section.


    Raw Data on bugs found in the release:

    Bug ID|Bug Summary|Priority|Severity|State|Link to Requirement|Environment|Reporter
    BUG-001|Unable to add item to cart from product page|High|Critical|Resolved|REQ_002|Chrome 91.0.4472.124 on Windows 10|John Doe
    BUG-002|Incorrect discount applied to order during checkout|High|Major|Open|REQ_006|Safari 14.1.1 on macOS 11.4|Jane Smith
    BUG-003|Search results not displaying all relevant items|Medium|Minor|In Progress|REQ_001|Firefox 89.0.2 on Ubuntu 20.04|John Doe
    BUG-004|Payment confirmation screen displaying incorrect order total|High|Critical|Open|REQ_004|Chrome 91.0.4472.124 on Android 11|Jane Smith
    BUG-005|Login page not loading for users with slow internet connection|Low|Minor|Resolved||Internet Explorer 11 on Windows 7|Business user
    BUG-006|Order confirmation email not being sent to customer|High|Major|In Progress|REQ_005|Gmail on Chrome 91.0.4472.124 on Windows 10|Jane Smith
    BUG-007|Images not displaying correctly on product detail page|Medium|Minor|Open|REQ_001|Safari 14.1.1 on iOS 14.6|John Doe
    BUG-008|Incorrect billing address displayed on order confirmation screen|High|Major|Resolved|REQ_004|Firefox 89.0.2 on Ubuntu 20.04|Jane Smith
    BUG-009|Inconsistent display of item availability on search results page|Medium|Minor|In Progress|REQ_007|Chrome 91.0.4472.124 on macOS 11.4|John Doe
    BUG-010|Unable to apply discount code during checkout|High|Critical|Resolved|REQ_006|Edge 91.0.864.48 on Windows 10|Jane Smith
    BUG-011|Order history page displaying incorrect order information|Medium|Major|Resolved|REQ_005|Safari 14.1.1 on iOS 14.6|John Doe
    BUG-012|Incorrect tax rate applied to order during checkout|High|Major|Cancelled|REQ_004|Chrome 91.0.4472.124 on Windows 10|Jane Smith
    BUG-013|Search bar not functioning correctly on mobile devices|Medium|Minor|In Progress|REQ_001|Firefox 89.0.2 on Android 11|Business user
    BUG-014|Unable to view product images on hover in product listing page|Low|Minor|Resolved|REQ_007|Chrome 91.0.4472.124 on macOS 11.4|Jane Smith
    BUG-015|Incorrect shipping address displayed on order confirmation screen|High|Major|Open|REQ_004|Safari 14.1.1 on iOS 14.6|John Doe
    BUG-016|Unable to view product description on mobile devices|Low|Minor|Resolved|REQ_001|Chrome 91.0.4472.124 on Android 11|Business user
    BUG-017|Discount not applied to order during checkout for logged-in users|Medium|Major|In Progress|REQ_006|Firefox 89.0.2 on Ubuntu|Jane Smith
    ```

## Test Result Analysis
- ### Analyze testing results and suggest relevant test metrics.
    
    ```
    Act as a lead QA. I received the following results after testing an application. Please analyze them and suggest relevant test metrics.

    List of issues
    # Summary Priority Severity Status
    1 Incorrect type for Sign request High High Resolved
    2 Incorrect sub-status High High Open
    3 Reports should display T instead of C Medium High Resolved
    4 Incorrect KEY _Name in the response Medium Medium In Progress
    5 Wrong order of sub statuses Medium Low Resolved
    6 Incorrect calculation Medium Medium Resolved
    7 Incorrect transcript type High High Resolved
    8 FORM_TYPE = "T" instead of "C" Medium Medium Resolved
    Test Cases
    Test Category Total Test Cases Passed Failed Blocked Not Run
    Functionality 50 40 2 0 8
    Performance 20 20 0 0 0
    Usability 15 12 1 2 0
    Compatibility 10 0 2 4 4
    Security 5 5 0 0 0
    ```

## Deliverable Preparation
- ### As a test manager, you need to establish a test sign-off template that will be used across teams.

    ```
    Please act as a Test Manager. You need to suggest a template for the test sign-off document for the application. The focus must be feature testing, not the list of test cases. Also, add information about defects (overall status, defects per story, etc.)

    Use Confluence markdown for the answer.

    Some contexts about the system:

    The application consists of a back-end and a front-end, and each of them has its own backlog. Performance testing is run on a separate environment.
    ```