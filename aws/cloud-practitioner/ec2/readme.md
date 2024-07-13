
## EC2 

### What is EC2?
it's a web service that provides resizable compute capacity in the cloud. It's designed to make web-scale cloud computing easier for developers.

### EC2 Instance Types
- **General Purpose** : Provides a balance of compute, memory, and networking resources.
- **Compute Optimized** : (HPC)Ideal for compute-bound applications that benefit from high-performance processors such as gaming servers, media transcoding, and high-performance computing.
- **Memory Optimized** : (DB)Designed to deliver fast performance for workloads that process large data sets in memory such as real-time processing of unstructured data and high-performance databases.
- **Storage Optimized** : (OLTP)Designed for workloads that require high, sequential read and write access to very large data sets on local storage such as data warehousing applications and high-frequency online transaction processing (OLTP) systems.

### Security Groups
- A security group acts as a virtual firewall for your instance to control inbound and outbound traffic.  It stablish if a traffic is allowed, by default all inbound traffic is denied and all outbound traffic is authorized.

## Key ports to know
- **SSH** : 22
- **FTP** : 21
- **SFTP** : 22
- **HTTP** : 80
- **HTTPS** : 443
- **RDP** : 3389 (Remote Desktop Protocol)


## EC2 Instance connect
- It's a simple and secure way to connect to your instances using Secure Shell (SSH). It eliminates the need to use bastion hosts, Elastic IP addresses, or port forwarding.


## EC2 Instance Purchasing Options

- **On-Demand Instances** : Pay for compute capacity by the second with no long-term commitments, for short workload, predictable workloads that require the lowest cost.
- **Reserved Instances** : (1 & 3 year contract). Reserved Instances are a good choice if you have steady state usage or can predict your compute capacity needs.
    - **Standard Reserved Instances** : (up to 75% off on-demand). long workloads that require a specific instance type.
    - **Convertible Reserved Instances** : (up to 54% off on-demand). They can be exchanged for another Reserved Instance with different instance family, operating system, or tenancy.
- **saving plan** : (1 & 3 year contract). The commitment is made in dollars per hour instead of instances.
- **Spot instance** : short workload and for applications that have flexible start and end times.
- **Dedicated Hosts** : Physical servers dedicated for your use. Useful for regulatory requirements that may not support multi-tenant virtualization.
- **Dedicated Instances** : Instances running on hardware that's dedicated to a single customer.
- **Capacity Reservations** : Reserve capacity for your EC2 instances in a specific Availability Zone for any duration( You are charged even when you don't use it the schedule capacity).