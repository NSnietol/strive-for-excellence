# Scalability & High Availability

- **Scalability** is the ability of a system to handle a growing amount of work or its potential to accommodate growth.

- **Horizontal scaling** (scale out) involves adding more machines to a pool of resources, distributing the load across them.
- **Vertical scaling** (scale up) involves adding more resources to a single machine, such as CPU, memory, or storage.
- **High availability** is the ability of a system to remain operational even when some of its components fail, it means your app is at least 2 different availability zones.


## Scalability vs Elasticity vs Agility

- **Scalability** is the ability of a system to handle a growing amount of work or its potential to accommodate growth.
- **Elasticity** is the ability to automatically or dynamically increase or decrease resources as needed.
- **Agility** is the ability to rapidly and efficiently adapt to changes.


## Load Balancer(ELB)
Is a service that automatically distributes incoming application traffic across multiple targets, such as Amazon EC2 instances, containers, and IP addresses.

### Types of Load Balancers

- **Application Load Balancer (ALB)**: Best suited for load balancing of HTTP and HTTPS traffic(Layer 7). Operates at the application layer and supports path-based routing.
- **Network Load Balancer (NLB)**: Best suited for load balancing of TCP traffic where extreme performance is required. Operates at the connection level (Layer 4).
- **Gateway Load Balancer (GWLB)**: Best suited for load balancing of third-party virtual appliances. Operates at the connection level (Layer 4).