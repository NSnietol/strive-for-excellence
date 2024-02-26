# Test Data Creation
AI tools can offer guidance on generating realistic and relevant test data, considering various data types, boundary conditions, and corner cases that might affect the software's functionality.


- Prepare database-driven test data for testing a story.

    ```
    Act as a Data Analyst.

    Prepare a SQL Insert script in MS SQL format to create 5 records in the Masters Table and 10 records in the Groomings table.

    Table definition:

    -- Masters table 
    CREATE TABLE Masters ( 
        master_id INT PRIMARY KEY, 
        master_name VARCHAR(50) 
    ); 
    -- Groomings table 
    CREATE TABLE Groomings ( 
        grooming_id INT PRIMARY KEY, 
        date DATE, 
        start_time TIME, 
        end_time TIME, 
        grooming_type VARCHAR(50), 
        client VARCHAR(50), 
        master_id INT 
    );

    ```


    When using a conversational AI tool to generate DB-driven test data, you must provide explicit context and instructions to guide the generated output. In particular, consider specifying the following details:

    - Desired DBMS (e.g., MS SQL, Oracle, PostgreSQL)
    Table structure, including table names and column details
    - Any constraints or data rules (such as primary and foreign keys, unique constraints, and allowed value ranges)
    - Realistic data guidelines (e.g., appropriate format for email addresses, phone numbers, names, or addresses)
    - Any patterns and conditions to ensure a closer resemblance to real-world information
-  Prepare test data for adding items through the API endpoint.

```
    Act as a Data Analyst. Prepare test records in JSON format according to the contract.

    Example:

    { 
    "category": { 
        "id": 0, 
        "name": "string" 
    }, 
    "name": "doggie", 
    "photoUrls": [ 
        "string" 
    ], 
    "tags": [ 
        { 
        "id": 0, 
        "name": "string" 
        } 
    ], 
    "status": "available" 
    }.
    Prepare 3 records with the status “available”, 2 records with the status “pending”, and 1 record with the status “sold”. Use ‘lizard’ as category.name. Add 2-3 words on nature (wild, friendly, etc.) as tags.name.
```
- Prepare SQL injection payloads to test a web application's security.
  
    ```
    Act as a security QA who needs to check the system.

    Generate a list of SQL injection payloads that can be used to manipulate a SQL query in a web application's search field.

    The payloads should include variations of SQL statements such as UNION-based, Boolean-based, and time-based attacks.
    Ensure that the generated payloads are representative of real-world attack vectors.
    Application stack: PostgreSQL as DBMS, API Java Backend, ReactJS as frontend.
    ```
    When using an AI tool to generate malicious input data or commands, such as SQL injection payloads, for security testing, craft prompts using the following guidelines to ensure accurate and relevant results:


    - Clearly define the role and task you want the AI tool to perform. If you omit this element of the CREATE framework or suggest a role that implies malicious intent, the tool will decline to proceed with the request.
    - Include specific details and criteria to prevent misinterpretation. For example, adding "The payloads should include variations of SQL statements..." and "Ensure that the generated payloads are representative of real-world attack vectors" enables you to obtain realistic payloads rather than random generic examples.
    - Specify the technologies involved ("Application stack...") to obtain output in the desired format without explicitly indicating it.
- Prepare malformed input data to test a web application's security.

    ```
    Act as a security QA who needs to check the healthcare system.
    Generate malformed input data payloads for different input fields in a web application.

    Page elements:
    The member records will be displayed in a vertical list format, with each record containing the following UI elements:

    - Member name: This field will display the member's full name.
    - Member ID: This field will display the unique identifier of the member.
    - Gender: This field will display the gender of the member.
    - Birth date: This field will display the birth date of the member.
    - Age: This field will display the age of the member.

    Payloads should include excessively long input, non-standard characters, and input that doesn't conform to expected patterns.
    Evaluate the application's behavior and error handling when subjected to such inputs.
    Application stack: PostgreSQL as DBMS, API Java Backend, ReactJS as frontend.
    ```
    To generate malformed data payloads for filling different input fields in web application testing, always specify these fields and include the corresponding description (if applicable) to obtain accurate and realistic results. 