## 1 - What is DBMS?

``` 
DBMS is a sw which is used to maintain and manage the database. we use query language to interact or communicate with dbms

dbms provides 2 important factors that is Security and Authorization

Dbms Stores the data in the form of files
```

## 2 - What is database?

```
Db is a place or medium where we store a data in a systematics and organized manner the basic operation that can be performed on a db is 

1 - create
2 - read
3 - update
4 - Delete
```

## 3 - What is diff btw RDBMS and DBMS

**DBMS (Database Management System):**

- It is software used to maintain and manage the database.
    
- Data can be stored in files, but there are **no relationships** between the data.
    
- Example: **Microsoft Access**, **File System**, **FoxPro**
    

**RDBMS (Relational Database Management System):**

- It is an advanced type of DBMS that stores data in **tables (rows and columns)**.
    
- Tables are **related** to each other using **keys** (primary key, foreign key).
    
- Example: **MySQL**, **Oracle**, **PostgreSQL**, **SQL Server**

## 4 - What is the difference between unique and null constraints?

- Unique Constraints:
It ensures all the values in the column is Distinct (no Duplicates)

- NULL Constraints:
it ensures values in the columns not null

## 5 - What is degree of Relation?

```
Degress of Relation represent Number of attributes in a table
```

## 6 - What is Indexes in dbms?

An **index** is a data structure that helps the database **find and access data faster**, without scanning the entire table.

## 7 - What is the difference between where and having clauses?

**WHERE clause:** Filters rows **before** any grouping or aggregation is done.

**HAVING clause:** Filters groups or aggregated results **after** the grouping is done.

## 8 - What do you mean by transaction?

A **transaction in DBMS** is a **sequence of operations performed as a single logical unit of work**.

It ensures that either **all the operations are completed successfully**, or **none of them are applied**, maintaining data accuracy and consistency

## 9 - what is Query Optimization?

**Query optimization** is the process of **choosing the most efficient way to execute a database query**.

## 10 - what is E-R Model ?

The **E-R model (Entity-Relationship model)** is a **conceptual data model** used to describe relationship btw two tables.

## 11 - What is data partitioning?

**Data partitioning** is the process of **dividing a large database into smaller, more manageable pieces** called partitions.

which helps to **improve performance, manageability, and scalability** of a database.

## 12 - What is diff btw Normalization and De-normalization?

### **Normalization:**

- The process of **organizing data in a database** to **reduce redundancy and improve data integrity**.
    
- It usually involves dividing a table into **smaller tables** and defining relationships between them.
    

✅ **In short:**

> Normalization = **removing redundancy and structuring data efficiently**.

---

### **Denormalization:**

- The process of **combining tables** or **adding redundant data** to improve **query performance**.
    
- It is done **for faster data retrieval**, even if it introduces some redundancy.
    

✅ **In short:**

> Denormalization = **adding redundancy to make queries faster**.



## 13 - what is candidate Key?

A ****Candidate Key**** is a set of one or more attributes that can uniquely identify a table in a relation. A relation can have multiple candidate keys, and one of them is chosen as the primary key.
