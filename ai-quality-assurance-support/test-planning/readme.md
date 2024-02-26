
# Test Planning
Conversation AI tools can support quality engineers in the test planning by offering intelligent guidance on devising efficient test strategies, identifying test scenarios, and preparing test cases.


## test plan / Strategy preparation


AI can help in creating a skeleton for a test plan or strategy document.

###  Prepare a test strategy for a given domain.




```
Act as a Lead QA and prepare a test strategy for the domain below.

Prepare the strategy in a Confluence format.

Domain:
{{domain}}

```
E.g domain description : "Hotel for Your Pet" is a premier mobile application designed to provide top-quality accommodation and personalized care for pets across Europe.

### Suggest testing types applicable for testing an application migration.


```
Please act as a Lead QA.

Suggest testing types that might be applicable for testing an application migration from On-prem to GCP Cloud. Consider that no new functionality will be added.

Provide the answer in a tabular format with columns: Testing Type, Priority, Explanation.

```

### Suggest risks applicable for testing an application migration.

```
Please act as a Lead QA.

Suggest risks that might be applicable for testing an application migration from On-prem to GCP Cloud.

Consider that DBMS is not migrated and will remain in the On-Prem network.

Provide the answer in a tabular format with columns: Risk description, Probability, Impact, Mitigation Plan.
```

### Test tool comparison 
    
```
Act as a Lead QA with expertise in cross-browser and mobile testing.

Please prepare an overview and analysis of popular systems that allow running cross-browser testing.

Results must be formalized in a tabular form with columns: Tool Name, URL, Short Description, Pros, Cons, Rating. Indicate if a system requires programming language knowledge.

Include such systems as BrowserStack, SauceLab and LambaTest, and at least five other systems.
```

### Test effort Estimation

```
Act as a QA manager. Please help to estimate the testing efforts for a project involving the development of an online streaming platform called 'StreamWorld.' The project scope includes creating a web and mobile application with features such as user registration, content browsing, streaming, playlist creation, and a recommendation system.

The platform must handle high levels of user concurrency and comply with data privacy regulations. Considering the project scope, complexity, and total requirements, please suggest appropriate estimation techniques and best practices to ensure accurate and reliable test effort estimation for 'StreamWorld.'
``` 

### Resource Planning and Role Allocation


```
Act as a quality architect with a solid automation background. You need to propose a team setup for the automation of the scope below.

Automation needs to be created from scratch.

Additional details

Timeline – 3 months
Testing on different browsers is in scope.
Performance is out of scope
Need to use CI/CD and reporting for automation.
Provide the answer in the tabular form:

Role – for example, lead AQA
Skills – for example, API testing, UI testing, BDD, etc.
Responsibilities – 2-5 sentences with expectations
Quantity 
```

### Training preparation

```
Please act as a Lead QA.

Suggest a list of training for manual and automation QA that might be helpful for testing an application migration from On-prem to GCP Cloud.

Provide the answer in a Confluence format. Specify entry criteria for each training and learning outcome. Specify the target audience (manual, automation testing engineers).

Desired output:
Training title
Audience
Entry criteria Learning outcome.
```