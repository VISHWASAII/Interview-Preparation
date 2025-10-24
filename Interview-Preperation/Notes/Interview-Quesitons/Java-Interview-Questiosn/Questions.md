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
it is automatically called when a new object of the class is instantiated.  It has the same name as the class and doesn't have a return type (not even `void`). They are crucial for setting initial values to the object's attributes and ensuring the object is in a valid state.

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
A package in java is used to group related class. also used to avoid name conflicts btw class. and it allows to write a better maintainable code

There are two types of Packages

1) Build in Packages
2) user Defined packages
```

## 11 - what is abstract and interface?

