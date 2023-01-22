# Things to consider when it comes to archictecture



- Define expections : what you're acheiving .
- Choose tools : Elements to think of runners/reports/loggers.
- Define scope : what is being included in the automation.
- Define approches : scripts, play and record, data-driven or behave-driven.
- Configure test infrastructure.
- Define processs.


## Common TAF Layers.
  
- **Core layer in automation projects**:
  
    1) Includes Configuration Layer.
  
    2) Utility ( static classes ) 
  
    3) Runners ( parrallel, retry strategy , command line)
    
    4) Loggers ( Different levels )

    5) Reporters ( User friendly message), Db connectors, Driver Set up, Listeners 


- **Business Layer**

  - **UI/API/Mobile Controlers**: base test class reponsible for executing preparation and clean-up operations.

  - **Business logic layer**: Encompasses steps, business logic, BDD features implementation, Helper managers.

* **Tests level** : Includes Test data and tests complying with making tests simpler, user SoftAssertions, Name them wisely, keep the independecy of them.
  