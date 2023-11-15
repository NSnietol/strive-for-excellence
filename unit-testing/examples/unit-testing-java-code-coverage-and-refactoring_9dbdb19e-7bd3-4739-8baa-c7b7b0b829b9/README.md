# Practical Task Repository for Code Coverage and Refactoring

## Task Description

Write tests for the existing code in "com/example/legacyshop/unittest/shop" to achieve:
* at least 85% code coverage
* at least 85% mutation coverage

## Task-Specific Guidelines

* Install and run SonarQube locally using the following instructions: https://docs.sonarqube.org/7.4/setup/get-started-2-minutes/.
* Go to http://localhost:9000/ and log in to Sonarqube using *admin/admin* as credentials.
* Change your admin password.
* Generate a new access token on http://localhost:9000/account/security/ and copy its value. The token name is **engx**, and the token type is **user token**.
* Copy your generated token value (you will not be able to see or copy it next time).
* Scan your application by running ```mvn clean verify sonar:sonar -Dsonar.login=squ_707ffad3818d97b0c163217b41e3a1b37ddf8cb4``` where you replace `squ_707ffad3818d97b0c163217b41e3a1b37ddf8cb4` with the token you generated.
* View the code coverage results on http://localhost:9000/projects (it might take a few seconds for the results to appear).
* Run "./gradlew pitest" to generate a mutation coverage report.
* Find the mutation coverage report in the "build\reports\pitest" folder, and check to see where tests need to be improved.

sqp_0f96570f5a99028f8d5b5f7916a4e07a0b5125d2

sqp_2357ac1ec520d4e278f87a2e80646984d2544b50

./gradlew sonar \
-Dsonar.projectKey=my-local-gradle \
-Dsonar.host.url=http://localhost:9000 \
-Dsonar.login=sqp_b1e3d884e1c818d33fdb1e4b6db8b013bfa5fcfa

## General Task Guidelines

* Please follow the principles/topics discussed so far in this course.
* The task repository may contain one or more practical tasks. Mentees are expected to complete all the tasks.
* The programming language to be used is **Java**.
* Except for test files, no source files should be changed.
* **The logic and behavior of the code must be preserved.**


## About the Review Process

* **Merge request (MR)**—The whole review process happens on **one single MR submitted to the Availia Mentee bot**. The MR must remain _Open_ until the mentee receives the notification "Review completed."
* **Multiple rounds**—Usually, it takes several rounds for a mentor to review the mentee's task. In other words, the mentees are expected to work on the same MR until the mentor approves it. After the review, the deadline counter stops.
* **Lead mentor review**—After the mentor approves the MR, another lead mentor review may take place. During this round, the lead mentor reviews the quality of the task. It can result in additional comments on the MR for the mentee to address. After the lead mentor review, the practical task is considered completed.
* **Task approval**—The grade for the task will be assigned automatically on Learn within **48 hours** of the mentor's (lead mentor's) approval, and you will receive the "Review completed" notification from the Availia Mentee bot.
