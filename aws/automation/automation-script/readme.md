# Automation
Is the use of technology and systems to perform task ad processes with minimal or no human intervention. It involves creating workflows, scripts, or programs so that software (or robots) can carry out specific tasks.

# AWS CLI
## User data 

The user data file in an Amazon EC2 instance is a script or data that is passed to the instance during its launch.  Some of the common examples are :

- Software installation
- Configuration management: set up the environment variables, install the required packages, etc.
- Bootstrapping applications: pulling code from version control, downloading config files.
- Running scripts: running scripts to configure the instance.
- Customization: customizing the instance to meet the requirements.

## Infrastructure as Code (IaC)

Imperative IaC: In this approach, the user specifies the steps to achieve the desired state. The user specifies the steps to create the infrastructure. The user specifies the steps to update the infrastructure. The user specifies the steps to delete the infrastructure.


Declarative IaC: In this approach, the user specifies the desired state of the infrastructure. The user specifies the desired state of the infrastructure. The user specifies the desired state of the infrastructure. The user specifies the desired state of the infrastructure.

## AWS CloudFormation
AWS CloudFormation is a service that helps you model and set up your AWS resources so that you can spend less time managing those resources and more time focusing on your applications that run in AWS.

When you use AWS CloudFormation, you work with templates and stacks. A template is a JSON or YAML formatted text file that describes your AWS infrastructure. A stack is a collection of AWS resources that you create and manage as a single unit.

Comparing CloudFormation against the AWS CLI, CloudFormation is a declarative approach to infrastructure management. The first one is resilient as if something goes wrong It can roll back to the previous state. The second one is idempotent, and have to be write to handle errors and exceptions in the predefined the list of steps.

Comparison of cloudformation and script:

Cloudformation is a declarative mechanism to implement IaC while Script is an implicit mechanism to declare IaC, they both fulfill the need to provide automation for the creation of the creation of infrastructure and configuration, however, it seems that scripts are recommended when creating minimal infrastructure needs such as a quick test database while Cloudformation should be the go-to for more maintainable project configuration as they provide an interface to interface and manage the infrastructure that is less prone to human error plus offer and easy to read language that can use access and review to encourage collaboration and knowledge sharing. 

### Infrastructure drift
Infrastructure drift is the difference between the expected configuration and the actual configuration of an environment. AWS Systems Manager can be used to detect and remediate infrastructure drift.


## Configuration as Code
Configuration as Code is a practice of managing configurations of systems and applications in a code format. This practice is used to automate the configuration of systems and applications. It is used to ensure that the configurations are consistent across all environments.
We can keep track of the changes made to the configurations. We can also use version control to manage the configurations: 

* How many instances are using my latest AMI?
* How many instances are using running a specific version of the software?



## Bootstrapping

Bootstrapping is the process of setting up the software and configurations that are required for the instances. There are three types of bootstrapping: 



- Golden bootstrapping(prebaked AMI): The golden bootstrapping is the process of creating a golden image that contains the software and configurations that are required for the instances. 
- Basic AMI bootstrapping(partial baked AMI): The basic AMI bootstrapping is the process of creating an AMI that contains the software and configurations that are required for the instances.
- Use of user data: The user data file in an Amazon EC2 instance is a script or data that is passed to the instance during its launch. The user data file can be used to install software, configure the instance, and run scripts.




## Organizing your AWS Resources


- Use of tags : used descriptive tags to organize resources by using AWS Organizations and AWS Config will enforce the use of them.
- Use multiple accounts : use a hierarchy of accounts to organize resources
- Use Infrastructure as Code


## AWS Systems Manager (Mostly useful for fleet of instances)
Helps you maintain the security and compliance of your resources. It provides a unified user interface so that you can view operational data from multiple AWS services and allows you to automate operational tasks across your AWS resources.

- Run command : it uses a Command document is used with Systems Manager to perform tasks on our EC2 instances, such as running a script.
-  An Automation document is how we can automate tasks in AWS by calling AWS APIs, creating AMI images, running commands, and much more.
-  State manager is used to define the desired state of our instances and ensure that they are compliant with that state.
-  Patch manager is used to automate the process of patching our instances.
  

## AWS Config 
AWS Config is a service that enables you to assess, audit, and evaluate the configurations of your AWS resources. Config continuously monitors and records your AWS resource configurations and allows you to automate the evaluation of recorded configurations against desired configurations.

AWS Trail vs AWS Config : AWS trails work on the user action by logging the actions while AWS Config works on the resource configuration by monitoring the configuration changes.