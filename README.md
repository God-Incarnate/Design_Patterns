# Design Patterns

A comprehensive Java implementation of Gang of Four (GoF) design patterns and other architectural patterns. This repository serves as a practical guide for understanding and implementing design patterns in real-world applications.

## Overview

Design patterns are reusable solutions to common programming problems. This project provides clear, well-documented implementations of all major design patterns, helping developers write more maintainable, scalable, and efficient code.

## Design Patterns Covered

### Creational Patterns
Patterns that deal with object creation mechanisms:

- **Singleton** - Ensure a class has only one instance and provide a global point of access
- **Factory Method** - Create objects without specifying their exact classes
- **Abstract Factory** - Create families of related or dependent objects
- **Builder** - Construct complex objects step by step
- **Prototype** - Create new objects by copying an existing object

### Structural Patterns
Patterns that deal with object composition and relationships:

- **Adapter** - Make incompatible interfaces work together
- **Bridge** - Decouple an abstraction from its implementation
- **Composite** - Compose objects into tree structures
- **Decorator** - Attach additional responsibilities to an object dynamically
- **Facade** - Provide a simplified interface to a complex subsystem
- **Flyweight** - Share objects efficiently to reduce memory usage
- **Proxy** - Provide a surrogate or placeholder for another object

### Behavioral Patterns
Patterns that deal with object collaboration and responsibility distribution:

- **Chain of Responsibility** - Pass requests along a chain of handlers
- **Command** - Encapsulate a request as an object
- **Iterator** - Access elements of a collection sequentially
- **Mediator** - Define an object that encapsulates how a set of objects interact
- **Memento** - Capture and externalize an object's internal state
- **Observer** - Define a one-to-many dependency between objects
- **State** - Allow an object to alter its behavior when its state changes
- **Strategy** - Define a family of algorithms and make them interchangeable
- **Template Method** - Define the skeleton of an algorithm in a base class
- **Visitor** - Represent an operation to be performed on elements of an object structure

### Architectural Patterns

- **MVC** - Model-View-Controller
- **Repository** - Abstract data access logic
- **Dependency Injection** - Manage object dependencies
- **Singleton Registry** - Maintain a registry of singletons

## Technology Stack

- **Language**: Java
- **JDK Version**: 8 or higher
- **IDE**: IntelliJ IDEA (recommended)

## Project Structure
```
Design_Patterns/
├── src/
│   └── com/designpatterns/
│       ├── creational/
│       │   ├── singleton/
│       │   │   ├── Singleton.java
│       │   │   ├── EagerSingleton.java
│       │   │   ├── LazySingleton.java
│       │   │   └── SingletonExample.java
│       │   ├── factory/
│       │   │   ├── Animal.java
│       │   │   ├── Dog.java
│       │   │   ├── Cat.java
│       │   │   ├── AnimalFactory.java
│       │   │   └── FactoryExample.java
│       │   ├── abstractfactory/
│       │   │   ├── UIFactory.java
│       │   │   ├── WindowsUIFactory.java
│       │   │   ├── MacUIFactory.java
│       │   │   ├── Button.java
│       │   │   ├── Checkbox.java
│       │   │   └── AbstractFactoryExample.java
│       │   ├── builder/
│       │   │   ├── House.java
│       │   │   ├── HouseBuilder.java
│       │   │   └── BuilderExample.java
│       │   └── prototype/
│       │       ├── Shape.java
│       │       ├── Circle.java
│       │       ├── Rectangle.java
│       │       └── PrototypeExample.java
│
│       ├── structural/
│       │   ├── adapter/
│       │   │   ├── Target.java
│       │   │   ├── Adaptee.java
│       │   │   ├── Adapter.java
│       │   │   └── AdapterExample.java
│       │   ├── bridge/
│       │   │   ├── Shape.java
│       │   │   ├── Color.java
│       │   │   ├── Circle.java
│       │   │   ├── RedColor.java
│       │   │   └── BridgeExample.java
│       │   ├── composite/
│       │   │   ├── Component.java
│       │   │   ├── Leaf.java
│       │   │   ├── Composite.java
│       │   │   └── CompositeExample.java
│       │   ├── decorator/
│       │   │   ├── Component.java
│       │   │   ├── ConcreteComponent.java
│       │   │   ├── Decorator.java
│       │   │   ├── ConcreteDecorator.java
│       │   │   └── DecoratorExample.java
│       │   ├── facade/
│       │   │   ├── SubSystem1.java
│       │   │   ├── SubSystem2.java
│       │   │   ├── SubSystem3.java
│       │   │   ├── Facade.java
│       │   │   └── FacadeExample.java
│       │   ├── flyweight/
│       │   │   ├── Flyweight.java
│       │   │   ├── ConcreteFlyweight.java
│       │   │   ├── FlyweightFactory.java
│       │   │   └── FlyweightExample.java
│       │   └── proxy/
│       │       ├── Subject.java
│       │       ├── RealSubject.java
│       │       ├── ProxySubject.java
│       │       └── ProxyExample.java
│
│       ├── behavioral/
│       │   ├── chainofresponsibility/
│       │   │   ├── Handler.java
│       │   │   ├── ConcreteHandlerA.java
│       │   │   ├── ConcreteHandlerB.java
│       │   │   ├── Request.java
│       │   │   └── ChainOfResponsibilityExample.java
│       │   ├── command/
│       │   │   ├── Command.java
│       │   │   ├── ConcreteCommand.java
│       │   │   ├── Invoker.java
│       │   │   ├── Receiver.java
│       │   │   └── CommandExample.java
│       │   ├── iterator/
│       │   │   ├── Iterator.java
│       │   │   ├── ConcreteIterator.java
│       │   │   ├── Collection.java
│       │   │   ├── ConcreteCollection.java
│       │   │   └── IteratorExample.java
│       │   ├── mediator/
│       │   │   ├── Mediator.java
│       │   │   ├── ConcreteMediator.java
│       │   │   ├── Colleague.java
│       │   │   ├── ConcreteColleague.java
│       │   │   └── MediatorExample.java
│       │   ├── memento/
│       │   │   ├── Memento.java
│       │   │   ├── Originator.java
│       │   │   ├── Caretaker.java
│       │   │   └── MementoExample.java
│       │   ├── observer/
│       │   │   ├── Observer.java
│       │   │   ├── ConcreteObserver.java
│       │   │   ├── Subject.java
│       │   │   ├── ConcreteSubject.java
│       │   │   └── ObserverExample.java
│       │   ├── state/
│       │   │   ├── State.java
│       │   │   ├── ConcreteStateA.java
│       │   │   ├── ConcreteStateB.java
│       │   │   ├── Context.java
│       │   │   └── StateExample.java
│       │   ├── strategy/
│       │   │   ├── Strategy.java
│       │   │   ├── ConcreteStrategyA.java
│       │   │   ├── ConcreteStrategyB.java
│       │   │   ├── Context.java
│       │   │   └── StrategyExample.java
│       │   ├── templatemethod/
│       │   │   ├── AbstractClass.java
│       │   │   ├── ConcreteClassA.java
│       │   │   ├── ConcreteClassB.java
│       │   │   └── TemplateMethodExample.java
│       │   └── visitor/
│       │       ├── Visitor.java
│       │       ├── ConcreteVisitor.java
│       │       ├── Element.java
│       │       ├── ConcreteElement.java
│       │       └── VisitorExample.java
│
│       └── architectural/
│           ├── mvc/
│           │   ├── Model.java
│           │   ├── View.java
│           │   ├── Controller.java
│           │   └── MVCExample.java
│           ├── repository/
│           │   ├── Entity.java
│           │   ├── Repository.java
│           │   ├── EntityRepository.java
│           │   └── RepositoryExample.java
│           ├── dependencyinjection/
│           │   ├── Service.java
│           │   ├── ServiceImpl.java
│           │   ├── Client.java
│           │   └── DIExample.java
│           └── servicelocator/
│               ├── Service.java
│               ├── ServiceImpl.java
│               ├── ServiceLocator.java
│               └── ServiceLocatorExample.java
│
├── tests/
│   └── com/designpatterns/
│       ├── SingletonTest.java
│       ├── FactoryTest.java
│       ├── BuilderTest.java
│       └── ... (other tests)
│
├── docs/
│   ├── CREATIONAL_PATTERNS.md
│   ├── STRUCTURAL_PATTERNS.md
│   ├── BEHAVIORAL_PATTERNS.md
│   └── ARCHITECTURAL_PATTERNS.md
│
├── .gitignore
├── pom.xml
└── README.md
```
## Getting Started

### Prerequisites
- JDK 8 or higher
- Maven 3.6+ (optional)
## ✨ Features

- **Clear Implementations** – Each pattern is implemented with clean, readable code  
- **Detailed Documentation** – Comments explaining purpose and usage  
- **Practical Examples** – Real-world scenarios for each pattern  
- **Problem-Solution Approach** – Understand the problem each pattern solves  
- **Use Cases** – When and where to use each pattern  
- **Pros & Cons** – Trade-offs for each pattern  
- **Well-Organized** – Logical folder structure matching pattern categories  

---

## 📈 Pattern Benefits

| Benefit          | Description |
|------------------|------------|
| Reusability      | Proven solutions applicable across projects |
| Maintainability  | Easier to understand and modify |
| Scalability      | Helps systems grow effectively |
| Communication    | Common vocabulary for developers |
| Best Practices   | Industry-standard solutions |

---
## 📘 How to Use This Repository

- **Learning** – Study individual patterns to understand their structure and purpose  
- **Reference** – Use as a quick reference when implementing patterns in your projects  
- **Interview Prep** – Prepare for technical interviews  
- **Teaching** – Use examples to teach team members  

---

## 🧠 Learning Path

1. **Start with Creational Patterns** – Understand object creation  
2. **Move to Structural Patterns** – Understand object composition  
3. **Study Behavioral Patterns** – Understand object interaction  
4. **Explore Architectural Patterns** – Understand system design  

---

## 🔑 Key Concepts

- **Problem-Solution** – Each pattern addresses a specific problem  
- **Applicability** – Know when to use (and when NOT to use)  
- **Consequences** – Understand trade-offs and implications  
- **Related Patterns** – See how patterns relate to each other  
- **Implementation** – Practical, working code examples  

---

## 🤝 Contributing

Contributions are welcome! You can:

- Add new pattern implementations  
- Improve existing implementations  
- Add more examples and use cases  
- Enhance documentation  
- Create UML diagrams  
- Add unit tests  
- Report issues  

---

## ✅ Best Practices

- Use patterns to solve real problems  
- Understand the pattern’s intent and applicability  
- Avoid over-engineering  
- Keep implementations simple and readable  
- Document why a pattern was chosen  

---

## ⚠️ Common Pitfalls to Avoid

- **Over-engineering** – Not every problem needs a design pattern  
- **Wrong Pattern** – Choosing the wrong pattern  
- **Complexity** – Adding unnecessary complexity  
- **Ignoring Context** – Patterns must fit your use case  
- **Lack of Understanding** – Avoid using patterns blindly

## 📌 Pattern Quick Reference

| Category       | Patterns |
|----------------|---------|
| Creational     | Singleton, Factory, Abstract Factory, Builder, Prototype |
| Structural     | Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy |
| Behavioral     | Chain of Responsibility, Command, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, Visitor |
| Architectural  | MVC, Repository, Dependency Injection, Service Locator |

---

## 📚 Resources

- **Gang of Four Book** – *Design Patterns: Elements of Reusable Object-Oriented Software*  
- **Refactoring Guru** – Design patterns with visual guides  
- **Oracle Documentation** – Java documentation and best practices  
- **Head First Design Patterns** – Easy-to-understand guide  

---

## 📄 License

MIT License — Feel free to use this for educational and commercial purposes.

---

## 👨‍💻 Author

Created and maintained by [God-Incarnate](https://github.com/God-Incarnate)
