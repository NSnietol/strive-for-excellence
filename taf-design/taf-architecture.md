# Things to do with archictecture


Define expections
Choose tools ( runners/reports/loggers)
Define sceope
define approches 
Configure test infrastructure
Define processs


## Common TAF Layers.

* Core layer :
  
    Includes Configuration Layer,
  
    Utility ( static classes ) 
  
    Runners ( parrallel, retry strategy , command line)
    
    Loggers ( Different levels )

    Reporters ( User friendly message), Db connectors , Driver Set up.
    Listeners 


* Business Layer

    UI/API/Mobile Controlers, Services.
    is a browser-oriented base test clcass that is reponsible for executing preparation and clean-up operations.

    Business logic layer: 
        Steps
        Business logic
        BDD features implementation
        Helper managers

* Tests level : Includes Test data.

    Test data 
    Tests 
    Make tests simpler, user SoftAssertions, Name them wisely, keep the independecy of them.
        Maintainability
        Stability
        Clarity
        Reliability