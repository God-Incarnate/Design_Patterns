package structural_patterns.proxy_pattern;

/*
1️⃣ What is the Proxy Pattern?

The Proxy Pattern is a Structural Design Pattern that provides a placeholder or intermediary object that controls access to another object.

In simple terms:

A Proxy object stands in front of the real object and decides how and when the real object should be accessed.

So the client interacts with:

Proxy → Real Object

instead of directly interacting with the real object.

2️⃣ Real-Life Analogy
🏢 Security Guard Example

Suppose you want to enter a restricted office building.

You cannot directly access the building.

Instead you go through a security guard.

Visitor → Security Guard → Building

The guard may:

check identity

allow/deny access

log visitor

delay entry

The guard acts as a proxy.

3️⃣ Why Do We Need Proxy?

Sometimes directly accessing an object is expensive, unsafe, or unnecessary.

Examples:

Problem	Solution
Object creation is expensive	Lazy Proxy
Need access control	Protection Proxy
Need caching	Caching Proxy
Need logging	Logging Proxy

Proxy helps control access.

4️⃣ Structure of Proxy Pattern

Basic structure:

Client → Proxy → RealSubject

Detailed structure:

          Subject (Interface)
               |
       -------------------
       |                 |
   RealSubject        Proxy

Explanation:

Component	Role
Subject	Common interface
RealSubject	Actual object
Proxy	Controls access
Client	Uses proxy
 */
public class ProxyDemo {
    static void main(String[] args) {

        Image image = new ProxyImage("photo.jpg");

        image.display();
        image.display();
    }
}
/*
1️⃣1️⃣ Execution Flow
First Call
image.display();

Flow:

Client
   |
ProxyImage.display()
   |
RealImage created
   |
loadFromDisk()
   |
display()

Output:

Loading image: photo.jpg
Displaying image: photo.jpg
Second Call
image.display();

Now:

realImage already exists

So:

No loading happens

Output:

Displaying image: photo.jpg
1️⃣2️⃣ Final Output
Loading image: photo.jpg
Displaying image: photo.jpg
Displaying image: photo.jpg

Notice:

Image loaded only once

This is lazy loading optimization.

1️⃣3️⃣ Visual Flow
Client
  |
ProxyImage
  |
RealImage

First call:

Proxy creates RealImage

Second call:

Proxy reuses RealImage
 */
