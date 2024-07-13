## EBS (Elastic Block Store)
Thinks of this as "Network USB Stick".

* they are locked to an availability zone.
* You are billed for the storage you provision.


### EBS Snapshots
* They are point-in-time backups of your EBS volumes.
* They are incremental, meaning that only the blocks that have changed since your last snapshot are moved to S3.
* They are billed according to the data stored in S3.

### Recycle Bin for EBS
* When you delete an EBS volume, it goes to the recycle bin for 30 days.

### EBS Snapshots Archive 

* You can archive your snapshots to S3 for long-term storage.

### Local EC2 Instance Store
* It's a temporary block storage for your EC2 instances.
* if you need a high performance storage, you can use this.
* Good for buffer/cache/scratch data.