# Functions should only do on thing.

## Functions should have one level of abstraction

Every method inside your codebase should deal with concepts related to just one level of abstraction. No mixing.

- Function assessment :

    1. Is it easy to read 
    2. Can you easily navigate the flow of it ?
    3. Does it adhere to the DRY ?
    4. Is it easy to test ?

----
- ## Functions should be a command or a query - No both.
Command-Query Separation is a principle that states functions should either “do” something, a command, or “answer” something, a query.

------
- ## Functions should have descriptive names.

-----
- ## Functions should not have side effects.
they should perform the action indicated by their names.

-----

- ## Extract try / cat blocks into functions of their own.
Error handling counts as “one thing,” so a function that handles errors shouldn’t be responsible for anything else. If the keyword “try” exists in a function, it should be the very first word and there should be nothing afterwards the catch or final blocks.

If you need to add vertical space to separate two logical pieces of code, it’s a good indication that your function is doing more than one thing and should be extracted.


# Parameters 

- Never have more than three parameters associated with a single function.
- Do not use Boolean parameters, split the function instead.
- Do not pass or return nulls( Own Exception would be better).
- Avoid the use of output parameters.





# Side effects

When calling a function results in a external state change. The root of the problem is that side effects usually occur in paired functions :

- Begin and commit
- Open and close
- Start process and Join/Finish
- New and delete

The relationship is called "Temporal coupling", and it entails forcing one function to be called before another. 

# Structure 


Structured programming is a programming paradigm composed of structures blocks or functions with a single entrance and exit