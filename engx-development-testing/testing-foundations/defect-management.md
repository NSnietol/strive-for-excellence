# Defect management
We'll explore the two approaches to defect management; traditional and The Zero Tolerance Approach.
Fist, let's introduce the differences in software problems.

- Error : Are mistakes made by people writing code or misunderstanding requirements.
- Defect : happens when the code does not produce and expected result in alignment with products.
- Failure : is when the end user experiences an error.



## Traditional Approach
It's team-oriented framework that helps developers and management follow clear steps for identifying, resolving, storing, and tracking all defects in a product. It encompasses the following steps:

- Discovery : this stage aims to discover as many bugs as possible.
- Triage : this stage aims to prioritize the bugs based on their severity and impact.
- Resolution : this stage aims to fix the bugs.
- Verification : this stage aims to verify that the bugs have been fixed.
- Closure : this stage aims to close the bugs.

## Zero Tolerance Approach

Is designed to let developers fix the problems right away, saving time on discussing, reporting and verifying bugs. It does not matter what the problem is, it should be fixed immediately.

In this process, developers will test their software in the Ephemeral environment, and the Test Region. The ephemeral environment is isolated, which means if a given component will interact with other components, it will be mocked. The test region is a integrated environment, which means if a given component will interact with other components, it will be real.