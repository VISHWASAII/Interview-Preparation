
## How Java program Executed?

- What all are three main components of java?
```
the three component of Java is [Jvm, Jre, Jdk]
```
- Why java called Platform Independent?
```
Java is platform-independent because the compiled bytecode can run on any system that has a JVM, regardless of the underlying operating system or hardware.
```
- What is JVM?
```
A Java Virtual Machine (JVM) is a virtual machine that enables computers to run Java programs.
```
- What is JVM work flow?
```
Java Program -> [Compiler] --> Bytecode -->[Jvm] --> Machine Code --> [CPU] --> output

workFlow 
Firstly, Java program which is compiled into bytecode

Secondly, Bytecode will converted into machine code 

Thirdly,  Machine code run top of the CPU and it will provide the output
```
- What is JRE?
```
JRE contains JVM and class Libraries. 
Using the JRE we can run the java program but we cannot code the program
```
- What is JDK?
```
JDK which has the programming language information
And it has the compiler {javac}
And it has debugger
```
- Why in java we have only one public class?
```
JVM is going to invoke the main method. so that class modifier need to be public

It need to be single entry point
```


## Execution Of Java program

For program Execution java has three main components

---

### 🧰 **1. JDK (Java Development Kit)**

**What it is:**  
JDK which is software that is used to  **write** and **build** Java programs.

``IT HAS``

- A **compiler (`javac`)** – which will convert Java code into bytecode. then it has tools
    
- **Tools** like debugger and documentation helpers.
    
- The **JRE** (so you can also run programs).
    

**Why it’s used:**  
To **create**, **compile**, and **test** Java programs.

---

### ⚙️ **2. JRE (Java Runtime Environment)**

**What it is:**  
The JRE gives the **environment** that’s needed to **run** Java programs.


-  It will provide Libraries and supporting files That is needed during execution.

- The **JVM** – runs the bytecode.

**Why it’s used:**  
It’s used to **run** Java programs, but you **can’t write or compile** code with just the JRE.

---

### 🧠 **3. JVM (Java Virtual Machine)**

**What it is:**  
The JVM is like a **middleman** between your program and the computer.  
It takes the **bytecode** and turns it into **machine code** that the computer can understand.

That is why java called program independent once we compile the code then we can execute on any operating system which has JVM.

