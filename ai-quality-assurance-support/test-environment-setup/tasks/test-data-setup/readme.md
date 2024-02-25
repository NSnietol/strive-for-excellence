Using ChatGPT, prepare an SQL script to add data that will be used for automated smoke testing purposes. The script should insert ten records in DMBS (PostgreSQL, MySQL, Oracle, or any other DMBS available). The structure of the table must correlate with the provided model:

Order{
id integer($int64)
petId integer($int64)
quantity integer($int32)
shipDate string($date-time)
status string
Order Status
Enum:
[ placed, approved, delivered ]
complete boolean
}
Copy
Acceptance Criteria
Below are the acceptance criteria:

The prompt to ChatGPT should be well-structured (using the CREATE framework) and receive a score of no less than 5 points from the AI Evaluation Tool below.
The prompt should clearly specify the targeted DBMS.
The test data should include at least three different types of pets.
The output must contain at least ten records.
The shipDate values need to refer to dates in the future unless the status is 'delivered'.
The quantity values must be positive.
Each id value must be unique.




---- solution ---

    Act as a QA who is highly expert in test data creation.
    Please generate test data for Order application testing.
    Populate test data in tabular form. Adhering the next model:
        Order{
        id integer($int64)
        petId integer($int64)
        quantity integer($int32)
        shipDate string($date-time)
        status string
        Order Status
        Enum:
        [ placed, approved, delivered ]
        complete boolean
        }

    Use the following acceptance criteria:
    - The should be at least ten records.
    - The test data should include at least three different types of pets.
    - The output must contain at least ten records.
    - The shipDate values need to refer to dates in the future unless the status is 'delivered'.
    - The quantity values must be positive.
    - Each id value must be unique.