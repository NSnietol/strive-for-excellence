# Key activities of the test environment setup process

- Environment requirements analysis
- Test Environment Setup Guidance
- Test Data Setup 
- Deliverable preparation

## Environment requirements analysis
AI tools can help quality engineers better understand the test environment's architecture, hardware, and software requirements by providing insights on necessary configurations and components to ensure a setup optimized for testing.

- ### Prepare a plan for creating a staging environment in a cloud platform to discuss with the development team.
   ```
    Act as a Test Manager with solid expertise in AWS.
    I need to make a proposal on configuration for the AWS environment for user acceptance testing.
    Scope of testing: migration of web applications from the on-premise environment.
    Please at first provide high-level guidance in a textual format:
    Idea (in bold)
    Description (2-5 sentences with details).
    ```

- ### Analyze available testing options to choose the appropriate test environment.
  
   ``` 
    Act as a Lead QA in mobile testing.
    Conduct a comprehensive analysis of how to test mobile e-commerce applications under different network conditions (including 3G, 4G, and Wi-Fi).
    Provide the output in sections:

    1. Options (emulators, real devices, etc.). Describe the main idea. Provide the answer as a bulleted list.
    2. Table with analysis. Include the Pros and Cons for each option.
    3. Prepare a list of questions to consider.
    ```
     following guidelines to ensure comprehensive, organized, and actionable insights:
- Specify the aspects you need to be analyzed or addressed in the response to obtain relevant information for decision-making.
- Determine the structure and format of the desired output, such as lists, tables, or paragraphs.
- Request a list of questions or considerations to promote critical thinking and allow you to explore the subject from different perspectives.
- If working with a limited range of resources or tools, include this information in the prompt, enabling the tool to consider it when generating the response.

## Test Environment Setup Guidance

- ### Prepare a script for provisioning a virtual machine in a cloud platform.
   ```
    Act as a DevOps in GCP.
    Prepare a script for provisioning a virtual machine with Ubuntu 20.04, Java 11, and Apache Tomcat installed for GCP.
    ```
    When using conversational AI tools to generate a script for virtual machine provisioning, always specify the technologies, applications, or platforms that should be incorporated in the test environment setup

- ### Prepare a script for releasing a Kubernetes cluster.

    ```
    Act as a DevOps.

    Prepare a shell script that will release Kubernetes Clusters used for performance testing.

    The script must delete the Kubernetes cluster, including worker nodes, associated services, and load balancers.
     ```
     When using conversational AI tools to generate actionable shell scripts for test environment clean-up, always be explicit and provide a detailed and unambiguous list of the components and resources that must be de-provisioned or cleaned.

## Test Data Setup
- ### Prepare test data for smoke testing on the production environment, ensuring deletion after testing is completed.

    ```
    Act as a QA who likes working with test data.
    Please generate test data for healthcare application testing.
    Populate test data in tabular form. The expected columns are:

    -DATE (only date before in a range January - September 2023)
    -PatientID
    -BirthDate
    -ETHNICITY
    -GENDER (use M, F and N/D)
    -BIRTHPLACE (country)
    -Procedure (medical Termin)

    Use YYYY-MM-DD format for DATE and BirthDate columns.
    Generate a minimum number of records to ensure that:
    - at least one patient has more than three procedures,
    - at least three patients have more than two procedures,
    - at least four patients have only one procedure,
    - patients with all gender statuses are present,
    - at least one patient is older than 80 years,
    - at least four different ethnicities are present.

    For each rule, add a PatientIDs list, for example:

    At least three patients have more than two procedures (1001, 1002, 1003).
    ```
    When using conversational AI tools to generate test data for smoke testing, always specify the critical functionalities and scenarios that the test data should cover, and ensure that the data is designed to be deleted after the testing is completed.

    - ### Prepare a “How To” guide on setting up the test environment.
  
    ```
    Act as QA lead.

    Assist in documenting test environment setup processes step-by-step, including capturing screenshots, logging configuration steps, and generating detailed documentation.

    Prepare a document in Confluence format.
    ```
    When asking AI to generate a test environment setup guide, always indicate the specific items to be documented (such as "...step-by-step, including capturing screenshots, logging configuration steps..." ) and other documentation requirements.
  - ### Prepare a rollout testing strategy for a test environment.
  ```
    Act as a Test Manager who needs to prepare a rollout testing strategy for a UAT environment.

    Propose a step-by-step plan that will be focused on automation testing.
    High-level ideas:
    - deploy application (CI/CD pipeline)
    - run health checks (CI/CD pipeline)
    - run INSERT script for adding test data
    - run an automation script
    - verify results
    - delete test data
    - decide on rollback

    ETA for the rollout must be at most three hours.

    There won't be a possibility to check anything manually.
    Provide the answer in a tabular form with columns: step #, step description, duration, and responsible team.
    Also, provide suggestions on further monitoring. 
    ```