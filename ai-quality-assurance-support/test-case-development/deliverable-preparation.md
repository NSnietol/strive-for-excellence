# Deliverable Preparation
Conversational AI tools can help quality engineers organize and present deliverables, such as test cases, automation scripts, and test data, to ensure clear documentation and easy traceability to project requirements.


- Prepare a mind map outlining a plan for testing a story to facilitate a brainstorming session with your team.

    ```
    Act as a manual tester. Please create a checklist for the 'Create the Programs table page for F Admin' story listed below.


    Description: As an F Admin, I want to have the grid with the list of all Sports Programs. So that I can edit, duplicate, or delete any of them or create a new one from scratch.

    Acceptance Criteria:
    AC-1: List of Programs:
    The list of all Programs is displayed on the page in the form of a grid,
    The grid contains the Program Names and controls.
    AC-2: Program row controls: Each Program row of the grid contains the following controls (the appropriate tooltips are displayed on hover over):

    Edit Program,
    Copy Program,
    Delete Program.
    AC-3: Search: Above the grid, the page has the Searching control, providing the search through the grid by the Program Name.

    AC-4: Add New Program: Above the grid, the page has the Create New Program (Add New Program) button.

    Prepare the answer using Word Markup. Specify the numbered list with checklist ideas (general testing, AC-1, AC-2, etc.). Provide positive and negative ideas and mark them as (+) and (-).
    ```

- Develop a strategy for implementing version control for test cases and scripts for test data, considering that test cases are stored in Excel spreadsheets and test data is managed using SQL files.

    ```
    Scenario: As a QA Lead, I want to implement version control for test cases and automation scripts to ensure that the latest versions are always accessible to the testing team and changes to test artifacts are tracked efficiently.

    Please implement version control for our test cases and automation scripts to ensure easy access and tracking of changes.

    Adjustments:
    - Test cases are stored in .xlsx format
    - Test data manipulation is performed with SQL files.
    ```

- Prepare a requirement traceability matrix for developed test cases to ensure the appropriate level of test coverage.

    ```
    Act as QA. Prepare a requirement traceability matrix for the data below. Don't add any new records.
    Prepare deliverables in a way that will be easy to add to Confluence on the sprint result page.
    Make the main focus on the requirements.

    Desired output in a tabular form:

    - link to requirement
    - list of manual test cases ([Priority] Summary)
    - list of automated test cases ([Priority] Summary)


    Record Number, Jira Ticket (Test Case), Summary, Link to Requirement, Test Case Priority, Test Type

    1, HLTH-001, TC_001. Verify Successful User Sign Up, HLTH-101, High, Automated
    2, HLTH-002, TC_002. Verify Sign Up with Invalid Email, HLTH-101, Medium, Manual
    3, HLTH-003, TC_003. Verify Sign Up with Weak Password, HLTH-101, Low, Automated
    4, HLTH-004, TC_004. Verify Sign Up with Existing Email, HLTH-101, Medium, Automated
    5, HLTH-005, TC_005. Verify Sign Up with Special Characters, HLTH-101, High, Manual
    ```