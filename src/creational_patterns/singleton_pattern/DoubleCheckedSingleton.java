package creational_patterns.singleton_pattern;

/*
1️⃣ Thread-Safe Double-Checked Locking Singleton
Problem it Solves-------------
A basic lazy Singleton:

if(instance == null)
    instance = new Singleton();

is not thread-safe. Two threads could create two objects simultaneously.

Using synchronized fixes it but reduces performance because every call locks the method.

Double-checked locking synchronizes only when needed.
 */
public class DoubleCheckedSingleton {

}
