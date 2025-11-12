## 1 - what is Collection in java where we use in projects?

In Java, a **Collection** is a framework that provides an architecture to store and manipulate a group of objects.  
It includes interfaces like **List, Set, and Queue**, and classes like **ArrayList, HashSet, LinkedList**, etc.

Instead of using simple arrays — which have a fixed size and limited functionality — Collections help us handle data more efficiently because they can **grow dynamically**, **store different types of objects**, and offer **built-in methods** for searching, sorting, inserting, and deleting.

![[Pasted image 20251027190613.png]]

## 3 - What is the diff btw Array List and Linked List?

![[Pasted image 20251027190731.png]]

## 4 - What is Iterator in java?

In Java, an **Iterator** is an object that helps us **traverse or access elements one by one** from a Collection, like a List or Set.

It’s basically an **improved version of Enumeration**, with an extra feature that allows removing elements during iteration.

## 5 What is priority Queue?

In Java, a **PriorityQueue** is a special type of queue where the elements are **processed based on their priority**, not in there insertion order

Normally, a **Queue** works on a **First-In-First-Out (FIFO)** basis, but a **PriorityQueue** processes elements **according to their priority** — the element with the **highest priority** comes first.

Internally, PriorityQueue is implemented using a **heap data structure**.

The elements can be ordered either by their **natural order** (like numbers in ascending order) or by a **custom Comparator** that we define when creating the queue.

![[Pasted image 20251027195202.png]]

![[Pasted image 20251027195220.png]]



