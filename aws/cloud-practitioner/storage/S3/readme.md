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