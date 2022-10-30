## Reasons to do code review


* To look at the solution from a different point of view (to catch potential problems the author didn't anticipate).
* To share implementation details with the team (to promote knowledge-sharing).
* To provide feedback and decide whether the new code can be uploaded to the main codebase or needs improvement.



### Benefits of code review

The key goals of code review are to indentify any bug in the initial development and facilitate a maintainable codebase.




1. Share Knowledge
2. Increase collaboratin
3. Enhance project quality 
4. Maintan compliance 
5. Do better estimates


### Chanllenges 

1. Conflict management : There will be situation when reviewers disagree with you.
2. Shifting responsibilities.
3. No coding standard
4. Longer review times
5. Dealys in release


### Code review Strategy

is an outline that describes the approach to code review in terms of a client's code quality objective for a particular project, it encompasses :

* Establishing common code review rules/practices and tools
* Make these rules easy to folow by all project members.
  
### Components of an efective code review strategy

These components are not set in stone, and it just provides some clues.

* High-level summary and scope : define the scope of the code review. Business and project objectives should be at the core of the process.
* Coding standards : For instance : Google and Oracle, Gradle ones for Java. 
* Tools for automating code review : Gitlab, Github, Bitbucket.
* Tools for quality control : Here two metrics are being looked at, *Code Quality Metrics* (e.g technical debt and maintainabilty),and  *Quality Gates*  indicating whether code meets the minimum level of quality.
* Rules for choosing a reviews : It would be great if the reviews is some with relevant experience.
* Code review quality control : _Investigateit_
* Other agreements and rules : It may include feedback template and sef-review checklists, PR objectives.


### Coding standards 
 it's extremely important to conduct an initial training session and facilitate continuous learning.


### How to choose a reviewer.

1. Lead review
2. Peer Review
3. Mixed review :  Lead review and peer review
4. All-peer review.

When more than two members participates in code review, some approches can be used.

* Set minimum of approvals: With this some comments can be overlooked
* Set minimum of approvals and maximum of rejections : It's time-consuming.


### Tools for Code Quality Control

Code quality and security are the * most crucial factors* and these can be done in two days.

Static code analysis : finds dead code, typos, vulnerabilites and other erros (e.g SonarQube)
Dynamic code analysis : dinds performance, memory leaks, null pointer dereferencing.(e.g OWASP Zed Attack)


### Code review quality control

Consider colelcting and analyzing code review quality metrics to ensure that code reviews are helping and not harming your project. In a nutshell, this allow you to analyze the overall health of code review.


### Types of code review quality metrics.

* Review/ Inpection quality metrics
*  Timeline metrics
*  Process-related metrics


### Review / inpsection quality metrics 

These are related to *line of code* reviewed and the number of defects identified and missed.

1. Lines of code (LOC)
2. Code review rate : is LOC divided by inspections Hours 
3. Identified defects per LOC 
4. Defect rate : number of defects divided by inpections hours.
5. Defect density : number of defects divided by kLOC.
6. Missed defect count.


### Timeline metrics 

Timeline metrics are connected to lead time 

### Code Review Best Practices 

* Use automation tools
* Use checklists 
* Optimize the size and scope
* Give feedback efectively


### Checklists

Is one of the most effective organization tool and provides a predetermined set of questions and rules your team will follow during the code review process.


For instance:

* Add the ticket number to the title of the pull request
* Add description of the task to the PR
* Clean commit history
* Unit tests are green
* Code quality gates are met
* Code is documented


It's recommeded to create separate checklists for _the code author_ and _the reviewer_.

Make each item actionable and achievable, this helps to process standardization.




## How to receive feedback

* Be open to feedback
* The reviewer is evaluating the code, not you.
* Learn from mistakes
* Ask for examples.
* Asses ideas given during feedback