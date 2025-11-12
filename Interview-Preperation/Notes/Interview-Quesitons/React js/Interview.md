## 1 - What is React?

ReactJS is a ****component-based**** JavaScript library used to build dynamic and interactive user interfaces. It simplifies the creation of single-page applications (SPAs) with a focus on performance and maintainability.


## 2 - What is Component-Based Architecture?

React follows a ****component-based approach****, where the UI is broken down into reusable components. These components:

- Can be functional or class-based.
- It allows code reusability, maintainability, and scalability.

## 3 - What is Virtual Dom?

React uses something called a **virtual DOM**, which is like a lightweight copy of the real web page. Instead of changing the actual page right away, React first makes updates in this virtual DOM, figures out what’s different, and then only updates the parts of the real page that need to change.

## 4 - What is the Difference btw Actual DOM and Virtual Dom?

So, the actual DOM is the real structure that the browser uses to display the web page. The problem is that updating it directly can be quite slow, because every change forces the browser to re-render parts of the page.

React solves this by using something called the virtual DOM. It’s like a lightweight copy of the real DOM that lives in memory. When something changes, React first updates the virtual DOM, compares it to the previous version to see what’s different, and then updates only those specific parts in the actual DOM. This makes updates much faster and improves performance.

## 5 - What is JSX?

React uses[****JSX****](https://www.geeksforgeeks.org/reactjs/reactjs-jsx-introduction/), a syntax extension that allows developers to write [HTML](https://www.geeksforgeeks.org/html/html-tutorial/) inside JavaScript. JSX makes the code:

- More readable and expressive.
- Easier to understand and debug.

## 6 - What is One-way Data Binding?

React uses [one-way data binding](https://www.geeksforgeeks.org/angular-js/difference-between-one-way-binding-and-two-way-binding/), meaning data flows in a single direction from parent components to child components via [props](https://www.geeksforgeeks.org/reactjs/what-are-props-in-react/). This provides better control over data and helps maintain predictable behavior.

## 7 - What is State Management?

React manages component state efficiently using the [useState hook](https://www.geeksforgeeks.org/reactjs/reactjs-usestate-hook/) (for functional components) or this.state (for class components). State allows dynamic updates without reloading the page.

## 8 - What is Hook in React?

React Hooks are functions that enable functional components to "hook into" React state and lifecycle features, Without needing class Component


The `useState` hook allows functional components to declare and manage their own local state
