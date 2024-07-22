# Limitations

- Cognitive limitations : they don't think like hums, they don't have common sense, they don't understand the world like humans do.
- Output quality and transparency : answers are based on their training and the questions you ask.
- Technical limitations : they can tricked or attacked.
- Privacy, Security and Regulatory limitations : they may store data and raise privacy concerns.

## System bias

A tendency upheld by institutions that favors or disadvantages certain outcomes or groups. LLMs can inherit biases from their training data, which can lead to biased outputs.


## Data bias

A circumstance in which systemic errors or prejudices lead to unfair or inaccurate conclusions. LLMs can perpetuate data bias if their training data is biased.



## Cognitive limitations

Models aim to generate the **next token to complete your prompt**, rather than solving the task itself; this is why they are highly sensitive to the prompt you provide.

- LLM don't know if they have produced good or bad output.
- LLM don't have an "inner monologue stream in the head" as humans do.
- They may "hallucinate"
- They may be biased 

## Output quality and transparency

- Dependency on prompt quality 
- Lack of training data and decision logic transparency : we don't understand how they make decisions.

## Technical limitations

- Prompt injection : Users can manipulate the input prompts to generate unwanted outputs or misinformation.
- Jailbreak attacks: refer to attempts by users to exploit the models beyond its intended use to violate ethical guidelines or laws.
- Data poisoning attacks : the training data has biased or harmful information, the generated outputs may also be biased or harmful
- Emerging vulnerabilities.



## Identify AI harms

- **Allocate harms** : Wrongdoing that occurs when resources are distributed unfairly. E.g., biased hiring algorithms, biased loan approval algorithms.
- **Quality of service harms** : a circumstance in which AI tools do not perform as well for certain groups or individuals. E.g., facial recognition software that performs poorly on certain demographics.
- **Representation harms** : a situation in which AI tools do not represent all groups or individuals fairly. E.g., voice recognition software that performs poorly on certain accents.
- **Social system harm** : a situation in which AI tools reinforce or perpetuate social systems that are unjust or harmful. E.g., predictive policing algorithms that target certain communities unfairly, deepfake technology that can be used to spread misinformation.
- **Interpersonal harms** : The use of technology to harm individuals or groups. E.g., cyberbullying, harassment, or the use of AI to generate deepfakes for malicious purposes.


## Drift versus knowledge cutoff
Another phenomenon that can cause unfair or inaccurate outputs is drift. Drift is the decline in an AI model's accuracy in predictions due to changes over time that aren’t reflected in the training data. This is commonly caused by knowledge cutoff, the concept that a model is trained at a specific point in time, so it doesn’t have any knowledge of events or information after that date
  