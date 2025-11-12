## 1- What is Devops?

```
Devops is a sw developement Methodology that combines development (Dev) and Operations (Ops) to enable faster, Automated and more reliable sw delivery


Stages of Devops:

 **1. Build Stage**

- Developers write code and use **Git** for version control.
    
- In this stage Code is **compiled and packaged** with all dependencies.
    
- **Tools:** Git, Jenkins, Maven, Gradle.
    

🗣️ _In short:_ Write, compile, and prepare the app for testing.

---
**2. Test Stage**

- Test the application to find bugs and security issues.
    
- Types of testing:
    
    - **Unit Testing:** Small code parts
        
    - **Integration Testing:** Components work together
        
    - **Performance Testing:** Speed and scalability
        
    - **Security Testing:** Check vulnerabilities
        
- **Tools:** Selenium, JUnit, TestNG, SonarQube
    

 **3. Release Stage**

- Deploy to a **staging environment** for final checks.
    
- Deploy to production using strategies like:
    
    - **Blue-Green:** Switch between environments
        
    - **Canary:** Release to small users first
        
    - **Rolling Update:** Gradually update all users
        

The key Principles of Devops

Cultural shift
Automation
CICD
Continous Feedback
Infrastructure as code (Iac)
```


## 2 - Advantage of Devops in realtime?

if an application is deployed **without DevOps**, making changes usually causes **downtime**, and we need to redeploy the app manually.

But with **DevOps practices**, changes can be **automatically tested and deployed** to production **without downtime**, so updates are faster and more reliable.

## 2 - What are the core components of a CI/CD pipeline?
