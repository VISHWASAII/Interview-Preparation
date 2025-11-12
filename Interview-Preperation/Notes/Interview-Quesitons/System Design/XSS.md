## 🧠 What is XSS? and Cors


[](https://github.com/VISHWASAII/Obsidian_Notes/blob/master/LEARNING/Backend%20Concepts/05%20-%20Cross%20site%20scripting%20\(xss\).md#-what-is-xss)

**Imagine this:**

You visit a website that allows users to post comments. Someone posts a comment that contains **malicious JavaScript code** instead of just text. When you view the comment, that code runs in your browser — stealing your cookies, redirecting you, or showing fake messages.

## 🔐 How to Prevent XSS?

[](https://github.com/VISHWASAII/Obsidian_Notes/blob/master/LEARNING/Backend%20Concepts/05%20-%20Cross%20site%20scripting%20\(xss\).md#-how-to-prevent-xss)

1. **Sanitize user input:** Remove or escape dangerous tags like `<script>`.
    
2. **Use Content Security Policy (CSP):** Restrict where scripts can run from.
    
3. **Encode output:** When showing user data, escape special characters.
    
4. **Use frameworks that auto-escape output:** Like React or Angular.

