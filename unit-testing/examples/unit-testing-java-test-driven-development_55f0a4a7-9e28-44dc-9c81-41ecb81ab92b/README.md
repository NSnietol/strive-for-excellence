# Practical Task Repository for Test-Driven Development

## Task Description
Implement the [Game of Life](https://playgameoflife.com/) service according to the test-driven development (TDD) approach.

Rules:
* Any live cell with fewer than two live neighbors dies, as if by underpopulation.
* Any live cell with two or three live neighbors lives on to the next generation.
* Any live cell with more than three live neighbors dies, as if by overpopulation.
* Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction. 

## Task-Specific Guidelines 
* Follow the TDD approach to achieve the goal of the task.
* Implement an interface and update only one method in each TDD cycle *(Red-Green-Refactor)*.
* Every step of the TDD cycle should be in a separate commit.

## General Task Guidelines

* If a pipeline definition (.gitlab-ci.yml) exists, please don't change it.
* Please make corrections per the principles/topics discussed so far in this course.
* The task repository may contain one or more practical tasks per topic. You are expected to complete all the tasks.
* It is recommended that you complete the practical tasks for a topic before proceeding to the next topics.
* A task/subtopic will be considered completed after all the review comments are incorporated from the review process mentioned below.


## About the Review Process

* **Merge request (MR)**—The whole review process happens on **one single MR submitted to the Availia Mentee bot**. The MR must remain _Open_ until the mentee receives the notification "Review completed."
* **Multiple rounds**—Usually, it takes several rounds for a mentor to review the mentee's task. In other words, the mentees are expected to work on the same MR until the mentor approves it. After the review, the deadline counter stops.
* **Lead mentor review**—After the mentor approves the MR, another lead mentor review may take place. During this round, the lead mentor reviews the quality of the task. It can result in additional comments on the MR for the mentee to address. After the lead mentor review, the practical task is considered completed.
* **Task approval**—The grade for the task will be assigned automatically on Learn within **48 hours** of the mentor's (lead mentor's) approval, and you will receive the "Review completed" notification from the Availia Mentee bot.

