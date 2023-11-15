# Practical Task Repository for Working With Legacy Code

## Task Description

Refactor legacy code and achieve at least 85% code coverage, including the original code.

## Task-Specific Guidelines

* Both source files and test files must be modified.
* **The logic and behavior of the code must be preserved.**
* The repository contains a test that you can use to check if the original behavior is preserved.

### How to check code coverage locally

* Run SonarQube Community Edition server locally, as described here: https://docs.sonarqube.org/latest/try-out-sonarqube/
. Download the ZIP archive, unpack it and run.

**NB**: On Windows, you may get the "Address already in use" error in **logs/web.log**. In this case, configure a different **sonar.web.port** in the **conf/sonar.properties** file and adjust **systemProp.sonar.host.url** in **gradle.properties**. For the next steps, use the configured port instead of 9000 in the SonarQube URL.

* Go to http://localhost:9000/ and log in to Sonarqube using *admin/admin* as credentials.
* Change your admin password.
* Generate a new access token on http://localhost:9000/account/security/ and copy its value. The token name is **engx**, and the token type is **user token**.
* Copy your generated token value (you will not be able to see or copy it next time).
* Scan your application by running ```gradlew clean sonar -Dsonar.login=squ_707ffad3818d97b0c163217b41e3a1b37ddf8cb4``` where you replace `squ_707ffad3818d97b0c163217b41e3a1b37ddf8cb4` with the token you generated.
* View the code coverage results on http://localhost:9000/projects (it might take a few seconds for the results to appear).


## General Task Guidelines

* If a pipeline definition (.gitlab-ci.yml) exists, please don't change it.
* Please make corrections per the principles/topics discussed so far in this course.
* The task repository may contain one or more practical tasks per topic. You are expected to complete all the tasks.
* It is recommended that you complete the practical tasks for a topic before proceeding to the next topics.
* A task/subtopic will be considered completed after all the review comments are incorporated from the review process mentioned below.
* While making changes, any files contained inside folder named `thirdparty` should be ignored. **Do not modify thirdparty classes.** These files are meant to provide context for the task and are not part of the task.


## About the Review Process

* **Merge request (MR)**—The whole review process happens on **one single MR submitted to the Availia Mentee bot**. The MR must remain _Open_ until the mentee receives the notification "Review completed."
* **Multiple rounds**—Usually, it takes several rounds for a mentor to review the mentee's task. In other words, the mentees are expected to work on the same MR until the mentor approves it. After the review, the deadline counter stops.
* **Lead mentor review**—After the mentor approves the MR, another lead mentor review may take place. During this round, the lead mentor reviews the quality of the task. It can result in additional comments on the MR for the mentee to address. After the lead mentor review, the practical task is considered completed.
* **Task approval**—The grade for the task will be assigned automatically on Learn within **48 hours** of the mentor's (lead mentor's) approval, and you will receive the "Review completed" notification from the Availia Mentee bot.
