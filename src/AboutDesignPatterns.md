# Design Patterns Overview

Design Patterns are **reusable solutions to common software design problems** that occur during software development.  
They represent **best practices used by experienced developers** to design flexible and maintainable systems.

Design patterns help developers to:

- Write **clean and maintainable code**
- Reduce **code duplication**
- Improve **system architecture**
- Increase **reusability and scalability**

---

# Categories of Design Patterns

Design patterns are broadly classified into **three main categories** based on their purpose.

```
Design Patterns
│
├── Creational Patterns
│
├── Structural Patterns
│
└── Behavioral Patterns
```

| Category | Focus | Goal |
|--------|--------|--------|
| Creational | Object creation | Flexible object instantiation |
| Structural | Class/Object composition | Efficient system structure |
| Behavioral | Object communication | Clear responsibility distribution |

---

# 1. Creational Design Patterns

## Overview

Creational design patterns focus on **object creation mechanisms**.  
Instead of creating objects directly using constructors (`new` keyword), these patterns **encapsulate the creation process**.

This allows systems to be **more flexible and independent from specific implementations**.

---

## Key Idea

```
Client → Creation Mechanism → Object
```

The client does not directly create objects but uses **abstraction layers**.

---

## Key Aspects

### Encapsulation of Object Creation
The process of creating objects is **hidden from the client code**.

### Controlled Instantiation
Objects are created **only when needed** or under certain conditions.

### Decoupling
Client code depends on **interfaces or abstract classes** instead of concrete classes.

### Object Lifecycle Management
Helps manage:

- single instances
- complex construction
- cloning objects

---

## Why Use Creational Patterns?

Use creational patterns when:

- Object creation becomes **complex**
- The system must be **independent of how objects are created**
- You need to **control object instantiation**
- You want to **reduce tight coupling**

---

## Common Creational Patterns

| Pattern | Purpose |
|-------|-------|
| Singleton | Ensures only one instance of a class exists |
| Factory Method | Creates objects without specifying exact classes |
| Abstract Factory | Creates families of related objects |
| Builder | Constructs complex objects step by step |
| Prototype | Creates objects by cloning existing instances |

---

## Benefits

- Improved **code flexibility**
- Better **encapsulation**
- Easier **object management**
- More **maintainable systems**

---

# 2. Structural Design Patterns

## Overview

Structural design patterns deal with **how classes and objects are organized and combined** to form larger structures.

They simplify relationships between components and help developers **build complex systems efficiently**.

---

## Key Idea

```
Objects + Relationships → Larger System Structure
```

Structural patterns focus on **how objects connect and interact structurally**.

---

## Key Aspects

### Class Composition
Uses **inheritance** to combine behavior.

### Object Composition
Uses **object references** to build flexible relationships.

### Interface Simplification
Provides **simple interfaces to complex subsystems**.

### Flexible Architecture
Allows developers to **modify structure without changing core code**.

---

## Why Use Structural Patterns?

Use structural patterns when:

- You need to **combine multiple classes or objects**
- The system architecture becomes **complex**
- You want to **reuse existing components**
- You need **flexible relationships between objects**

---

## Common Structural Patterns

| Pattern | Purpose |
|-------|-------|
| Adapter | Allows incompatible interfaces to work together |
| Bridge | Separates abstraction from implementation |
| Composite | Treats individual objects and compositions uniformly |
| Decorator | Adds functionality dynamically |
| Facade | Provides simplified interface to complex system |
| Flyweight | Reduces memory usage by sharing objects |
| Proxy | Controls access to another object |

---

## Benefits

- Improved **code organization**
- Better **system scalability**
- Simplified **class relationships**
- Easier **maintenance**

---

# 3. Behavioral Design Patterns

## Overview

Behavioral design patterns focus on **communication between objects** and how responsibilities are distributed.

They help define **clear interaction patterns** between components in a system.

---

## Key Idea

```
Object A → Communication → Object B
```

Behavioral patterns manage **how objects interact and collaborate**.

---

## Key Aspects

### Communication Between Objects
Defines how objects **exchange information and messages**.

### Responsibility Distribution
Ensures responsibilities are **assigned efficiently across objects**.

### Loose Coupling
Objects interact without **strong dependencies**.

### Dynamic Behavior
Behavior can be **changed at runtime**.

---

## Why Use Behavioral Patterns?

Use behavioral patterns when:

- Object interactions become **complex**
- Responsibilities need **clear separation**
- You want to **reduce tight coupling**
- System behavior must be **flexible**

---

## Common Behavioral Patterns

| Pattern | Purpose |
|-------|-------|
| Chain of Responsibility | Passes request along a chain of handlers |
| Command | Encapsulates a request as an object |
| Interpreter | Implements language grammar |
| Iterator | Sequentially accesses elements |
| Mediator | Reduces direct communication between objects |
| Memento | Saves and restores object state |
| Observer | Notifies dependent objects of changes |
| State | Changes behavior when state changes |
| Strategy | Defines interchangeable algorithms |
| Template Method | Defines algorithm skeleton |
| Visitor | Adds operations without modifying classes |

---

# Visual Summary

```
                Design Patterns
                       │
     ┌─────────────────┼─────────────────┐
     │                 │                 │
 Creational        Structural        Behavioral
     │                 │                 │
 Object Creation   Object Structure   Object Interaction
```

---

# Conclusion

Design patterns are essential for building **robust, scalable, and maintainable software systems**.

Understanding the **three major categories** helps developers:

- Choose the **right design approach**
- Build **flexible architectures**
- Improve **code quality**

Mastering these categories forms the **foundation for advanced software design**.