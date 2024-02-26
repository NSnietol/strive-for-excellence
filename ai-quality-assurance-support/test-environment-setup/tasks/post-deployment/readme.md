Task Description
Imagine that your project does not have CI/CD integration yet, and deploying new application versions is done manually. After each deployment, you must verify whether all files have been deployed successfully.

Use ChatGPT to generate a script, ideally operating in PowerShell, that will recursively scan a specified folder and return the list of files present in the folder. While PowerShell is the preferred language for this task, you may use Bash or any other scripting language you are comfortable with.


Acceptance Criteria
Below are the acceptance criteria:

The prompts to ChatGPT should be well-structured and clearly communicate your request.
The script is functional and runs without errors.
The script extracts details that consist of, at minimum, folder name, file name, and file size.


--- Solution ---

    Act as a DevOps engineer who needs to verify whether all files have been deployed successfully after each deployment.

    Let's prepare a bash script that will recursively scan a specified folder and return the list of files present in the folder, and then verify whether all files have been created successfully.

    The script should be able to list details that consist of folder name, file name, and file size at minimum.
    
    