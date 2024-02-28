# Static code analysis tools


## Linters 
When many linters are combined into one, the resulting tool is called a metalinter.
Modern linters provide many types of checks.

- Syntax errors
- Codding styles
- Potential bugs
- Security checks
  
However, linters are not perfect and can produce false positives and false negatives.

- Additional effort on initial setup
- Performance degradation due to codebase increase : let's make sure our build pipeline is not slowed down by the linter
-  Longer delivery : time to integrate tools, to agree on rules, to solve false positives, etc.


## Steps to integrate a linter

1. Choose a linter, let's base on language and framework
2. Choose a configuration, let's base on the team's coding standards
3. Integrate the linter into the build pipeline, let's base on the team's workflow
4. Agree on rules
5. Solve false positives
6. Train the team
7. Monitor the linter's output
8. Update the linter and its configuration
9. Repeat steps 4 to 8
