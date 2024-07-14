# S3
It's a object storage service that offers industry-leading scalability, data availability, security, and performance.

* It's billed based on the storage you use.
* It's a regional service. 
* The maximum object size is 5TB other than that you need to use the Multipart upload API.

## S3 Security

* IAM Policies - which API calls should be allowed for a specific user.
* Bucket Policies - bucked wide rules from the S3 console.
* Access Control Lists (ACLs) - fine-grained control over objects in your bucket.
* Bucket Access Control Lists (ACLs) - fine-grained control over buckets.
* Encryption - in transit and at rest.
* Public access will only be granted if you explicitly allow it on public access settings + bucket policy.


## Versioning

Is a best practice to enable versioning on your S3 buckets. It stores all versions of an object (including all writes and even deletes).


## Replication (CRR and SRR)

* Cross-Region Replication (CRR) - for compliance, lower latency, or disaster recovery.
* Same-Region Replication (SRR) - for log aggregation, live replication between production and test accounts.



## Storage Classes

- S3 Standard - 99.99% availability, 11 9's durability, stored redundantly across multiple devices in multiple facilities, and is designed to sustain the loss of 2 facilities concurrently.


- S3 IA (Infrequent Access) - for data that is accessed less frequently, but requires rapid access when needed. Lower fee than S3, but you are charged a retrieval fee. Use cases : backups, disaster recovery, etc.
  

- S3 One Zone-IA - for where you want a lower-cost option for infrequently accessed data but do not require the multiple Availability Zone data resilience.

- S3 Glacier - very cheap, but used for archival only. Expedited, Standard, or Bulk retrievals. Retrieval times configurable from minutes to hours.

- S3 Glacier Deep Archive - lowest cost storage class where a retrieval time of 12 hours is acceptable. Use cases: compliance, long-term backups.

- S3 Glacier Instance Retrieval - allows you to retrieve data from S3 Glacier in milliseconds.

- S3 Intelligent Tiering - designed to optimize costs by automatically moving data to the most cost-effective access tier, without performance impact.


## Lifecycle Policies
These are rules that you can set up to manage your data in S3. You can use them to transition objects to different storage classes, archive them, or delete them after a certain period of time.

## S3 Encryption

Server-Side Encryption: By default, Amazon S3 encrypts your data at rest. You can use SSE-S3, SSE-KMS, or SSE-C.

Client-Side Encryption: You encrypt the data client-side and upload the encrypted data to S3.


## IAM Access Analyzer for S3

This tool helps you identify S3 buckets that are publicly accessible due to bucket policies or access control lists (ACLs). It also helps you identify buckets that allow access from other AWS accounts.



# AWS Snow Family

It's a family of physical devices that help you transfer large amounts of data into and out of AWS and process data at the edge. It includes Snowcone, Snowball, and Snowmobile devices, plus Snowcone Edge and Snowball Edge Computing Optimized devices.


- Snowball edge. it comes in two flavors: Storage Optimized and Compute Optimized. It's used for data migration, edge computing, and storage. Their capacity is 80TB and 42TB respectively.

- Snowcone is the smallest member of the Snow Family. It's used for edge computing, storage, and data transfer. It has a capacity of 8TB or 12TB, and 4GB of memory. You can use AWS DataSync to transfer data to Snowcone.

- Snowmobile : 100 PB of capacity.


## AWS OpsHub

It's a graphical user interface that helps you manage your Snow Family devices.

## AWS Storage Gateway

It's a hybrid cloud storage service that gives you on-premises access to virtually unlimited cloud storage. It's a software appliance that you install on your on-premises hardware. It supports three types of storage: file, volume, and tape.
