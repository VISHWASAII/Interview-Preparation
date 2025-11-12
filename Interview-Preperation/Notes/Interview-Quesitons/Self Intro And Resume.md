
## Self Introduction?
```
> Thank you for this opportunity.  
> My name is Sai Vishwa, and I’m from Vellore, Tamil Nadu. I completed my Integrated M.Tech in Software Engineering at VIT with a CGPA of 8.20.  
> I recently did my internship at Genpact as a Data Engineer, where I worked on Spring Boot, React, Docker, and Kubernetes, and also implemented a CI/CD pipeline in AWS. I contributed to some production applications during my internship.  
> My father is a goldsmith, my mother is a homemaker, and my sister is a dentist.  
> so, I’m looking for an opportunity where I can showcase my skills and learn new technologies.
> That’s all about me. Thank you
```

## What projects you worked on?

During my internship, I worked on a **Software Ticket Management System** using **Java Spring Boot** and **React.js**.  
It was a **microservices application** with four services — **User, Admin, Manager, and Infosec**.

I used **Apache Kafka** and the **Saga choreography pattern** to handle communication between the services.  
When a user sends a software request, it goes to the Admin, then the Manager, and finally to Infosec for approval.  
If anyone rejects the request, the system automatically rolls back the previous actions.

This project helped me learn **microservices, Kafka, and handling distributed transactions**.




## Project - 1

```
The Smart Logistics Tracking Platform is a microservices-based system for managing and tracking orders in real time.

i build it using java spring boot, Postgres as a database

And it has two main services:

- Order  Service – responsible for order management and courier assignment.
    
- Track  Service – responsible for Location tracking and Live update
  
I used serveral technology for this application 

API Gateway
All requests go through an **API Gateway**, which handles **JWT authentication**, routing, and CORS, making the system secure and scalable.

Kafka
**Kafka** is used for event-based communication between services, 

GRPC
and **gRPC** helps with fast, real-time location updates.  

Validation and tracing
For validation i used spring validation and for tracing i used zipkins
```

## Project - 2

```
My first project is URL Shortener application that I built using Java Spring Boot for the backend and React.js for the frontend and redis as a cache.
```
**First Endpoint – URL Shortening:**

- When a user sends a **long URL**, the system **generates a short and unique URL** for it.
    
- It then **stores the short URL and long URL as a key–value pair** in the **database**.
    

**Second Endpoint – Redirection Service:**

- When someone accesses the **short URL**, the system first **checks the Redis cache** to see if the key (short URL) is present.
    
- If the key is found in Redis, it **retrieves the long URL** directly from the cache and **redirects the user**.
    
- If the key is **not found in Redis**, it **queries the database**, gets the corresponding **long URL**, **stores it in Redis** for future requests, and then **redirects the user** to the original URL.

## Project - 3

My Third project is RAG application 

**First Endpoint – Document Upload:**

- The user **uploads a document** (PDF) through the application.
    
- The system **extracts text** from the PDF using **PyPDF2**.
    
- The extracted text is **split into smaller chunks** using **Sentence Transformers** for better semantic handling.
    
- Each chunk is **converted into a vector** using the **GPT-4O model**.
    
- The chunks and their vectors are **stored in a vector database** for fast similarity search.
    

**Second Endpoint – Query Handling:**

- When a user **sends a query**, the system **converts the query into a vector**.
    
- It performs a **similarity search in the vector database** to retrieve the most relevant chunks.
    
- The retrieved chunks are sent to the **AI model** to generate a **context-aware and accurate response**.

## Aws ci cd pipeline

- I implemented a **CI/CD pipeline** using **AWS CodeCommit, CodeBuild, CodeDeploy, and EC2**.
    
- **Step 1 – Code Upload:** When I **push my Spring Boot code** to **CodeCommit**, it triggers the pipeline.
    
- **Step 2 – Build:** The pipeline sends the code to **CodeBuild**, which **builds the project** and **generates a JAR file**.
    
- **Step 3 – Deployment:** The generated JAR file is then sent via **CodeDeploy** using the pipeline.
    
- **Step 4 – EC2 Deployment:** CodeDeploy **deploys the JAR file** to an **EC2 instance**, making the application live.


## Azure CI CD Pipeline

- **Code Repository:** Push your application code to **GitHub**.
    
- **CI Pipeline (Build):**
    
    - Set up an **Azure DevOps pipeline** that **pulls the code** from GitHub.
        
    - It **builds the project** (for example, compiles Java code or builds a React app).
        
    - The **artifact** (e.g., JAR, WAR, or build folder) is stored for deployment.
        
- **CD Pipeline (Deploy):**
    
    - Use the **Release Pipeline** to deploy the artifact to the **Azure Virtual Machine**.
        
    - This can be done using **SSH or WinRM tasks** to copy files and start the application.