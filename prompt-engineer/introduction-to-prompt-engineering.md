# Prompt Engineering
Prompt Engineering is a new discipline that investigates how to develop and optimize prompts to efficiently use language models for various applications.

## Prompt components

- Role : defines the perspective or identity that the LLM must assume to complete the task.
- Context : provides the necessary information to the LLM to understand the task.
- Instructions :defines the specific task to be performed by the LLM. _The more precise and succinct you define the ask, the better the chances are that you will receive the desired result_
- Data : includes any relevant data or info that the LLM should consider when completing the task.
- Output : Specific formatting requirements for the output.
- Examples
- Constraints : defines any limitations that LLM should work within generating the output.

## Principal parameters
Employing advanced prompt parameters enables prompt engineers to achieve, among others, several objectives:


- Control response length and stop sequence
- Define the underlying model
- Manage the creativity level
- Control frequency and presence penalties
- Inject start and restart text

### Temperature (0 to 1) 
Is a parameter that controls the randomness of the output.A higher temperature (e.g., 1.0) makes the output more diverse and creative, while a lower temperature (e.g., 0.1) makes the output more focused and deterministic.

### Top-p (0 to 1)
(also known as nucleus sampling) dictates the scope of randomness for the language model. It determines how many random results the model should consider based on the temperature setting

### Stop sequence
The stop sequence is a string of text that the model uses to determine when to stop generating output. 

### Frequency penalty (-2 to 2)
A parameter reduces the likelihood of the model repeating the same line verbatim by assigning a penalty to more frequent tokens

### Presence penalty (-2 to 2)

A parameter increases the chances of the model discussing new topics by penalizing tokens already present in the input. 

### Best of 
Allows you to specify the number of completions (n) that the model should generate, and it returns the best completion according to the model's internal evaluation.

**Advanced prompt parameters are generally accessible only through the LLM AP**