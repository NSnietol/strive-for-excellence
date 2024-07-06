# IAM

## Users and Groups
- **Users** : End users such as employees of an organization.
- **Groups** : A collection of users under one set of permissions. _Groups only contain users, not other groups_.
- Permissions are attached to users and groups.
  
- **Policies** : A document that defines one or more permissions.
- **Roles** : A way to delegate permissions to users or services to perform actions in AWS on your behalf.   
- Inline policies are policies that are directly attached to a user or group.


## Policies

IAM Policies are written in JSON format. They consist of the following elements:
- **Version** : The version of the policy language.
- **Statement** : The main section of the policy. It consists of the following elements:
    - **Effect** : Whether the statement allows or denies access.
    - **Action** : The specific action that the policy allows or denies.
    - **Resource** : The resource to which the action applies.
    - **Condition** : The conditions under which the policy is in effect.(Optional)

## MFA

Multi-Factor Authentication (MFA) adds an extra layer of security to the login process. It requires two or more forms of authentication before granting access to an account.

Types of MFA:
- Virtual MFA device such google authenticator
- Hardware MFA device such as YubiKey
-  Hardware Key Fob and one for AWS GovCloud (US)


## CloudShell

AWS CloudShell is a browser-based shell that makes it easy to securely manage, explore, and interact with your AWS resources. CloudShell is pre-authenticated with your console credentials and comes with tools pre-installed to work with AWS resources.
