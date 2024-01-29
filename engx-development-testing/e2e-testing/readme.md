## End to end testing (e2e)
A testing method for ensuring the entire product, including all system dependencies work as expected and the flow of data is maintained for all processes. 

It requires you to understand the system from the user's standpoint.

### Scope

- UI E2E : Graphical User Interface (GUI) testing
- API E2E : command line, API, text-based interface, etc.

If the business logic resides on the API level, then it is best to validate most of the cases with API tests and create only a few select UI tests.



### Challenges

- Time consuming: user can follow many paths through the system, and perform unpredictable actions.
- Sensitivity to the Test Design : unlike the other testing levels, E2E tests require more attention to design ( Environment, data, etc. )
- Dependence on User Journey:  if user journeys are created without proper user research behind them or are ot verified while writing test cases, the outcome of e2e may be invalid

Unlike other testing levels, E2E testing requires careful preparation and management, especially if you're not the only engineer responsible for the product and other engineers or teams are involved.



Structure the E2E testing process according to your unique organization/project needs and guidelines. There is no unified approach to E2E testing because it depends on the product and practices established in a team.

