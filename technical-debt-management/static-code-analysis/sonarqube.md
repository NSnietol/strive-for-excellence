# SonarQube
SonarQube is a self-managed, automatic code review tool that continuously analyzes the quality of source code to help programmers deliver clean code systematically.

## Types of services
- SonarQube Community Edition : Free and open-source
- SonarCloud : A cloud-based service that automatically analyzes the quality of your code and integrates with your workflow.
- SonarLint : A free and open-source IDE extension that helps you detect and fix quality issues as you write code.


## SonarQube's Architecture
As an open-source platform, SonarQube comprises four components:

- A server
- A database
- Plug-ins
- Scanners

## SonarQube Rules

### Code Smells
A code smell is a maintainability issue that makes code confusing and difficult to support.
*Code smells should be eliminated*, or justification should be provided for why they are used in the code design

### Bugs 
A bug is a piece of code that causes an unexpected behavior in the application.
Bugs should be fixed to prevent unexpected behavior of an application or service, and bug fixes should be covered with unit tests to ensure the issues do not reappear.

### Vulnerabilities
A vulnerability is a security issue that can be exploited by an attacker to compromise the confidentiality, integrity, or availability of the application or service.

You should fix all vulnerabilities with a severity of "Major" or higher so that the service or application will not become a weak link and a target for hackers.


### Security Hotspots
A security hotspot is a security-sensitive fragment of code that requires review.
After review, one of the following scenarios is possible:

- There is no threat.
- A fix is needed to secure the code.

## Rules severity

- Blocker : A bug with a high probability of affecting the behavior of the application in production
- Critical : A bug with a low probability of affecting the application behavior in production or causing a security-related issue
- Major : A quality flaw that can highly impact the developer's productivity
- Minor : A quality flaw that can slightly impact the developer's productivity
- Info : Neither a bug nor a quality flaw, just a finding



## Quality Gates
Quality gates enforce your company's quality policy. They check to see if your project is ready for release by measuring it against a set of predefined conditions (e.g., code coverage should be at least 80%).

_SonarQube's built-in quality gates focus on keeping new code clean rather than spending time on remediating old code, thus enforcing the "clean as you code" approach._

## Clean as You Code
Clean as you code is an approach to maintaining the quality of new code, to ensure it is clean and safe.

