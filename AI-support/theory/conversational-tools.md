## LLM Architecture
Conversational AI are based on transformer architectures where data in process in parallel allowing managing long-term dependencies and more context-aware interpretation. 

Transformer is a type of model architecture that processes a text all at once rather than one word at a time and has a strong ability to understand the relationship between those words.

The transformer architecture is composed of these main parts: the encoder and the decoder. The encoder processes the input sequence, self-attention mechanism and the decoder generates the output sequence.


## Hallucinations

Hallucinations are a common problem in large language models (LLMs). Hallucinations are when the model generates text that is not coherent or relevant to the input.

- Factual inaccuracies: LLMs can generate text that is factually inaccurate. GPT does not inherently know the facts of the world. It generates text based on the patterns it learned during training.
- Fabrication or Misrepresentation: This can be due to the model's training data or the model's biases. This includes creating artificial sources, marking unfounded claims, or designing fictional events.
- Nonsensical output: sometimes respond with completely random, unrelated, or nonsensical in the real-world context answers.
- Biased output:  sometimes reproduce or magnify the biases present in the training data.

## Validating results
Any system can have failures and knowing the hallucinations of LLMs, it is important to validate the results, here are some of the best practices.

- Cross check : Cross-checking the results with other sources to ensure the information is accurate.
- Appropriateness : be careful to use it for tasks that require common sense or ethical considerations. 
- Critical thinking : Carefully analyzing the information presented, considering alternative perspectives, and questioning the information presented.


It's crucial to remember that LLMs are not safe for transmitting sensitive information. You must avoid sending it to any LLM and take the necessary precautions to protect your data.


## Zero-shot and Few-shot prompting

Zero-shot and few-shot learning are techniques that allow models to perform tasks without any or very little training data.
- Zero-shot learning: The model is given a task and a description of the task, and it is expected to perform the task without any training examples, such as ask for capital of city.
- Few-shot learning: The model is given a task and a few examples of the task, and it is expected to perform the task with the given examples, such as summarizing a paragraph.



## Prompting Best Practices
- Be clear and specific: Provide clear and specific instructions to the model to avoid ambiguity.
- Use example to guide the model: Providing examples can help the model understand the task better.
- Minimize vague instructions: Avoid vague instructions that can lead to misinterpretation by the model.
- Keep it simple: Keep the prompt simple and concise to avoid overwhelming the model.
- Keep the conversation on track: Use prompts to steer the conversation in the right direction and avoid off-topic responses.
- Use different chats to manage different tasks: Use different prompts for different tasks to avoid confusion and ensure the model stays on track.
- Organize your query by listing key details like issues, goals, and constraints using bullet points