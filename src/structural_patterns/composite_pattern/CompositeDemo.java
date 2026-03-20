package structural_patterns.composite_pattern;

/*
3️⃣ Composite Pattern
Purpose

The Composite Pattern allows treating individual objects and groups of objects uniformly.

Commonly used in tree structures.

Structure
Component
   |
Leaf    Composite
 */
public class CompositeDemo {
    static void main(String[] args){
        Developer dev1=new Developer("Raj");
        Developer dev2=new Developer("Hind");
        Manager manager=new Manager();

        manager.add(dev1);
        manager.add(dev2);

        manager.showDetails();
    }
}

/*
1️⃣ What is the Composite Pattern?

The Composite Pattern is a Structural Design Pattern that lets you treat individual objects (Leaf) and groups of objects (Composite) in the same way.

In simple words:

It allows you to build tree-like structures where both single objects and collections of objects are handled using the same interface.

This pattern is extremely useful when dealing with hierarchical structures such as:

File systems (folders and files)

Organization structures (manager and employees)

UI components (panels containing buttons)

Menu systems (menus containing submenus)

2️⃣ Real-World Analogy

Consider a Company Organization Structure

CEO
 ├── Manager A
 │    ├── Developer 1
 │    └── Developer 2
 │
 └── Manager B
      ├── Developer 3
      └── Developer 4

Here:

Object	Type
Developer	Leaf
Manager	Composite
Employee Interface	Component

The key idea:

Both Manager and Developer are treated as Employees

So we can call:

employee.showDetails()

without worrying whether the object is:

a single developer

a manager containing developers

3️⃣ Core Components of Composite Pattern

There are three main parts.

1️⃣ Component (Common Interface)

This defines common behavior for both Leaf and Composite objects.

Example:

interface Employee {
    void showDetails();
}

This ensures that every object in the hierarchy behaves like an Employee.

Both:

Developer

Manager

implement this interface.

2️⃣ Leaf (Individual Object)

Leaf represents an individual object with no children.

Example:

class Developer implements Employee {

    private String name;

    public Developer(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Developer: " + name);
    }
}
Characteristics of Leaf

Cannot contain other objects

Implements component behavior

Represents end node of tree

Tree view:

Developer
   |
  (no children)
3️⃣ Composite (Group Object)

Composite represents objects that can contain other objects.

Example:

class Manager implements Employee {

    private List<Employee> employees = new ArrayList<>();

    public void add(Employee emp) {
        employees.add(emp);
    }

    public void showDetails() {

        for(Employee e : employees)
            e.showDetails();
    }
}
Characteristics of Composite

Stores child components

Can contain:

Leafs

Other Composites

Delegates operations to children

Tree view:

Manager
   |
   ├── Developer
   └── Developer
 */
