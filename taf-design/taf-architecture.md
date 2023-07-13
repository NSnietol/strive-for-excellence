# Things to consider when it comes to architecture



- Define expectations : what you're achieving .
- Choose tools : Elements to think of runners/reports/loggers.
- Define scope : what is being included in the automation.
- Define approaches : scripts, play and record, data-driven or behave-driven.
- Configure test infrastructure.
- Define process.


## Common TAF(Test Automation Framework) Layers.
  
- **Core layer in automation projects**:
  
    1) Includes Configuration Layer.
  
    2) Utility ( static classes ) 
  
    3) Runners ( Parallelism, retry strategy , command line)
    
    4) Loggers ( Different levels )

    5) Reporters ( User friendly message), Db connectors, Driver Set up, Listeners 


- **Business Layer**

  - **UI/API/Mobile Controllers**: base test class responsible for executing preparation and clean-up operations.

  - **Business logic layer**: Encompasses steps, business logic, BDD features implementation, Helper managers.

* **Tests level** : Includes Test data and tests complying with making tests simpler, user SoftAssertions, Name them wisely, keep the independency of them.
  