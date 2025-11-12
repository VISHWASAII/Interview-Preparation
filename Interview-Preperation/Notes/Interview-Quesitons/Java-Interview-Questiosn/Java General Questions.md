## 1- What is java?
```
Java is a high-level, object-oriented, and platform-independent programming language.which is Created by sun micro system in 1995 by james Gosling.

It follows the concept of ‘write once, run anywhere,’ which means Java programs can run on any Opreating System which contain JVM

And java is more secure, Fast and Reliable 
programming language

it is used to develop Mobile application, Desktop Application, webserver and  web applications
```

## 2 - Access Specifier?


```
Access specifiers, also known as access modifiers, are keywords in Java that control the visibility and accessibility of classes, methods, and variables.

- There are four types of access modifier
- one - public - Accessible from any class, regardless of package.
- two - private -  Accessible only within the class in which it is declared.
-three - protected - Accessible within the same package and by subclasses in other packages.
- four - default - access within same pack
```

## 3 - what is Method?

```
method is a block of code used to perform certain task which is also known as fucntion and you can pass data into method it is called parameter


there are 7 type of methods which is 
- System defined = methods which is packed with the programming language

- user defined = block of is written by a programmer

- overloaded method
- overrided method

- static method =  static method is a method associated with the class itself rather than with any specific instance (object) of that class

- final method = `final` method is a method that cannot be overridden by its subclasses

- Abstract method = An abstract method in Java is a method declared without an implementation.
```

## 4 - What is Main method?

```
It is a entry Point of a java program
```


## 5 - Explain the Main method?

```
The strucutre of main method

Public - Assisable from any class regardless of package

static - Main method always static so that jvm can run a method without creating an object

void means the method **does not return anything.

main - jvm look for main to execute which is the entry point of program

(String[] args) - which will take list of string as arguments when the program execution. so it is called command-line argument.
```

## 6 - Explain static keyword?

- **`static`** is a **keyword in Java** that means the member **belongs to the class**, not to any object.
    
- If a **class, method, or variable** is declared with `static`, it can be **accessed directly using the class name**.
    
- This means we can **access it without creating an object** of the class.

## 7 - What is constructor in java?

```
A constructor is a special method
it is automatically called when a new object of the class is instantiated.  

It has the same name as the class and doesn't have a return type (not even `void`). 

They are crucial for setting initial values to the object's attributes and ensuring the object is in a valid state.

There are 3 type of Constructor

1 - No argument Constructor
2 - Parameterized Constructor
3 - Default Constructor
```

## 8 - what is the diff btw constructor and Method
![[Pasted image 20251020191056.png]] 

## 9 - what is a final Variable?
```
Final is a keyword in java

if a variable is declered with final it cannot be override and modified 

and if we declear a method as final, then it cannot be overriden by an subclasses.
```

## 10 - what is package in java?

```
A package in java is used to collection related class. also used to avoid name conflicts btw class. and it allows to write a better maintainable code

There are two types of Packages

1) Build in Packages
2) user Defined packages
```

## 11 - What all the main Feature of java?
```
The main feature of java is 

- Platform Independent
    
- Object-Oriented
    
- Secured
    
- Multithreaded
    
- Robust
  
Programming language
  
```

## 12 - What is difference between Java and c++?

![[Pasted image 20251024102436.png]]

## 13 - what is java String pool?

```
The Java String Pool is a special area in the heap memory where all string literals are stored. When a new string is created, the JVM first checks if an identical string already exists in the pool. If it does, the same reference is reused; otherwise, a new string object is created and added to the pool. The variable referencing the string is stored separately in the stack.
```

## 14 - What is diff btw Instance and Local Variable

![[Pasted image 20251025195718.png]]

## 15 - What is the diff btw Input stream and output stream

**The main difference is:**

- **InputStream/OutputStream** are used for **binary data** (like images, audio, or any raw bytes).
    
- **Reader/Writer** are used for **character data** (like text files, strings, etc.).
    

Streams deal with **bytes**, while Readers and Writers deal with **characters**.

## 16 - Difference btw String and String Buffer?

![[Pasted image 20251025200253.png]]


## 17 - What is the Difference Btw String buffer and String builder?

![[Pasted image 20251025200437.png]]

## 18 - Why String buffer is Mutable ?

```
StringBuffer is called mutable because it allows changes to the contents of a string after the object is created, without creating a new object each time.
```

## 19 - What is object class in java?

Every class in Java **automatically inherit** from `Object class`, either directly or indirectly and it is also called Super class.
 The Object class provides several methods such as  toString(),equals(), hashCode() and many others.

## 20 - what is the diff btw == and equals() Method?

```
== - That is used to compare reference or memory address of two objects which point to same location in memory

equals() - Compares the actual data or content of two objects 
```

## 21 - What is hashCode()?

The `hashCode()` method in Java returns a **unique number (integer)** for each object.  
It’s used to **identify objects** when working with collections like **HashMap**, **HashSet**, or **Hashtable**.

## 22 - what is Clone() method in java?

The `clone()` method in Java is used to **create a copy of an existing object**.  
It makes a **new object** with the **same values** as the original one.


## 23 - what is the diff btw final, finally and Finalize()?

- **`final`** → A keyword used to **restrict modification** of variables, methods, or classes.
    
- **`finally`** → A block used in **exception handling** that **always executes** after the try-catch block, usually for cleanup.
    
- **`finalize()`** → A method called by the **garbage collector** before an object is destroyed to perform **cleanup operations**.

## 24 - Why java doesn't support Global variable?

Procedural oriented programming example i need to say 

## 25 - what is 'this' keyword in java?

**`this` keyword in Java** is a **reference to the current object** of a class.  
It is used to **refer to instance variables, methods, or constructors** of the current object.```

