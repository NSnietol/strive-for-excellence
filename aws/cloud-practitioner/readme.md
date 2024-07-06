# Cloud computing

## What is cloud computing?
It is the on-demand delivery of IT resources and applications via the internet with pay-as-you-go pricing.

## Deployment models
- Public cloud
- Private cloud : dedicated to a single organization, meet specific business needs.
- Hybrid cloud : mix of on-premises, private cloud, and public cloud services.

## Characteristics
- On-demand self-service
- Broad network access
- Resource pooling : multiple users share the same physical resources(still isolated)
- Rapid elasticity : scale up or down
- Measured service : pay for what you use

## Advantages
- Trade capital expense for variable expense
- Benefit from massive economies of scale
- Stop guessing capacity
- Increase speed and agility
- Stop spending money running and maintaining data centers
- Go global in minutes

## Types of cloud computing
- Infrastructure as a Service (IaaS) : Raw computing resources such as network. storage, and virtualization.
- Platform as a Service (PaaS) : Tools and services to develop, test, and deploy applications.
- Software as a Service (SaaS) : Software that is available via a third-party over the internet.

## Pricing of Cloud
- Compute : pay for the time your code runs
- Storage : pay for the amount of data stored
- Data transfer : pay for the data transferred out of the cloud

### AWS Regions
- Geographical area with multiple data centers( Three or more availability zones)
- How to choose a region?
    - #### Compliance
    - Proximity
    - Services
    - Pricing

### AWS Availability Zones
Is one or more discrete data centers with redundant power, networking, and connectivity in an AWS region.

### AWS Edge Locations
Are endpoints for AWS which are used for caching content. Typically this consists of CloudFront, Amazon's content delivery network (CDN).

### AWS Services

Most of the services are region based but there are four services that are global:
- IAM
- Route 53
- CloudFront
- WAF

## Shared Responsibility Model
- AWS is responsible for the security of the cloud (hardware, software, networking, and facilities)
- The customer is responsible for security in the cloud (data, applications, identity, and access management)